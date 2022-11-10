import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int no;

        System.out.print("Bir sayı giriniz: ");
        no= inp.nextInt();

        System.out.print(no+" sayısına kadar olan sayılardan 4'ün katı olan sayılar:");
        for (int i=1; i<=no; i*=4)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n-------------------------");

        System.out.print(no+" sayısına kadar olan sayılardan 5'in katı olan sayılar:");
        for (int i=1; i<=no; i*=5)
        {
            System.out.print(i+" ");
        }
    }
}