package com.microsoft.dao;

import java.util.List;

import org.hibernate.Session;

import com.microsoft.entity.MicrosoftUpdate;

public interface MicrosoftUpdateDao extends BaseDao<MicrosoftUpdate> {
    public MicrosoftUpdate getById(Long id) throws Exception;

    public MicrosoftUpdate getById(Session session, Long id) throws Exception;

    public List<MicrosoftUpdate> list() throws Exception;

    public List<MicrosoftUpdate> list(Session session) throws Exception;

    public void saveOrUpdate(MicrosoftUpdate entity) throws Exception;

    public void saveOrUpdate(Session session, MicrosoftUpdate entity) throws Exception;

    public void delete(MicrosoftUpdate entity) throws Exception;

    public void delete(Session session, MicrosoftUpdate entity) throws Exception;

    public MicrosoftUpdate getByIdMicrosoftUpdate(String idMicrosoftUpdate);

    public MicrosoftUpdate getByIdMicrosoftUpdate(Session session, String idMicrosoftUpdate);
}