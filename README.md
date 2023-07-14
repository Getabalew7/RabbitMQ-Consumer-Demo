# RabbitMQ Message Consumer
This project is a message consumer that listens to a RabbitMQ queue and processes messages as they arrive. It is built using Java and the Spring framework.
Prerequisites 

Before you can run this project, you need to have the following installed on your local machine:

1. Docker 
2. RabbitMQ

## Getting Started
To get started with this project, follow the steps below:

1.  Clone this repository to your local machine.
2. Navigate to the project directory.

3. Build the Docker image using the following command:
```
    docker build -t rabbitmq-consumer .
```
4. Run the Docker container using the following command:
```
docker run -p 9091:9091 rabbitmq-consumer
```

This will start the RabbitMQ message consumer project on port 9091.

## Configuration
The RabbitMQ connection details can be configured in the application.properties file located in the src/main/resources directory. You can modify the following properties to match your RabbitMQ instance:
```
spring.rabbitmq.host=<rabbitmq-host>
spring.rabbitmq.port=<rabbitmq-port>
spring.rabbitmq.username=<rabbitmq-username>
spring.rabbitmq.password=<rabbitmq-password>
```
Contributing
If you would like to contribute to this project, please follow the steps below:

1. Fork this repository.
2. Create a new branch for your changes.
3. Make your changes and commit them to your branch.
4. Push your changes to your forked repository.
5. Submit a pull request to this repository.

## License
This project is licensed under the MIT License. See the LICENSE file for more information.