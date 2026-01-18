public class EchoCommand extends Command {
    public EchoCommand() {
        this.name = "echo";
    }

    @Override
    public void handle(String[] inputs) {
        if (inputs.length < 2) {
            System.out.println("Nothing to echo.");
            return;
        }
        System.out.println(inputs[1]);
    }
}
