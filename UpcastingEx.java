class Person{
    String name;
    String id;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;
    String department;

    public Student(String name){
        super(name);
    }
}

public class UpcastingEx{
    public static void main(String[] args){
        Student s = new Student("이재문");
        Person p = s;
        System.out.println(p.name);
    }
}