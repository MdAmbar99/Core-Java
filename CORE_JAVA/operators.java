class operators{

    public static void main(String args[]){
        int num1 = 7;
        int num2 = 5;

        int result = num1 + num2;

        System.out.println(result);

        num1 += 3;
        num2++;
        System.out.println(num1);


        // relational operators

        int x = 6;
        int y = 5;

        boolean result1 = x > y;
        System.out.println(result1);

        boolean result2 = x >= y;
        System.out.println(result2);

        boolean result3 = x <= y;
        System.out.println(result3);

        boolean result4 = x == y;
        System.out.println(result4);

        boolean result5 = x != y;
        System.out.println(result5);

        System.out.println("-------------------------------------------------------");

        // logical operator 

        int a = 7;
        int b = 5;

        int c = 5;
        int d = 9;

        boolean ans = a > b && c > d;
        System.out.println(ans);

        boolean ans1 = a > b && c < d;
        System.out.println(ans1);

        boolean ans2 = a > b || c > d;
        System.out.println(ans2);

        boolean ans3 = a > b;
        System.out.println(!ans3);
    }
}