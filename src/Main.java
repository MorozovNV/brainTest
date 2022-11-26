import javax.swing.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Computer: Hello");
        Thread.sleep(1000);

       /* System.out.println("Computer: Lets fun! Are you ready? y/n");
        if(sc.nextLine().equals("n")) {
            System.out.println("Computer: Fuck you, bitch");
            return;
        }*/

        String g = "";
        String[] numbers = new String[9];
        for(int i=0;i<9;i++){
            numbers[i] = String.format("%d",(int) Math.pow(10.0, (double) i)); //String.valueOf()
        }

        for (int i=0; i<numbers[8].length(); i++){
            System.out.print(numbers[8].charAt(i)+" ");
        }
        System.out.println(Math.pow(10.0, (double) 8));
        cat[] b = new cat[6];


        while(true) {
            System.out.print("1000");
            Thread.sleep(1000);
            System.out.print("\b\b\b\b");
            System.out.println("Computer: Напишите число или команду d-done");

            g = sc.nextLine();
            if(g.equals("d")) break;
        }

    }


}

class cat{}
