package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.MessageClient;

@Repository("messageClientDao")
public class MessageClientDaoImpl extends AbstractDao<Integer, MessageClient> implements MessageClientDao {

	@Override
	public List<MessageClient> findAllMessages() {
		String requete = "select m " + "from MessageClient as m";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<MessageClient>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public MessageClient findMessageById(int id) {
		return getByKey(id);
	}

	@Override
	public void createMessage(MessageClient message) {
		save(message);
	}

	@Override
	public void deleteMessage(MessageClient message) {
		delete(getByKey((int) message.getIdDemande()));
	}

	@Override
	public void updateMessage(MessageClient message) {
		update(message);
	}
}