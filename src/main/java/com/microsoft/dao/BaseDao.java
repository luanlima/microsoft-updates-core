package com.microsoft.dao;

import java.util.List;

import org.hibernate.Session;

public interface BaseDao<E> {
    public E getById(Long id) throws Exception;

    public E getById(Session sessao, Long id) throws Exception;

    public List<E> list() throws Exception;

    public List<E> list(Session sessao) throws Exception;

    public void saveOrUpdate(E entity) throws Exception;

    public void saveOrUpdate(Session sessao, E entity) throws Exception;

    public void delete(E entity) throws Exception;

    public void delete(Session sessao, E entity) throws Exception;
}