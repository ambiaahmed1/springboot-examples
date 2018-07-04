package spring.in28minutes.rest.webservices.user;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class User {

    private Integer id;
    @Size(min=2, message = "Name should have atleast 2 characters")
    private String name;
    @Past
    private Date birthDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    protected User() {
    }

    public User(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

//Access Modifier Chart:
//  Modifier   | Class | Package | Subclass | World
//  public     | Y     |  Y      |    Y     | Y
//  protected  | Y     |  Y      |    Y     | N
//  no modifier| Y     |  Y      |    N     | N
//  private    | Y     |  N      |    N     | N

