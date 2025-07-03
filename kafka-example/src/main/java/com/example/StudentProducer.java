package com.example;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentProducer {

    public static final String TOPIC = "students";

    public static void main(String[] args) throws Exception {

        System.out.println("*** Starting Student Producer ***");

        Properties settings = new Properties();

        settings.put("bootstrap.servers", "localhost:29092");
        settings.put("client.id", "student-producer");
        settings.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        settings.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        ObjectMapper mapper = new ObjectMapper();

        try (KafkaProducer<String, String> producer = new KafkaProducer<>(settings)) {
            for (int i = 1; i <= 10; i++) {
                final String key = "student-" + i;

                // Create a simple JSON string for the student
                String value = mapper.writeValueAsString(new Student(i, "Student " + i));

                System.out.println("### Sending student " + i + " ###");

                producer.send(new ProducerRecord<>(TOPIC, key, value));
            }
        }
    }
}

