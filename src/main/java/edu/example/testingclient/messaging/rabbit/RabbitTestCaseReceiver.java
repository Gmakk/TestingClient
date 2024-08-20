//package edu.example.testingclient.messaging.rabbit;
//
//import edu.example.testingclient.entities.TestCase;
//import edu.example.testingclient.messaging.TestCaseReceiver;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.support.converter.MessageConverter;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RabbitTestCaseReceiver implements TestCaseReceiver {
//    private RabbitTemplate rabbitTemplate;
//
//
//    public RabbitTestCaseReceiver(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    @Override
//    public TestCase receiveTestCase() {
//        return rabbitTemplate.receiveAndConvert(new ParameterizedTypeReference<TestCase>() {});
//    }
//}
