import java.util.Optional;

public class TypeCommand extends Command {

    public TypeCommand() {
        this.name = "type";
    }

    @Override
    public void handle(String[] inputs) {
        if (inputs.length < 2) {
            System.out.println("Nothing to find type for.");
            return;
        }

        Optional<Command> command = CommandFactory.fromString(inputs[1]);

        command.ifPresentOrElse(
                cmd -> System.out.println(cmd.name + " is a shell builtin"),
                () -> System.out.println(inputs[1] + ": not found")
        );
    }
}
