import java.util.Scanner;

public  class countnoofdigit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        int original=n;
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println("no.of digit in "+original+" is "+count);
    }
}


