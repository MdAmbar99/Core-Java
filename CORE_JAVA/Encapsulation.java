
class Human{
    private int age;
    private String name;

    // getter
    public int getAge(){
        return age;
    }
    
    // setter
    public void setAge(int age){
        // this Keyword - reffers to the current object (which calls the method)
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}


public class Encapsulation{

    public static void main(String args[]){

        Human obj = new Human();
        // setter
        obj.setAge(21);
        obj.setName("Shafi");

        // getter
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}