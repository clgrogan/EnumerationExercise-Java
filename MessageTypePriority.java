package com.enumexercise;

import java.util.Scanner;
//	Exercise to implement console program which will meet the following requirements:
//	1.	Program starts and ask user to enter message type
//	2.	Only 'A', 'B', 'C' or 'D' message types are allowed.
//	3.	In case user entered invalid message type, program asks to enter message type again
//	4.	When valid message type is entered program prints message type priority to console
//	5.	Priority and Message Type implemented as enum types
//	6.	Message types have these priorities:
//		Message Type Priority
//			A  HIGH
//			B  MEDIUM
//			C  LOW
//			D  LOW
//	MessageType enum must have this method:
//		public Priority getPriorityf) {
//			<write your code here>
//		}
public class MessageTypePriority {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check priority: ");
			String userInput = sc.next();
			if (userInput.equalsIgnoreCase("exit")) break;
			if (isValidMessageType(userInput)) {
				System.out.println(MessageType.valueOf(userInput).getPriority() + "\n");
				continue;
			} else {
				System.out.println("Please, enter valid " + "message type. Only 'A', 'B', 'C' or 'D' are allowed" 
						+ "\n\t'exit' to terminate the program");
				continue;
			}
		}
	}

	private static boolean isValidMessageType(String userInput) {
		for (MessageType type : MessageType.values()) {
			if (type.name().equals(userInput))
				return true;
		}
		return false;
	}

}
