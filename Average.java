package average;

import java.util.Scanner;

public class Average {

    public static int averageCalculation(int arr[], int n){
        int average,sum=0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        average = sum/n;
        return average;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter element: ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The average: "+averageCalculation(arr,n));
    }
    
}
