import java.util.Optional;

public class TypeCommand extends Command {

    public TypeCommand() {
        this.name = "type";
    }

    @Override
    public void handle(String input) {
        Optional<Command> command = CommandFactory.fromString(input);

        command.ifPresentOrElse(
                cmd -> System.out.println(cmd.name + " is a shell builtin"),
                () -> System.out.println(input + ": not found")
        );
    }
}
