package net.bmbsolutions.mouincourse.repository;

import net.bmbsolutions.mouincourse.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByDescription(String description);
}
