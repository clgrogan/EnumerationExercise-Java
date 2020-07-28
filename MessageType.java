package com.enumexercise;

public enum MessageType {
	A("HIGH"),B("MEDIUM"),C("LOW"),D("LOW");
	
	private String priority;

	// Constructor
	private MessageType(String priority) {
		this.priority = priority;
	}
	
	//Getter Method for Priority of Message Type
	public Priority getPriority() {
		return Priority.valueOf(this.priority);
	}
}
