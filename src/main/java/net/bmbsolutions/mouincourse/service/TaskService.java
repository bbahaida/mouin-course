package net.bmbsolutions.mouincourse.service;

import net.bmbsolutions.mouincourse.entity.Task;
import net.bmbsolutions.mouincourse.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
}
