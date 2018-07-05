package spring.in28minutes.rest.jpa_course.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

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

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }

    @Bean
    public ResourceBundleMessageSource bundleMessageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

}