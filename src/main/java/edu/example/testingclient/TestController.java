package edu.example.testingclient;

import edu.example.testingclient.api.ApiAccessService;
import edu.example.testingclient.entities.Authority;
import edu.example.testingclient.entities.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    ApiAccessService apiAccessService;

    @GetMapping
    public String index() {

        String id = "2";

        //deleteTestCase(id);

        TestCase testCase = apiAccessService.getTestCaseById(id);
        testCase.setId(Integer.parseInt(id));
        testCase.setDescription("This is a new description");

        apiAccessService.updateTestCase(testCase);

        Authority authority = new Authority();
        authority.setName("ROLE_NEWTEST");
        apiAccessService.addAuthority(authority);

        System.out.println(testCase);
        return "home";
    }
}
