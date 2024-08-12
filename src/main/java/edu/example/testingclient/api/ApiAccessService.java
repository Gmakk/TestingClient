package edu.example.testingclient.api;

import edu.example.testingclient.entities.Authority;
import edu.example.testingclient.entities.TestCase;

public interface ApiAccessService {

    TestCase getTestCaseById(String id);

    void updateTestCase(TestCase testCase);

    void deleteTestCase(String id);

    Authority addAuthority(Authority authority);
}
