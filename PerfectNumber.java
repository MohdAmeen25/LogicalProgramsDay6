import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number");
        int a= input.nextInt();
        int sum=0;

        for (int i=1; i<a; i++ ){
            if(a%i==0){
                sum=sum+i;

            }
        }
        if (sum==a){
            System.out.println("perfect number");
        }
        else {
            System.out.println("given number is not perfect number");
        }

    }
}
