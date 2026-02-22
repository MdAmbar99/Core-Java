
class Calculator{

    int a;

    public int add(int n1, int n2)
    {
        int sum = n1 + n2 ;

        return sum;
    }
}



public class Oops{
    public static void main(String args[]){

        int num1=4;
        int num2=5;
        //int result = num1 + num2 ;

        // creating object
        Calculator calc = new Calculator();   // calc is a refrence veriable

        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}

// evrthing has to be done with the help of object

// object - has properties and behaviour 

// class - file me blueprint hota he bs