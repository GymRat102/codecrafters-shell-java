public class ExitCommand extends Command {

    public ExitCommand() {
        this.name = "exit";
    }

    @Override
    public void handle(String input) {
        System.exit(0);
    }
}
