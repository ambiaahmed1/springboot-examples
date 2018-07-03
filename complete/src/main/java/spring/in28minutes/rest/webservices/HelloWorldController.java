package spring.in28minutes.rest.webservices;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {

    //GET
    //URI - /hello-world
    //method - "Hello World

    //1. Tell Spring that this is a controller
    //2. Method helloWorld() -> that returns the string "Hello World"
    //3. Map the request

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World";
    }

    //Alternatives but the same since they are defaulted:
    @RequestMapping(path = "/hello-world2", method = RequestMethod.GET)
    public String helloWorld2() {
        return "Hello World2";
    }

    //Also another way:
    @GetMapping(path = "/hello-world3")
    public String helloWorld3() {
        return "Hello World 3";
    }

    //hello-world-bean request
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    //hello-world-bean with path parameter
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World %s", name));
    }

    //Run application in debug mode to understand mode..
    //logging.level.org.spring=debug

    //Notes: A lot is happening above..
    // - What is dispatcher servlet?
    // - Who is configuring dispatcher servlet? - Spring Boot auto configuration
    // - What does dispatcher servlet do?
    // -How does the HelloWorldBean object get converted to JSON?

    // Mapping servlet: 'dispatcherServlet' to [/] - DispatcherServlet handles all the request
    // Whenever you type a URL to the browser, it goes to the dispatcherServlet
    // DispatcherServlet is the front controller of the Spring MVC framework
    // It knows the mapping to the correct method, which is the right controller to execute the request.
    // www.google.com -> GET request -> will look for the controller find the correct mapping and return the correct bean.
    // Once you have a bean it determines how to send response back. Converts the bean to JSON and returns the response back.

    //Practice writing the above 50 times for XP..
}
