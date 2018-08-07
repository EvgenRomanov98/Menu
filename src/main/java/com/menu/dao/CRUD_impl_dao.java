package com.menu.dao;

import com.menu.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CRUD_impl_dao implements CRUD_dao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveOrUpdate(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(category);
    }

    @Override
    public void remove(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(category);
    }

    @Override
    public List<Category> getAll() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM Category");
        return query.list();
    }
}
