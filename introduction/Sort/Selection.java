package Sort;

import java.util.Scanner;

public class Selection {
    public  static void  PrintArray(int arr[]){
        for (int i=0; i<arr.length; i++)
        System.out.println(arr[i]);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter element of an Array:");
        for (int i = 0; i<arr.length; i++){
             arr[i]= sc.nextInt();
        }


//        int arr[] = {9,7,3,2,5,7};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }
    }

