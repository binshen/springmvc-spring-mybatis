package com.moral.controller;

import com.moral.model.Todo;
import com.moral.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    TodoService todoService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Map model) {

        List<Todo> todoList = todoService.selectTodoList();
        model.put("todoList", todoList);
        model.put("site_name", "TODO List");

        return "index";
    }
}
