package com.menu.config;

import com.menu.service.CRUD_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InitDataToDb {

//    @Autowired
//    private CRUD_service crud_service;

    @PostConstruct
    private void init() {

//        ArrayList<Cell> cells = new ArrayList<>();
//        cells.add(new Cell("1c"));
//        cells.add(new Cell("2c"));
//        cells.add(new Cell("3c"));
//        Category category = new Category();
//        category.setTitle("t1");
//        category.setCellList(cells);
//
//        crud_service.saveOrUpdate(category);
    }

}
