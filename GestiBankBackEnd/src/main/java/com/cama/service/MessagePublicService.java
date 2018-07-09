package com.cama.service;

import java.util.List;

import com.cama.model.MessagePublic;

public interface MessagePublicService {

	List<MessagePublic> findAllMessages();
	
	MessagePublic findMessageById(int id);
	
	void createMessage(MessagePublic message);

	void deleteMessage(MessagePublic message);
	
	void updateMessage(MessagePublic message);
}