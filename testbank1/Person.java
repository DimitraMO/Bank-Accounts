package testbank1;

public class Person {

    private String name;
    private int age;
    static int count = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
    public Person(){
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }



}
