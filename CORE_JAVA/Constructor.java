
class Human{
    private int age;
    private String name;


    // Defoult Constructor
    public Human(){
        age = 12;
        name = "Ambar";
    }

    // Parametorized Constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }


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


public class Constructor{

    public static void main(String args[]){

        Human obj = new Human();

        Human obj1 = new Human(20,"Shahid");
        // setter
        obj.setAge(21);
        obj.setName("Shafi");

        // getter
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}