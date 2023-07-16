import java.util.Scanner;
public class sumofdigit {
    public  static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    scanner.close();
    int n = scanner.nextInt();
    int sum=0;
    while(n>0){
        sum+=n%10;
        n/=10;
    }
    System.out.println(sum);
    }
}
