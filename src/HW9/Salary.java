package HW9;

import java.util.Objects;

public class Salary {


    static double getSum(Employee[] employeeArray) {
        double sum = 0;
        for (int i = 0; i < employeeArray.length; i ++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }
    static Employee findByName(String name, Employee[] employeeArray) {

        for (int i = 0; i < employeeArray.length; i++ ) {
            if (Objects.equals(name, employeeArray[i].person.name)) {
                return employeeArray[i];
            }


        }
        return null;
    }
}
