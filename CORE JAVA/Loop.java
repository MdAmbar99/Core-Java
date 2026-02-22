public class Loop{
    public static void main(String args[]){
        
        // While Loop
        int i = 1;

        while(i<=5){
            System.out.println("Hii" + i);

            int j=1;
            while(j<=3){
                System.out.println("hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);

        // Do While Loop
        int a = 1;

        do{
            System.out.println("do while " + a);
            a++;
        }while(a<=4);


        // For Loop

        for(int b=1; b<=4 ; b++){
            System.out.println("For loop he ye .. " + b);
        }
    }
}