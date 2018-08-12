package com.menu.controller;

import com.menu.entity.Category;
import com.menu.service.CRUD_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class StartController {

    @Autowired
    private CRUD_service crud_service;

    private List<Category> categoryList = new ArrayList<>();
    private List<Category> categoryList2Level = new ArrayList<>();

    @GetMapping
    public String getStudentList(Model model) {


        model.addAttribute("category", categoryList);
        model.addAttribute("category2Level", categoryList2Level);

//        model.addAttribute("li", "<ul>\n" +
//                "<li><a href=\"#\"><i class=\"fa fa-home\"></i> Гдавная </a></li></ul>");
        return "index";
    }

    @GetMapping(value = "add")
    public String add(@RequestParam(name = "title") String title, HttpServletRequest req) {

        Category category = new Category(title);

        crud_service.saveOrUpdate(category);

        categoryList.add(category);

//        String title = req.getParameter("title");
//        req.setAttribute("add", "<ul><li><a href=\"/add\">" + title + "</a></li></ul>");
        return "redirect:/";
    }

    @GetMapping(value = "addCell")
    public String addCell(@RequestParam(name = "title") String title, HttpServletRequest req) {
        System.out.println("i am add");
        Category category = new Category(title);

        crud_service.saveOrUpdate(category);

        categoryList2Level.add(category);

//        String title = req.getParameter("title");
//        req.setAttribute("add", "<ul><li><a href=\"/add\">" + title + "</a></li></ul>");
        return "redirect:/";
    }


    @GetMapping(value = "/add/{id}/cat2Lev")
    public String getIdLastCell(@PathVariable("id") String id, HttpServletRequest req) {

        System.out.println(id);
//        String title = req.getParameter("title");
//        req.setAttribute("add", "<ul><li><a href=\"/add\">" + title + "</a></li></ul>");
        return "redirect:/";
    }
}
