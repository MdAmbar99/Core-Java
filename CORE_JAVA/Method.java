
class Computer{
    public void playMusic(){
        System.out.println("Music Playing ...");
    }

    public String getAPen(int cost){
        if(cost >= 10){
            return "Pen";
        }

        return "Nothing";
    }
}

class Calculator{
    public int add(int n1 , int n2 , int n3){
        int result = n1 + n2 + n3;
        return result;
    }
    public int add(int n1 , int n2){
        int result = n1 + n2;
        return result;
    }
}

public class Method{

    public static void main(String arg[]){

        Computer obj = new Computer();
        obj.playMusic();

        String str = obj.getAPen(11);
        System.out.println(str);


        // Method over loading - 2 method of same but but diff no. of parameters
        Calculator cal = new Calculator();
        int r1 = cal.add(3,7,5);
        System.out.println(r1);

        int r2 = cal.add(3,8);
        System.out.println(r2);
    }
}