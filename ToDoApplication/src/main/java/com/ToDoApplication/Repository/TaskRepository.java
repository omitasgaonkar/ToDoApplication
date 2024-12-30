package com.ToDoApplication.Repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ToDoApplication.Entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}

