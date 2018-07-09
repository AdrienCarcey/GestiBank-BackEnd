package com.cama.service;

import java.util.List;

import com.cama.model.MessageClient;

public interface MessageClientService {
	
	List<MessageClient> findAllMessages();
	
	MessageClient findMessageById(int id);
	
	void createMessage(MessageClient message);

	void deleteMessage(MessageClient message);
	
	void updateMessage(MessageClient message);
}