import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(i+" ");
        }
    }
}
