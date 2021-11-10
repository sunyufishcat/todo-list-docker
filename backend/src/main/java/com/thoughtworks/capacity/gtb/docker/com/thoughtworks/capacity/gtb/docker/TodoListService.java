package com.thoughtworks.capacity.gtb.docker;

import org.springframework.stereotype.Service;

/**
 * @author itutry
 * @create 2020-05-26_18:28
 */
@Service
public class TodoListService {

  private final TodoListRepository todoListRepository;

  public TodoListService(TodoListRepository todoListRepository) {
    this.todoListRepository = todoListRepository;
  }

  public TodoList getTodoListById(long id) {
    return todoListRepository.findById(id);
  }
}
