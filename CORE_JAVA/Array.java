
class Student{
    int rollno;
    String name;
    int marks;

}


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

        System.out.println();

        // jagged array
        int arr1[][] = new int[3][];

        arr1[0] = new int[3];
        arr1[1] = new int[4];
        arr1[2] = new int[2];


        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[] : arr1){
            // m is a varable taking elements in array n[]
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();


        // Array of objects
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ambar";
        s1.marks = 77;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Aayush";
        s2.marks = 87;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "aman";
        s3.marks = 81;

        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for(int i=0; i<Students.length; i++){
            System.out.println(Students[i].name + " : " + Students[i].marks);
        }
        System.out.println();
        
        for(Student a : Students){
            System.out.println(a.name + " : " + a.marks);
        }
    }
}