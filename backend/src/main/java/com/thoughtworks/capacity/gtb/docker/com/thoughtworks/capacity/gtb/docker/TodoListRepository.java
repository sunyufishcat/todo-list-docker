package com.thoughtworks.capacity.gtb.docker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author itutry
 * @create 2020-05-26_18:27
 */
@Repository
public interface TodoListRepository extends CrudRepository<TodoList, Long> {

  TodoList findById(long id);
}
