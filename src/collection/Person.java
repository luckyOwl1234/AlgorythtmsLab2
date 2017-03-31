package collection;

/**
 * Created by nightmare on 3/29/17.
 */
public class Person {
    private String name;
    private String email;
    private String gender;
    private int age;

    public Person(String name,String email,String gender, int age) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}