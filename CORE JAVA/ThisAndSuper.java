
// every class in java extends object class like -> class A extends object (works as multi level inheritence)

class A extends Object{
    // constructor of A
    public A(){
        super();                     
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}

class B extends A{

    // constructor of B
    public B(){
        // super(5);
        super();
        System.out.println("in B");
    }

    public B(int n){
        // super(n);              // every contructor have a super method - calls the default constructor of super class
        this();                   // execute the constructor of the same class
        System.out.println("in B int");
    }
}

public class ThisAndSuper{
    public static void main(String args[]){

        //B obj = new B(5);
        B obj = new B(6);
    }
}

// whenever we create the object of a class it will call constructor of sub-class and super-class