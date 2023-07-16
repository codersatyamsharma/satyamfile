import java.util.*;
public class binaryTodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int ans=0;
        int p=1;

        while(n>0){
            int t=n%10;
            ans=ans+t*p;
            p=p*2;
            n=n/10;
        }
        System.out.println(ans);
    }
}
