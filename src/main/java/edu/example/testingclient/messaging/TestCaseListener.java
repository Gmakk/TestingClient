package edu.example.testingclient.messaging;

import edu.example.testingclient.entities.TestCase;
import jakarta.jms.Destination;
import jakarta.jms.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Profile("jms-listener")
@Component
public class TestCaseListener {
    private Destination destination;

    public TestCaseListener(Destination destination) {
        this.destination = destination;
    }

    @JmsListener(destination = "testingSystem.case.queue")
    public void receiveTestCase(TestCase testCase) {
        System.out.println("Received test case: " + testCase);
    }
}
