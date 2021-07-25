package HW9;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Tatiana", 35, 'F');
        person.getName();
        Employee employee = new Employee("Yeremii", 10, 'M', 20000);

        Employee employee1 = new Employee(person, 50000);

        Employee[] employeeArray = {employee, employee1};

        System.out.println(Salary.getSum(employeeArray));

        System.out.println(Salary.findByName("Yer", employeeArray));

    }
}
