package com.jb.reactSpring.controller;



import com.jb.reactSpring.model.ToDo;
import com.jb.reactSpring.service.ToDoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    private ToDoService ts;

    @PostMapping("/getAllToDos")
    public List<ToDo> getAllToDos(){


        return ts.getAllToDos();
    }
}
