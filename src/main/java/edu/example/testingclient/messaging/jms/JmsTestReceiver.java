//package edu.example.testingclient.messaging;
//
//import edu.example.testingclient.entities.Test;
//import jakarta.jms.Destination;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.support.converter.MessageConverter;
//import org.springframework.stereotype.Component;
//
//@Component
//public class JmsTestReceiver {
//
//    private JmsTemplate jmsTemplate;
//    private MessageConverter converter;
//    private Destination destination;
//
//    public JmsTestReceiver(JmsTemplate jmsTemplate, Destination destination, MessageConverter converter) {
//        this.jmsTemplate = jmsTemplate;
//        this.converter = converter;
//        this.destination = destination;
//    }
//
//    public Test receiveTest(){
//        return  (Test)jmsTemplate.receiveAndConvert(destination);
//    }
//}