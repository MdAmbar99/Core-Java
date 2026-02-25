
class Human{
    private int age;
    private String name;

    // getter
    public int getAge(){
        return age;
    }
    
    // setter
    public void setAge(int num){
        age = num;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}


public class Encapsulation{

    public static void main(String args[]){

        Human obj = new Human();
        // setter
        obj.setAge(11);
        obj.setName("Shafi");

        // getter
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}