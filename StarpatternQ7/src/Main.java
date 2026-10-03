//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many times you want to Execute this program ? ");
    int input=sc.nextInt();
    System.out.println();

    while(input>0){
        input--;

        System.out.println("Enter a number");
        int no = sc.nextInt();

        int i = 1;
        while(i<=no){
            int j = 1 ;

            while(j<=1){   //j==1
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }


    }
}