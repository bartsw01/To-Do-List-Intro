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
    //find by Id
    Task findById(int id);
    //update
    void update(int id, String content);
    //delete
   void deleteById(int id);

   void clearAllTasks();
}
