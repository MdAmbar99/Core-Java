class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("write something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}


class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age) {
        //System.out.println("constructor colled");
        this.name = name;
        this.age = age;
    }

    // copy contructor
    Student(Student s1) {
        //System.out.println("constructor colled");
        this.name = s1.name;
        this.age = s1.age;
    }

}


public class Oops1{
    public static void main(String args[]){

    // Pen pen1 = new Pen();
    // pen1.color = "blue";
    // pen1.type = "gel";

    // pen1.write();

    // Pen pen2 = new Pen();
    // pen2.color = "black";
    // pen2.type = "ball-point";
    

    // pen1.printcolor();
    // pen2.printcolor();
// ---------------------------------------------------  //

    Student s1 = new Student("aman",24);
    // s1.name = "aman";
    // s1.age = 24;

    s1.printInfo();

    Student s2 = new Student(s1);

    s2.printInfo();


    }
}



