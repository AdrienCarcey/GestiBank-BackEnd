package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.MessageClient;

@Repository("messageClientDao")
public class MessageClientDaoImpl extends AbstractDao<Integer, MessageClient> implements MessageClientDao {

	@Override
	@Transactional
	public List<MessageClient> findAllMessages() {
		String requete = "select m " + "from MessageClient as m";
		Query query = getEntityManager().createQuery(requete);
		return (List<MessageClient>) query.getResultList();
	}

	@Override
	@Transactional
	public MessageClient findMessageById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createMessage(MessageClient message) {
		save(message);
	}

	@Override
	@Transactional
	public void deleteMessage(MessageClient message) {
		delete(getByKey((int) message.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateMessage(MessageClient message) {
		update(message);
	}
}