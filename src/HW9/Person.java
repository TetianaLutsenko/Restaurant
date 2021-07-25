package HW9;

public class Person {
    String name;
    int age;
    char sex;

   public Person(String name, int age, char sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
  }



    public String getName() {
        String result;
        if (sex == 'M') {
            result = "Mr. " + name;
            return result;

        } else
            result = "Mrs. " + name;
            return result;

    }

}




