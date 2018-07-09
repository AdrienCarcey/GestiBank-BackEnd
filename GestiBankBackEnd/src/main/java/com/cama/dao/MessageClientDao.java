package com.cama.dao;

import java.util.List;

import com.cama.model.MessageClient;

public interface MessageClientDao {
	
	List<MessageClient> findAllMessages();
	
	MessageClient findMessageById(int id);
	
	void createMessage(MessageClient message);

	void deleteMessage(MessageClient message);
	
	void updateMessage(MessageClient message);
}