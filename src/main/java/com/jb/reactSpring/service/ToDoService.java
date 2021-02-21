package com.jb.reactSpring.service;


import com.jb.reactSpring.model.ToDo;
import com.jb.reactSpring.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository tr;

    public List<ToDo> getAllToDos(){
        int t = 2+1;
        return tr.findAll();
    }
}
