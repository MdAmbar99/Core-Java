class hello{
    public static void main(String args[]) {
        System.out.println("Hello world");

        int num1 = 3;
        int num2 = 8;
        int result = num1 + num2;
        System.out.println(result);

        // in java "double" is by default , for using float we have to explisitly mention "f" at the end of float number
        float marks = 6.5f;

        // range -128 to 127
        byte marks1 = 7;

        // string in double qouts & charector in single qoutes
        char c = 'h';


        // LITRALS

        int num3 = 0b101;

        System.out.println(num3);

        int num4 = 0x7E;

        System.out.println(num4);

        int num5 = 1_00_000_000;

        System.out.println(num5);

        double num6 = 12e10;
        System.out.println(num6);


        // TYPE CONVERSION 

        // byte b = 127;
        //int a = b;

        int a=12;
        byte k= (byte) a;

        // range k bahar wala byte ke - modulo hoga
        int b=257;
        byte k1= (byte) b;

        System.out.println(k);
        System.out.println(k1);


        float f = 5.6f;
        int t = (int) f;

        System.out.println(t);


        // TYPE PROMOTION
        byte aa = 10;
        byte bb = 30;
        int result1 = aa*bb;

        System.out.println(result1);
    }
}
