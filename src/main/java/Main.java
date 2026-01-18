import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        for (; ; ) {
            System.out.print("$ ");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] parts = input.split(" ", 2);

            Optional<Command> command = CommandFactory.fromString(parts[0]);

            if (command.isEmpty()) {
                System.out.println(parts[0] + ": command not found");
            } else {
                command.get().handle(parts);
            }
        }
    }
}
