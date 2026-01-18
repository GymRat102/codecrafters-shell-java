public class EchoCommand extends Command {
    public EchoCommand() {
        this.name = "echo";
    }

    @Override
    public void handle(String input) {
        System.out.println(input);
    }
}
