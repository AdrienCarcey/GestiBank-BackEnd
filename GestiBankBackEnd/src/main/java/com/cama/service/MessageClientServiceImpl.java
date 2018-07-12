package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.MessageClientDao;
import com.cama.model.MessageClient;

@Service("messageClientService")
@Transactional
public class MessageClientServiceImpl implements MessageClientService {

	@Autowired
	private MessageClientDao messageClientDAO;
	
	@Override
	public List<MessageClient> findAllMessages() {
		return messageClientDAO.findAllMessages();
	}

	@Override
	public MessageClient findMessageById(int id) {
		return messageClientDAO.findMessageById(id);
	}

	@Override
	public void createMessage(MessageClient message) {
		messageClientDAO.createMessage(message);
	}

	@Override
	public void deleteMessage(MessageClient message) {
		messageClientDAO.deleteMessage(message);
	}

	@Override
	public void updateMessage(MessageClient message) {
		messageClientDAO.updateMessage(message);
	}
}