# KAFKA-EX-03
i2i Systems Internship Exercise

I set up a Kafka environment using Docker with Zookeeper and Kafka brokers, configured my Java project with Maven to include Kafka client and Jackson dependencies, and implemented a StudentProducer class that serializes and sends JSON-formatted student data to a Kafka topic named “students.” I also developed a corresponding StudentConsumer class that connects to the Kafka broker, subscribes to the “students” topic, and continuously polls for messages, printing each student’s offset, key, and JSON data to the console. I ran the producer to publish messages and then ran the consumer to read and display these messages, verifying end-to-end Kafka message production and consumption using your Java application.
