
class Shape{
    String color;

    public void area(){
        System.out.println("display area");
    }
}

// single-level inheritence
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

// multi-level inheritence
class EqualetralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2 * l * h);
    }
}

// hierarchial inheritence
class circle extends Shape{
    public void area(int r){
        System.out.println(3.14 *r*r);
    }
}

// hybrid inheitence
//----------------------

public class inheritence1{

    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}