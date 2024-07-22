
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    if (amount > first.contains()) {
                        amount = first.contains();
                    }
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                // other cases can be added here if needed
                default:
                    System.out.println("Please insert valid command");
                    break;
            }

        }
    }

}
