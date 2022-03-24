import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        double wayToGo, total;
        Scanner input = new Scanner(System.in);
        System.out.println("How many km you will go?");
        wayToGo = input.nextInt();
        total = wayToGo * 2.20 + 10;

        total = (total >= 20) ? total : 20;
        System.out.println( "Your total is:" + total);

    }
}
