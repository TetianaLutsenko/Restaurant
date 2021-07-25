package HW9;

import java.util.Objects;

public class Employee {
    Person person;
    double salary;




        public Employee(String name, int age, char sex, double salary) {
        this.person = new Person(name, age, sex);
        this.salary = salary;

    }

    public Employee(Person person, double salary) {
        this.person = person;
        this.salary = salary;
  }

    boolean isSameName(Employee employee) {
        return Objects.equals(employee.person.name, this.person.name);


        }


}
