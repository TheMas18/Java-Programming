package DSA.HashMap;

import java.util.*;

public class Practice<K, V> {

	ArrayList<LinkedList<Entity>> list;
	private int size = 0;
	private float lf = 0.5f;

	Practice() {
		list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new LinkedList<>());
		}
	}

	class Entity {
		K key;
		V value;

		Entity(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	private void put(K key, V value) {
		int hash = Math.abs(key.hashCode() % list.size());
		LinkedList<Entity> entities = list.get(hash);
		for (Entity entity : entities) {
			if (entity.key.equals(key)) {
				entity.value = value;
			}
		}
		if ((float) (size) / list.size() > lf) {
			rehash();
		}

		entities.add(new Entity(key, value));
		size++;

	}

	private void rehash() {
		ArrayList<LinkedList<Entity>> old = list;
		list = new ArrayList<>();
		size = 0;
		for (int i = 0; i < old.size() * 2; i++) {
			list.add(new LinkedList<>());
		}

		for (LinkedList<Entity> entries : old) {
			for (Entity entity : entries) {
				put(entity.key, entity.value);
			}
		}
	}

	private V get(K key) {
		int hash = Math.abs(key.hashCode() % list.size());
		LinkedList<Entity> entities = list.get(hash);
		for (Entity entity : entities) {
			if (entity.key.equals(key)) {
				return entity.value;
			}
		}
		return null;
	}
}

/*
 * Exp Alright, let’s go **step by step** and **think out loud** to understand
 * this **custom HashMap implementation**.
 * 
 * The goal is to build a **HashMap** using an **ArrayList of LinkedLists** to
 * store key-value pairs efficiently.
 * 
 * ---
 * 
 * ## **🔹 What Problem Are We Solving?** ### **Why Do We Need a HashMap?** -
 * Imagine you have **millions of key-value pairs** (like a dictionary). - If we
 * store them in an **ArrayList**, searching will take **O(N) time** (very
 * slow!). - We need a **fast way to find a value given a key**.
 * 
 * ### **How Does Hashing Help?** - Instead of searching through **all
 * elements**, we use a **hash function** to quickly compute an **index** where
 * the key should be stored. - This allows **O(1) average time complexity** for
 * insert, delete, and search operations.
 * 
 * ---
 * 
 * ## **🔹 Core Idea of This Implementation** We are using **Separate Chaining
 * (LinkedList)** to handle collisions. 1. **An ArrayList of LinkedLists**
 * stores key-value pairs. 2. **Each LinkedList stores multiple key-value
 * pairs** if they have the same hash index (collision handling). 3. **We resize
 * the HashMap dynamically (rehashing)** when it gets too full to prevent
 * performance issues.
 * 
 * ---
 * 
 * ## **🔹 Step-by-Step Breakdown of Code** ### **1️⃣ Creating the HashMap**
 * ```java ArrayList<LinkedList<Entity>> list; private int size = 0; private
 * float lf = 0.5f; ``` ### **What’s Happening?** - **`list`** → Stores
 * LinkedLists (each LinkedList contains key-value pairs). - **`size`** → Tracks
 * number of key-value pairs. - **`lf` (Load Factor)** → If `size / list.size()
 * > 0.5`, we **double the size**.
 * 
 * ### **2️⃣ Constructor: Initializing the HashMap** ```java public
 * MapUsingLinkedList() { list = new ArrayList<>(); for(int i=0; i < 10; i++) {
 * list.add(new LinkedList<>()); } } ``` ### **Why Are We Doing This?** -
 * Creates **10 empty LinkedLists** inside an `ArrayList`. - This is our
 * **starting storage**.
 * 
 * ---
 * 
 * ## **🔹 Inserting Key-Value Pairs (`put(K key, V value)`)** ```java public
 * void put(K key, V value) { int hash = Math.abs(key.hashCode() % list.size());
 * LinkedList<Entity> entities = list.get(hash);
 * 
 * for (Entity entity : entities) { if (entity.key.equals(key)) { entity.value =
 * value; return; } }
 * 
 * if ((float) (size) / list.size() > lf) { reHash(); }
 * 
 * entities.add(new Entity(key, value)); size++; } ``` ### **Thinking Process:**
 * 1. **Compute Hash:** - We **convert the key into an integer index** using:
 * ```java int hash = Math.abs(key.hashCode() % list.size()); ``` - This ensures
 * the key is stored in a **predictable location** in `list`.
 * 
 * 2. **Handle Duplicates:** - We check if the key **already exists**. - If it
 * does, we **update the value**.
 * 
 * 3. **Check Load Factor (Rehashing Condition):** - If the HashMap is too
 * **full** (`size / list.size() > 0.5`), we **double the size**.
 * 
 * 4. **Insert New Key-Value Pair:** - Add the **new key-value pair** to the
 * LinkedList at that index.
 * 
 * ---
 * 
 * ## **🔹 Rehashing (Expanding the HashMap)** ```java private void reHash() {
 * System.out.println("We are now rehashing!");
 * 
 * ArrayList<LinkedList<Entity>> old = list; list = new ArrayList<>(); size = 0;
 * 
 * for (int i = 0; i < old.size() * 2; i++) { list.add(new LinkedList<>()); }
 * 
 * for (LinkedList<Entity> entries : old) { for (Entity entry : entries) {
 * put(entry.key, entry.value); } } } ``` ### **Why Are We Doing This?** - If
 * the load factor **exceeds 0.5**, we **double the size** to **reduce
 * collisions**. - **How?** 1. Create a **new, larger ArrayList**. 2. Copy all
 * **existing key-value pairs** into the new structure. 3. This ensures a
 * **better distribution of elements**.
 * 
 * ---
 * 
 * ## **🔹 Retrieving a Value (`get(K key)`)** ```java public V get(K key) { int
 * hash = Math.abs(key.hashCode() % list.size()); LinkedList<Entity> entities =
 * list.get(hash);
 * 
 * for (Entity entity : entities) { if (entity.key.equals(key)) { return
 * entity.value; } } return null; } ``` ### **Thinking Process:** 1. Compute the
 * **hash index** where the key should be. 2. Scan the **LinkedList** at that
 * index. 3. If found, **return the value**; otherwise, return `null`.
 * 
 * ---
 * 
 * ## **🔹 Removing a Key (`remove(K key)`)** ```java public void remove(K key)
 * { int hash = Math.abs(key.hashCode() % list.size()); LinkedList<Entity>
 * entities = list.get(hash);
 * 
 * Entity target = null; for (Entity entity : entities) { if
 * (entity.key.equals(key)) { target = entity; break; } }
 * 
 * entities.remove(target); size--; } ``` ### **Why This Works:** - Finds the
 * **hash index** for the key. - Scans the **LinkedList** at that index. -
 * **Removes** the key-value pair and **updates `size`**.
 * 
 * ---
 * 
 * ## **🔹 Checking If a Key Exists (`containsKey(K key)`)** ```java public
 * boolean containsKey(K key) { return get(key) != null; } ``` - Calls `get()`,
 * if it returns **non-null**, the key exists.
 * 
 * ---
 * 
 * ## **🔹 Converting HashMap to a String (`toString()`)** ```java
 * 
 * @Override public String toString() { StringBuilder builder = new
 * StringBuilder(); builder.append("{"); for (LinkedList<Entity> entities :
 * list) { for (Entity entity : entities) { builder.append(entity.key);
 * builder.append(" = "); builder.append(entity.value); builder.append(" , "); }
 * } builder.append("}"); return builder.toString(); } ``` ### **How It Works:**
 * - Loops through **all LinkedLists** in the `list`. - Converts each key-value
 * pair into a **string format**.
 * 
 * ---
 * 
 * ## **🔹 Summary** ✅ **How Does This Work?** 1. **Hashing:** Uses `hashCode()
 * % list.size()` to map keys to indices. 2. **Collision Handling:** Uses
 * **LinkedLists** at each index. 3. **Rehashing:** Doubles size when load
 * factor exceeds **0.5**. 4. **Operations:** - `put(K, V)`: Insert or update
 * key-value pair. - `get(K)`: Retrieve value for a key. - `remove(K)`: Delete a
 * key-value pair. - `containsKey(K)`: Check if a key exists.
 * 
 * ---
 * 
 * ## **🚀 Final Takeaway** This **mimics how Java’s `HashMap` works
 * internally**! - It uses **hashing** for **fast lookups**. - It **handles
 * collisions** using **Separate Chaining (LinkedLists)**. - It **automatically
 * resizes** when needed.
 * 
 * By understanding **this implementation**, you will **never struggle** with
 * HashMaps in coding interviews! 🚀
 * 
 *
 */