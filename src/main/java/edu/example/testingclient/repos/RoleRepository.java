package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository
        extends JpaRepository<Role, String> {
}