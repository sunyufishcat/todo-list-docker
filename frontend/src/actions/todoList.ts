import axios, {AxiosResponse} from "axios";

const baseURL = 'http://localhost:8080';

const todoListApi = {
  getTodoItem: async(itemId: number) => {
    const response: AxiosResponse = await axios.get(`${baseURL}/todoList/${itemId}`);
    return response.data;
  }
}

export default todoListApi;