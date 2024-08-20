package edu.example.testingclient.messaging.kafka;

import edu.example.testingclient.entities.TestCase;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestCaseListener {

    @KafkaListener(topics = "testingSystem")
    public void handle(TestCase testCase, ConsumerRecord<String, TestCase> record) {
        System.out.println("Received test case: " + testCase);
        System.out.println("partition: " + record.partition() + ", timestamp: " + record.timestamp());
    }
}
