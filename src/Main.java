import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
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
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<Integer> counterNumbers = new ArrayList<Integer>();
        ArrayList<Integer> counterAnswers = new ArrayList<Integer>();
        int[] listControl = {0,1,2,3,4,6,7,5,8,5,7,4,8,8,7,5,6,8,4,8,3,2,6,0};

        for(int i=0;i<9;i++) numbers.add(String.format("%d",(int) Math.pow(10.0, (double) i)));
        for(int i=0;i<9;i++) counterNumbers.add(0);
        for(int i=0;i<9;i++) counterAnswers.add(0);

        System.out.println(numbers);
        System.out.println(counterNumbers);
        System.out.println(counterAnswers);
        System.out.println();

        for (int i=0; i<numbers.get(8).length(); i++) System.out.print(numbers.get(8).charAt(i)+" ");
        System.out.println();

        System.out.println("Computer: Напишите число или команду d-done");
        Thread.sleep(1000);
        System.out.println("Computer: GO!");
        Thread.sleep(2000);

        for(int i=0; i<listControl.length;i++){
            System.out.print(numbers.get(listControl[i]));
            counterNumbers.set(listControl[i], counterNumbers.get(listControl[i])+1);
            Thread.sleep(1000);
            for (int j=0; j<numbers.get(listControl[i]).length();j++)  System.out.print("\b");
            System.out.println();

            g = sc.nextLine();
            if(g.equals("d")) break;
            if(g.equals(String.valueOf(listControl[i]))) counterAnswers.set(listControl[i], counterAnswers.get(listControl[i])+1);

        }

        System.out.println("counterNumbers: " + counterNumbers);
        System.out.println("counterAnswerss: " + counterAnswers);


    }


}

/* версия с рандомом
        int f = 0;
       while(f<50) {
            int randNum = (int) (Math.random()*(10)-1); // [0,9) or [0,8]
            counterNumbers.set(randNum, counterNumbers.get(randNum)+1);
            //System.out.print("\b\b\b\b");

           // System.out.println("Computer: Напишите число или команду d-done");

            //g = sc.nextLine();
            if(g.equals("d")) break;
            f++;
            //comment
        }*/