import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Computer: Hello");
        Thread.sleep(1000);

        System.out.println("Computer: Lets fun! Are you ready? y/n");
        if(sc.nextLine().equals("n")) {
            System.out.println("Computer: Fuck you, bitch");
            return;
        }

        String g = "";
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
