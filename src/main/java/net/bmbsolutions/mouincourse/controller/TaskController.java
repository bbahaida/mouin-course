package net.bmbsolutions.mouincourse.controller;


import net.bmbsolutions.mouincourse.entity.Task;
import net.bmbsolutions.mouincourse.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getTasks() {
        return taskService.findAll();
    }

    @PostMapping
    public Task saveTask(@RequestBody Task task) {
        return taskService.save(task);
    }

    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteById(id);
    }

    @PutMapping("{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return taskService.save(task);
    }

}
