public class Strings{

    public static void main(String args[]){

        // String in java is class not a data type
        
        //String name = new String("Ambar");

        // obect is created in backgroud
        String name = "Ambar";

        System.out.println("hello, " + name);
        System.out.println(name.charAt(1));
        // concatination
        System.out.println(name.concat(" Shafi"));

        // Does not change existing string - it creates a new onject having data "Md Ambar Shafi"
        name = "Md " + name + " Shafi";
        System.out.println(name);


        // StringBuffer & String builder (java classes) - for creating mutable String

        StringBuffer sb = new StringBuffer("Shahid");
        // it give a buffer size of 16 bit/char (extra 16 bit)
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append(" Ali");
        System.out.println(sb);
        
        // conver the string buffer data to string data -> .toString()
        String str = sb.toString();

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Md ");
        System.out.println(sb);

        sb.setLength(30);
        System.out.println(sb);

        // String builer is not thread safe while string buffer is - rest all is same
    }
}