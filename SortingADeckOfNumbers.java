import java.util.Scanner;
public class SortingADeckOfNumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String m1,m2,m3,m4;
        int num1,num2,num3,num4,num5,sort;

        m1 = "How many numbers do you want to sort ? : ";
        m2 = "Enter the 1st number : ";
        m3 = "Largest number : ";
        m4 = "Smallest number : ";


        System.out.print(m1);
        sort = inp.nextInt();
        System.out.print(m2);
        num1 = inp.nextInt();

        int smallNumber = num1;
        int bigNumber = num1;

        for (int i = 2; i <= sort; i++){
            System.out.print("Enter the " + i + "st number : ");
            num2 = inp.nextInt();

            if (num2 < smallNumber){
                smallNumber = num2;
            } else if (num2 > bigNumber){
                bigNumber = num2;
            }
        }

        System.out.println(m3 + smallNumber);
        System.out.println(m4 + bigNumber);


    }
}
