import React, {FC, ReactElement, useContext, useEffect} from 'react';
import {dispatchContext} from '../Todos/Todos';
import ListItem from './ListItem';
import InputField from '../InputField/InputField';
import OverView from '../OverView/OverView';
import {toggleAll} from '../../actions/dispatcher';
import todoListApi from '../../actions/todoList';

const TodoList: FC = (): ReactElement => {
  const {todos, todosDispatch} = useContext(dispatchContext);

  useEffect(() => {
    async function fetchData() {
      const existTodos = await todoListApi.getTodoItem(1);
      todos.push(existTodos);
    }
    fetchData();
    console.log(todos);
  }, []);

  const handleAllToggle = (): void => {
    toggleAll(todosDispatch, todos);
  }

  return (todos.length ?
      <div>
        <section className="items">
          <InputField
            type="checkbox"
            id="toggle-all"
            checked={!todos.find(todoItem => !todoItem.isCompleted)}
            onClick={handleAllToggle}
            className="toggle-all"
            htmlFor="toggle-all"
          />
          <ul className="todo-list">
            {todos.map((todoItem, index) =>
              <ListItem key={index} todoItem={todoItem}/>
            )}
          </ul>
        </section>

        <OverView/>

      </div> : null
  ) as React.ReactElement<any, string | React.JSXElementConstructor<any>>
}
export default TodoList
