package spring.in28minutes.rest.jpa_course.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {


    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //using param versioning
    @GetMapping(value = "person/param", params = "version=1")
    public PersonV1 paramv1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 paramv2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //using header versioning
    @GetMapping(value="/person/header", headers="X-API-VERSION=1")
        public PersonV2 headerV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
        }

    @GetMapping(value = "person/header", headers = "X-API-VERSION=2")
    public PersonV1 headerV1() {
        return new PersonV1("Bob Charlie");
    }

    //using producer versioning
    @GetMapping(value="/person/produces", produces="application/vnd.company.app-v1+json")
    public PersonV2 produceV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    @GetMapping(value = "person/header", produces="application/vnd.company.app-v2+json")
    public PersonV1 produceV1() {
        return new PersonV1("Bob Charlie");
    }
}
