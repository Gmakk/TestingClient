//package edu.example.testingclient.messaging;
//
//
//import edu.example.testingclient.entities.TestCase;
//import jakarta.jms.Destination;
//import jakarta.jms.JMSException;
//import jakarta.jms.Message;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.support.converter.MessageConverter;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JmsTestCaseReceiver implements TestCaseReceiver {
//
//    private JmsTemplate jmsTemplate;
//    private MessageConverter converter;
//    private Destination destination;
//
//    public JmsTestCaseReceiver(JmsTemplate jmsTemplate, Destination destination, MessageConverter converter) {
//        this.jmsTemplate = jmsTemplate;
//        this.converter = converter;
//        this.destination = destination;
//    }
//    @Override
//    public TestCase receiveTestCase(){
//        return  (TestCase)jmsTemplate.receiveAndConvert(destination);
//    }
//}
