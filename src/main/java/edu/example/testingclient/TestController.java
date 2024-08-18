package edu.example.testingclient;

import edu.example.testingclient.api.ApiAccessService;
import edu.example.testingclient.entities.Authority;
import edu.example.testingclient.entities.Test;
import edu.example.testingclient.entities.TestCase;
import edu.example.testingclient.messaging.JmsTestCaseReceiver;
import edu.example.testingclient.messaging.TestReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")
public class TestController {

//    @Autowired
//    private ApiAccessService apiAccessService;
//    @Autowired
//    TestReceiver testReceiver;
    @Autowired
    JmsTestCaseReceiver jmsTestCaseReceiver;

    @GetMapping
    public String index() {
        TestCase testCase = jmsTestCaseReceiver.receiveTestCase();

        //Test test = testReceiver.receiveTest();
        System.out.println("Test case: " + testCase);
//        String id = "2";
//
//        //deleteTestCase(id);
//
//        TestCase testCase = apiAccessService.getTestCaseById(id);
//        testCase.setId(Integer.parseInt(id));
//        testCase.setDescription("This is a new description");
//
//        apiAccessService.updateTestCase(testCase);
//
//        Authority authority = new Authority();
//        authority.setName("ROLE_NEWTEST");
//        apiAccessService.addAuthority(authority);
//
//        System.out.println(testCase);
        return "home";
    }
}
