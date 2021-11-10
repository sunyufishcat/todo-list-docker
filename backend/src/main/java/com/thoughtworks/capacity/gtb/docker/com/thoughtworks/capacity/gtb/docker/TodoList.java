package com.thoughtworks.capacity.gtb.docker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author itutry
 * @create 2020-05-26_18:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TodoList")
public class TodoList {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "inputValue")
  private String inputValue;
  @Column(name = "isCompleted")
  private Boolean isCompleted;
}
