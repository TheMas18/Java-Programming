package SocketProgramming;

import java.net.*; // Import required networking classes

public class UDPServer {
	public static void main(String[] args) {
		try {
			// Step 1: Create a DatagramSocket on a specific port
			DatagramSocket serverSocket = new DatagramSocket(6000); // Listening on port 6000
			System.out.println("UDP Server is running...");

			byte[] receiveBuffer = new byte[1024]; // Buffer to store incoming data

			while (true) { // Server runs indefinitely
				// Step 2: Prepare a packet to receive data
				DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);

				// Step 3: Receive data from the client
				serverSocket.receive(receivePacket); // Blocks until data is received

				// Step 4: Extract the received message
				String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
				System.out.println("Client: " + receivedMessage);

				// Step 5: Prepare response to send back
				String response = "Server received: " + receivedMessage;
				byte[] responseBuffer = response.getBytes();

				// Step 6: Send response back to the client
				InetAddress clientAddress = receivePacket.getAddress(); // Get client IP
				int clientPort = receivePacket.getPort(); // Get client port
				DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length, clientAddress,
						clientPort);

				serverSocket.send(responsePacket); // Send response to client
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}