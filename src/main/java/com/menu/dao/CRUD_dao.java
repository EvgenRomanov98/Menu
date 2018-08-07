package com.menu.dao;

import com.menu.entity.Category;

import java.util.List;

public interface CRUD_dao {

    public void saveOrUpdate(Category category);
    public void remove(Category category);
    public List<Category> getAll();

}
