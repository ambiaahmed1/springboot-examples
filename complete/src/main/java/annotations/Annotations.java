package annotations;

public class Annotations {

    //@SpringBootApplication - is a convenience annotation that adds all the following:
            //  1.@Configuration - tags the class as a source of bean definitions for the application context.
            //  2.@EnableAutoConfiguration - tells Spring Boot to start adding beans based on classpath settings, other beans, and various
            //  property settings.
            //  3.@EnableWebMvs - Normally you would add this for a Spring MVC app, but Spring Boot adds it automatically
            //  when it sees spring-webmvs on the classpath. This flags the application as a web application and activates key behaviors such as setting up
            //  DispatcherServlet.
            //  @ComponentScan tells Spring to look for other components, configurations, and services in the package, allowing it to find the controllers.

    //@Required - applies to bean property setter methods and it indicates that the affected bean property must be populated, otherwise exception will be thrown.
    //@Autowired - wires beans together using setter or constructor injects
    //@Qualifier - when you create more than one bean of the same type you want to wire only one of them with property, then you qualifier.
    //@Resource -
    //@PostConstruct -
    //@Predestroy -
    //@Component -
    //@Service -
    //@Controller -
    //@PathVariable - used to pick up values from the url
    //@Configuration -
    //@Scope -

    //@RequestController - annotation, which marks the class as a controller where ever method returns a domain object instead of a view.
    //it's shorthand for @Controller and @ResponseBody rolled together.
    //@RequestMapping - ensures that HTTP requests to the "/greeting" are mapped to the correct greeting() method.
    //@RequestParam - binds the value of the query string parameter "name" into the "name parameter of the greeting() method. If
    //the name parameter is abset in the request, the defaultValue of "World" is used - please see greeting package..
    //@RequestBody
    //@Aspect -

    //What is bean in Spring and explain the different scopes of bean in Spring?

    //A bean is an object that is instantiated, assembled, and managed by a Spring IoC container.
    //They are managed by the Spring IoC Contained.
    //There are 5 scopes of beans in Spring :
    // Singleton
    // Prototype
    // Request
    // Session
    // Global-Session
}
