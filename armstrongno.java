import java.util.*;
public class armstrongno {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    int ans=0;
    int temp=n;
while(n>0){
    int p=n%10;
    ans+=p*p*p;
    n/=10;
}
if(ans==temp){
    System.out.println("armstrong no");
}
else{
    System.out.println("not armstrong no");
}
    }

}
