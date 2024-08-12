package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScenarioRepository
        extends JpaRepository<Scenario, Integer> {
}