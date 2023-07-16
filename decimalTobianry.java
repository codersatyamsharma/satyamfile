import java.util.Scanner;

public class decimalTobianry {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        int n=Scanner.nextInt();
        Scanner.close();
        int ans=0;
        int original =n;
        int p=1;
        while(n>0){
            int t=n%2;
            ans+= t*p;
            p*=10;
            n/=2;
        }
        System.out.println("the binary form of "+ original +" is "+ans);
    }
}
