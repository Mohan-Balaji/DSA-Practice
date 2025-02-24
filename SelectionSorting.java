import java.util.Scanner;

public class SelectionSorting {

    public void SelecSort(int [] arr){
        for(int i = 0  ;  i <arr.length ; i++){
            int min = i;// Assume min value during every iteration
            for(int j = i+1 ;  j <arr.length ; j++){
                if(arr[j]<arr[min]){ // checking our assume index is min if not it swap the min index found in if condition
                    min=j;//swaps with actual min index in array
                }
            }
            int temp = arr[i]; // after finding min element index after we perform swap
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
    public void print(int arr[]){
        for(int i = 0  ;  i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        SelectionSorting Ssort = new SelectionSorting();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0  ;  i <  n ; i++){
            arr[i]=sc.nextInt();
        }
        Ssort.SelecSort(arr);
        Ssort.print(arr);
        
    }
}
