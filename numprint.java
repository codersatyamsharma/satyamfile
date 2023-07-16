import java.util.Scanner;
     public class numprint {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}
