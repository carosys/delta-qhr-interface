package com.sdm.delta.qhr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Labels {
	
	String id;
	String name;
	String messageListVisibility;
	String labelListVisibility;
	String type;
	int messagesTotal;
	int messagesUnread;
	int threadsTotal;
	int threadsUnread;


}
