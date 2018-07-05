package spring.in28minutes.rest.jpa_course.webservices;

public class Notes {

    //What is a web service?
    //1. Web service is application-to-application interaction
    //2. Should be platform independent
    //3. Should allow communication over a network

    //How does data exchange between applications take place?
    //1. RestWebServicesApplication A -> Requests -> Web Service (input)
    //2. RestWebServicesApplication A <- Response <- Web Service (output)

    //How does application A know what request to send where to send and what is the format of the resposne?
    // Service Definition -
        //Request/Response format - XML/JSON
        //Request Structure
        //Response Structure
        //Endpoint

    //Key Terminology -
        //Request and Response
        //Message Exchange Format -
            //XML and JSON

        //Service Provider - one which hosts the web-service
        //Service Consumer - consumes the web-service (Using the Service)
        //Service Definition - is the contract between the Service Provider and Consumer.
            //Example:
                //Request/Response Format - XML? JSON?
                //Request Structure
                //Response Structure
                //Endpoint

        //Transport - how the service is exposed - HTTP? MQ?
                    //HTTP and MQ

        //WEB Service Groups
            //SOAP-Based
            //REST-Styled

        //SOAP - Simple Object Access Protocol -> request and response, it is a specific way of building web-services
            //1. Uses XML only
            //2. Specific XML request and response structure
            //3. Example:
                //SOAP-ENV: Envelope
                //Header -
                //Body -
            //Format:
                //SOAP XML Request
                //SOAP XML Response
            //Transport:
                //SOAP over MQ
                //SOAP over HTTP
            //Service Definition
                //WSDL:
                    //1. Endpoint
                    //2. All operations allowed
                    //3. Request structure
                    //4. Response structure

            //REST - REpresentational State Transfer
            //HTTP -

    //REST VS SOAP -
        // Restrictions vs Architectural approach
        // Data Exchange Format
        // Transport
        // Ease of implementation


    //https://www.udemy.com/microservices-with-spring-boot-and-spring-cloud/learn/v4/t/lecture/8004660?start=0
        //HTTP Request Methods
        //GET
        //POST
        //DELETE
        //HTTP Response Status
        //200
        //400
        //404
        //Versioning
        //Swagger
        //Filtering
        //Monitoring
        //Content Negotiation
        //Internalization
        //Spring
        //Spring Boot
        //JPA
        //Maven
        //Postman

        //1. Spring Cloud Config Server and Bus
        //2. Load Balancing with Ribbon and Feign
        //3. Implement Naming Server with Eureka
        //4. Implementing API Gateway with Zuul
        //5. Distributed tracing with Zipkin
        //6. Fault Tolerance with Hystrix

}
