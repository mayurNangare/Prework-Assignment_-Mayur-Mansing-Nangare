import java.util.Scanner;

public class MissingNumberFinder {

    public static void main(String[] args) {

        // variables required;
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        System.out.println("Enter Numbers you want to add to the array :");
        int arr[] = new int[size-1];

        for(int i= 0;i<size-1;i++)arr[i] = in.nextInt();
        System.out.println("Missing Number : ");
        System.out.println(missingNumberFinder(arr,size));
    }

    public static int missingNumberFinder(int [] arr,int size){
        int n = size;
        int sum = n*(n+1)/2;

        for(int i : arr){
            sum = sum - i;
        }
        return sum;
    }
}
