import java.util.Scanner;

public class Bubble_Sort {
    
    public static void bubble(int arr[], int n){
        boolean Noswap = true;
        for(int i = n-1 ; i >=0;i--){
            for(int j = 0 ; j <=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    Noswap=false;
                }
            }
            System.out.println("run");
            if(Noswap){
                System.out.println("No Swap");
                break;
            }
        }
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    bubble(arr,n); 

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close(); 
  }
}

