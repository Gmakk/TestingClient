package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Project;
import edu.example.testingclient.entities.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RequirementRepository
        extends JpaRepository<Requirement, Integer> {

    List<Requirement> findByProject(Project project);
}