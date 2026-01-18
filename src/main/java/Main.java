import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        for(;;) {
            System.out.print("$ ");

            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                System.exit(0);
            } else if (command.startsWith("echo ")) {
                String whatToEcho = command.substring(5);
                System.out.println(whatToEcho);
            } else {
                System.out.println(command + ": command not found");
            }
        }
    }
}
