package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.MessagePublic;

@Repository("messagePublicDao")
public class MessagePublicDaoImpl extends AbstractDao<Integer, MessagePublic> implements MessagePublicDao {

	@Override
	@Transactional
	public List<MessagePublic> findAllMessages() {
		String requete = "select d " + "from Demande as d " + "where d.heritage = 'messagePublic'";
		Query query = getEntityManager().createQuery(requete);
		return (List<MessagePublic>) query.getResultList();
	}

	@Override
	@Transactional
	public MessagePublic findMessageById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createMessage(MessagePublic message) {
		save(message);
	}

	@Override
	@Transactional
	public void deleteMessage(MessagePublic message) {
		delete(getByKey((int) message.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateMessage(MessagePublic message) {
		update(message);
	}
}