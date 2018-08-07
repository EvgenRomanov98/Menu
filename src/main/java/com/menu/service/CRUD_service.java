package com.menu.service;

import com.menu.entity.Category;

import java.util.List;

public interface CRUD_service {

    public void saveOrUpdate(Category category);
    public void remove(Category category);
    public List<Category> getAll();

}
