package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.MessagePublicDao;
import com.cama.model.MessagePublic;

@Service("messagePublicService")
@Transactional
public class MessagePublicServiceImpl implements MessagePublicService {

	@Autowired
	private MessagePublicDao messagePublicDAO;
	
	@Override
	public List<MessagePublic> findAllMessages() {
		return messagePublicDAO.findAllMessages();
	}

	@Override
	public MessagePublic findMessageById(int id) {
		return messagePublicDAO.findMessageById(id);
	}

	@Override
	public void createMessage(MessagePublic message) {
		messagePublicDAO.createMessage(message);
	}

	@Override
	public void deleteMessage(MessagePublic message) {
		messagePublicDAO.deleteMessage(message);
	}

	@Override
	public void updateMessage(MessagePublic message) {
		messagePublicDAO.updateMessage(message);
	}
}