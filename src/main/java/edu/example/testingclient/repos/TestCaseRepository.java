package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Project;
import edu.example.testingclient.entities.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestCaseRepository
        extends JpaRepository<TestCase, Integer> {

    List<TestCase> findByProject(Project project);
}