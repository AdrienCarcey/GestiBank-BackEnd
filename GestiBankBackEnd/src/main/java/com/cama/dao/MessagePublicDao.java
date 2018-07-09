package com.cama.dao;

import java.util.List;

import com.cama.model.MessagePublic;

public interface MessagePublicDao {
	
	List<MessagePublic> findAllMessages();
	
	MessagePublic findMessageById(int id);
	
	void createMessage(MessagePublic message);

	void deleteMessage(MessagePublic message);
	
	void updateMessage(MessagePublic message);
}