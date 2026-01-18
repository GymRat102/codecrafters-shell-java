import java.util.List;
import java.util.Optional;

public class CommandFactory {

    static List<Command> commands = List.of(new EchoCommand(), new ExitCommand(), new TypeCommand());

    public static Optional<Command> fromString(String input) {
        return commands.stream()
                .filter(command -> command.name.equals(input))
                .findFirst();
    }
}
