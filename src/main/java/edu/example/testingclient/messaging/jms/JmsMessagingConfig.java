//package edu.example.testingclient.messaging;
//
//import edu.example.testingclient.entities.*;
//import jakarta.jms.Destination;
//import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
//import org.springframework.jms.support.converter.MessageType;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class JmsMessagingConfig {
//
//    @Bean
//    public Destination testCaseQueue(){
//        return new ActiveMQQueue("testingSystem.case.queue");
//    }
//
//    @Bean
//    public MappingJackson2MessageConverter messageConverter() {
//        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
//        messageConverter.setTypeIdPropertyName("_typeId");
//
//        messageConverter.setTargetType(MessageType.TEXT);
//
//        Map<String, Class<?>> typeIdMappings = new HashMap<String, Class<?>>();
//        typeIdMappings.put("test", Test.class);
//
//        typeIdMappings.put("testCase", TestCase.class);
//        typeIdMappings.put("authority", Authority.class);
//        typeIdMappings.put("requirement", Project.class);
//        typeIdMappings.put("role", Role.class);
//        typeIdMappings.put("scenario", Scenario.class);
//        typeIdMappings.put("scenarioCaseConnection", ScenarioCaseConnection.class);
//        typeIdMappings.put("testPlan", TestPlan.class);
//        typeIdMappings.put("user", Userr.class);
//        messageConverter.setTypeIdMappings(typeIdMappings);
//
//        return messageConverter;
//    }
//}
