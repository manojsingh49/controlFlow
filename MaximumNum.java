import java.util.Scanner;

public class MaximumNum {
    public static int findMaximumNum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int maximumNumber = findMaximumNum(num1, num2);
        System.out.println("The mixmum number is "+ maximumNumber);


    }
}
