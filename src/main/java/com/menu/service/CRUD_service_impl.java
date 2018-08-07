package com.menu.service;

import com.menu.dao.CRUD_dao;
import com.menu.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CRUD_service_impl implements CRUD_service {

    @Autowired
    CRUD_dao crud_dao;

    @Override
    public void saveOrUpdate(Category category) {
        crud_dao.saveOrUpdate(category);
    }

    @Override
    public void remove(Category category) {
        crud_dao.remove(category);
    }

    @Override
    public List<Category> getAll() {
        return crud_dao.getAll();
    }
}
