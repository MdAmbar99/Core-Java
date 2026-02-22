

public class Array{

    public static void main(String args[]){
        
        // Array initialisation
        int nums[] = {3,7,2,4};
        int nums1[] = new int[4];
        nums1[0] = 1;

        nums[1]=6;
        System.out.println(nums[1]);

        System.out.println(nums1[0]);

        for(int i=0; i<4; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        // 2-D Array

        int random = 0;
        // genrate random values (<1)

        int arr[][] = new int[3][4];

        // Math.random() - genrates random values (b/w 0 & 1)
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        // here n[] is entire array - n exceutes entire arry before moving to next array
        for(int n[] : arr){
            // m is a varable taking elements in array n[]
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}