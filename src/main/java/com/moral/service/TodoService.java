package com.moral.service;


import com.moral.dao.TodoDao;
import com.moral.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("todoService")
public class TodoService {

    @Autowired
    @Qualifier("todoDao")
    private TodoDao todoDao;

    public List<Todo> selectTodoList() {
        return todoDao.selectTodoList();
    }
}
