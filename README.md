# RabbitMQ Message Producer
This project is a message producer that sends messages to a RabbitMQ queue. It is built using Java and the Spring framework.
Prerequisites
Before you can run this project, you need to have the following installed on your local machine:

1. Docker
2. RabbitMQ

## Getting Started
To get started with this project, follow the steps below:

1. Clone this repository to your local machine.
2. Navigate to the project directory.
3. Build the Docker image using the following command:
```
docker build -t rabbitmq-producer .
```
4. Run the Docker container using the following command:
```
docker run -p 9090:9090 rabbitmq-producer
```
This will start the RabbitMQ message producer project on port 9090.
Verify that the project is running by opening a web browser and navigating to http://localhost:9090/message/. 
Send a post request to the endpoint with the following attributes.
```
{
  "customerName": "John  Getch",
  "items": ["item1", "item2", "item3"],
  "total": 100.00
}
```

You should see a message indicating that the application is up and running. Then goto the RabbitMQ dashboard and see the order message on the queue.


## Configuration
The RabbitMQ connection details can be configured in the application.properties file located in the src/main/resources directory. You can modify the following properties to match your RabbitMQ instance:

```
spring.rabbitmq.host=<rabbitmq-host>
spring.rabbitmq.port=<rabbitmq-port>
spring.rabbitmq.username=<rabbitmq-username>
spring.rabbitmq.password=<rabbitmq-password>
```

## Contributing
If you would like to contribute to this project, please follow the steps below:

1. Fork this repository.
2. Create a new branch for your changes.
3. Make your changes and commit them to your branch.
4. Push your changes to your forked repository.
5. Submit a pull request to this repository.

## License
This project is licensed under the MIT License. See the LICENSE file for more information.