
class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // static Method
    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

    // Static block
    static{
        name = "Phone";
    }

    public Mobile(){
        brand = "";
        price = 200;
    }
}

// static variables are shared by all the objects (belong to class not the object )

public class StaticKeyword{

    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smart phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 900;
        obj2.name = "Smart phone";

        // static variable should be called by class name - instead on object name .
        Mobile.name = "phone";

        obj1.show();
        obj2.show();

        Mobile obj3 = new Mobile();

        // Loads the class (to call the static block)
        //class.forName("Mobile");

        Mobile.show1(obj1);
    }
}