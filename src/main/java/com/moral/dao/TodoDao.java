package com.moral.dao;

import com.moral.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("todoDao")
public interface TodoDao {

    public List<Todo> selectTodoList();
}
