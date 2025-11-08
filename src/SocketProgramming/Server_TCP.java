package SocketProgramming;

import java.io.*; // For InputStream, OutputStream, BufferedReader, PrintWriter
import java.net.*; // For ServerSocket, Socket

public class Server_TCP {

	public static void main(String[] args) {
		try {
			// Step 1: Create a ServerSocket that listens on port 5000
			ServerSocket serverSocket = new ServerSocket(5000);
			System.out.println("Server is waiting for clients...");

			// Step 2: Accept a client connection
			Socket socket = serverSocket.accept(); // Blocks until a client connects
			System.out.println("Client connected!");

			// Step 3: Create input and output streams
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Read messages
																									// from client
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // Send messages to client

			// Step 4: Read messages from client and respond
			String message;
			while ((message = in.readLine()) != null) {
				System.out.println("Client: " + message); // Print received message
				out.println("Server received: " + message); // Send acknowledgment to client

				if (message.equalsIgnoreCase("exit")) { // Stop communication if "exit" is received
					System.out.println("Client disconnected.");
					break;
				}
			}

			// Step 5: Close resources
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}