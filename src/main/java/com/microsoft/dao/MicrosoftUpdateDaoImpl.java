package com.microsoft.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.microsoft.entity.MicrosoftUpdate;
import com.microsoft.hibernate.session.CustomSessionFactory;

public class MicrosoftUpdateDaoImpl implements MicrosoftUpdateDao {

    private static MicrosoftUpdateDaoImpl instance = null;

    public static MicrosoftUpdateDaoImpl getInstance() {
	if (instance == null) {
	    instance = new MicrosoftUpdateDaoImpl();
	}
	return instance;
    }

    @Override
    public MicrosoftUpdate getById(Long id) throws Exception {
	try (Session session = CustomSessionFactory.getSession()) {
	    return getById(session, id);
	}
    }

    @Override
    @SuppressWarnings("unchecked")
    public MicrosoftUpdate getById(Session session, Long id) throws Exception {
	String hql = "from MicrosoftUpdate microsoftUpdate where id = :id";
	Query<MicrosoftUpdate> query = (Query<MicrosoftUpdate>) session.createQuery(hql);
	query.setParameter("id", id);

	return query.uniqueResult();
    }

    @Override
    public List<MicrosoftUpdate> list() throws Exception {
	try (Session session = CustomSessionFactory.getSession()) {
	    return list(session);
	}
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<MicrosoftUpdate> list(Session session) throws Exception {
	String hql = "from MicrosoftUpdate order by idMicrosoftUpdate";

	return (List<MicrosoftUpdate>) session.createQuery(hql).list();
    }

    @Override
    public void saveOrUpdate(MicrosoftUpdate entity) throws Exception {
	try (Session session = CustomSessionFactory.getSession()) {
	    Transaction transaction = session.beginTransaction();

	    saveOrUpdate(session, entity);

	    transaction.commit();
	}
    }

    @Override
    public void saveOrUpdate(Session session, MicrosoftUpdate entity) throws Exception {
	session.saveOrUpdate(entity);
    }

    @Override
    public void delete(MicrosoftUpdate entity) throws Exception {
	try (Session session = CustomSessionFactory.getSession()) {
	    Transaction transaction = session.beginTransaction();

	    delete(session, entity);

	    transaction.commit();
	}
    }

    @Override
    public void delete(Session session, MicrosoftUpdate entity) throws Exception {
	session.delete(entity);
    }

    @Override
    public MicrosoftUpdate getByIdMicrosoftUpdate(String idMicrosoftUpdate) {
	try (Session session = CustomSessionFactory.getSession()) {
	    ;
	    return getByIdMicrosoftUpdate(session, idMicrosoftUpdate);
	}
    }

    @Override
    @SuppressWarnings("unchecked")
    public MicrosoftUpdate getByIdMicrosoftUpdate(Session session, String idMicrosoftUpdate) {
	String hql = "from MicrosoftUpdate microsoftUpdate where idMicrosoftUpdate = :idMicrosoftUpdate";
	Query<MicrosoftUpdate> query = (Query<MicrosoftUpdate>) session.createQuery(hql);
	query.setParameter("idMicrosoftUpdate", idMicrosoftUpdate);

	return query.uniqueResult();
    }
}