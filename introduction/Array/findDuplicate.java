package Array;

import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entere element");
        int arr [] = new int [40];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // int arr [] = {2, 3, 5, 2, 6, 7};

        for (int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("your duplicaate element is : " + arr[i]);
                }

            }

            
        }
        }

    
}
