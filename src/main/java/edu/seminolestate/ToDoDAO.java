package edu.seminolestate;

import java.util.List;

public interface ToDoDAO {
    
    public void addTask (ToDo task);
    public List<ToDo> showTask();
    public void deleteTask (ToDo task);
    
}