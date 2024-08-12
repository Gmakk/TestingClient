package edu.example.testingclient.repos;


import edu.example.testingclient.entities.Role;
import edu.example.testingclient.entities.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface UserRepository
        extends JpaRepository<Userr, Integer> {

    List<Userr> findByLogin(String login);

    List<Userr> findByRole(Role role);

    @Transactional
    void deleteByIsActive(Boolean isActive);

    @Transactional
    void deleteByRole(Role role);
}