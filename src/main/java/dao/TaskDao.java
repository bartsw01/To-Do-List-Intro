package dao;


import models.Task;

import java.util.List;

/**
 * Created by Guest on 8/15/17.
 */
public interface TaskDao {

    //create
    void add (Task task);
    //read
    List<Task> getAll();

    Task findById(int id);
    //update
    //  void update(int id, String content);
    //delete
//   void deleteTask();

//   void clearAllTasks();
}
