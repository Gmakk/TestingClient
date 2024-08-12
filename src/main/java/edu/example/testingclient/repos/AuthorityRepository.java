package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository
        extends CrudRepository<Authority, String> {
}