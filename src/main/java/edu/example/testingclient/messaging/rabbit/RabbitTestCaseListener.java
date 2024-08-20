//package edu.example.testingclient.messaging.rabbit;
//
//import edu.example.testingclient.entities.TestCase;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitTestCaseListener {
//
//    @RabbitListener(queues = "general")
//    public void receiveTestCase(TestCase testCase) {
//        System.out.println("Test case: " + testCase);
//    }
//
//}
