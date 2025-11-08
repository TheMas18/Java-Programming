package SocketProgramming;

import java.io.*; // For InputStream, OutputStream, BufferedReader, PrintWriter
import java.net.*; // For Socket

public class Client_TCP {

	public static void main(String[] args) {
		try {
			// Step 1: Connect to the server at localhost on port 5000
			Socket socket = new Socket("localhost", 5000);
			System.out.println("Connected to server!");

			// Step 2: Create input and output streams
			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)); // Read user input from
																								// console
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Send messages to server
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Read messages
																									// from server

			// Step 3: Keep sending messages to the server
			String message;
			while (true) {
				System.out.print("You: ");
				message = userInput.readLine(); // Read input from user
				out.println(message); // Send message to server

				if (message.equalsIgnoreCase("exit")) { // Stop communication if "exit" is typed
					System.out.println("Closing connection...");
					break;
				}

				// Read server response
				System.out.println("Server: " + in.readLine());
			}

			// Step 4: Close resources
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
