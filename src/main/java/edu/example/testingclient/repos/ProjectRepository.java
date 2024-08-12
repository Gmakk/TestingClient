package edu.example.testingclient.repos;

import edu.example.testingclient.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository
        extends JpaRepository<Project, String> {
}