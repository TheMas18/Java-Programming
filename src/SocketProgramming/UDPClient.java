package SocketProgramming;

import java.net.*;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket clientSocket = new DatagramSocket(); // Step 1: Create client socket
			InetAddress serverAddress = InetAddress.getByName("localhost"); // Step 2: Get server IP

			Scanner scanner = new Scanner(System.in);

			while (true) {
				// Step 3: Read user input
				System.out.print("You: ");
				String message = scanner.nextLine();

				// Convert message to bytes and send it to server
				byte[] sendBuffer = message.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, serverAddress, 6000);
				clientSocket.send(sendPacket); // Step 4: Send data to server

				// Stop communication if user types "exit"
				if (message.equalsIgnoreCase("exit"))
					break;

				// Step 5: Prepare to receive response from server
				byte[] receiveBuffer = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
				clientSocket.receive(receivePacket); // Step 6: Receive server response

				// Step 7: Extract response message
				String serverResponse = new String(receivePacket.getData(), 0, receivePacket.getLength());
				System.out.println("Server: " + serverResponse);
			}

			clientSocket.close(); // Step 8: Close the socket
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}