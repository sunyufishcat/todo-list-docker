package com.thoughtworks.capacity.gtb.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itutry
 * @create 2020-05-26_18:30
 */
@RestController
public class TodoListController {

  private final TodoListService todoListService;

  public TodoListController(TodoListService todoListService) {
    this.todoListService = todoListService;
  }

  @GetMapping("/todoList/{id}")
  public TodoList getTodoListById(@PathVariable("id") long id) {
    return todoListService.getTodoListById(id);
  }

}
