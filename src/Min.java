import  java.util.Scanner;
public class Min {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min;

        System.out.println("Enter Num1 : ");
        int n1 = scan.nextInt();
        min = n1;


        System.out.println("Enter Num2 : ");
        int n2 = scan.nextInt();
        if (n2 < min) {
            min = n2;
        }
        System.out.println("Enter Num3 : ");
        int n3 = scan.nextInt();
        if (n3 < min) {
            min = n3;

        }
        System.out.println("Minimul number is " + min);
        scan.close();
    }
}
