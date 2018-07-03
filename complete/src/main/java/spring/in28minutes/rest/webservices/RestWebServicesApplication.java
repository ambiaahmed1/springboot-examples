package spring.in28minutes.rest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebServicesApplication {

    //RESTful Web Services

    //Social Media RestWebServicesApplication

    //User ->Posts

    //Retrieve all users        -GET /users
    //Create a User             -POST /users
    //Retrieve one User         -GET /users/{id} -> /users/1
    //Delete a User             -DELETE /users/{id} -> /users/1

    //Retrieve all posts for a User     - GET /users/{id]/posts
    //Create a posts for a User         - POST /users/{id}/posts
    //Retrieve details of a post        - GET /users/{id}/posts/{post_id}

    public static void main(String[] args) {
        SpringApplication.run(RestWebServicesApplication.class, args);
    }
}