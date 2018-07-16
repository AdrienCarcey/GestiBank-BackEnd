package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.MessagePublic;

@Repository("messagePublicDao")
public class MessagePublicDaoImpl extends AbstractDao<Integer, MessagePublic> implements MessagePublicDao {

	@Override
	public List<MessagePublic> findAllMessages() {
		String requete = "select m " + "from MessagePublic as m";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<MessagePublic>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public MessagePublic findMessageById(int id) {
		return getByKey(id);
	}

	@Override
	public void createMessage(MessagePublic message) {
		save(message);
	}

	@Override
	public void deleteMessage(MessagePublic message) {
		delete(getByKey((int) message.getIdDemande()));
	}

	@Override
	public void updateMessage(MessagePublic message) {
		update(message);
	}
}