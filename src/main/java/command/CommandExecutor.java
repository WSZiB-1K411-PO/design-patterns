package command;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommandExecutor {
    private final Map<String, Command> commands;


    public CommandExecutor(Command... commands) {
        this.commands = Stream.of(commands)
                .collect(Collectors.toMap(Command::getName, Function.identity()));
    }

    public void run(String line) {
        String[] strings = line.split("\s");

        if (strings.length == 0) {
            System.out.println("Please enter command!");
            return;
        }

        String commandName = strings[0];

        String[] args = Arrays.copyOfRange(strings, 1, strings.length);

        Command command = commands.get(commandName);

        if(command == null) {
            System.out.println("Unknown command: " + commandName);
            return;
        }

        int result = command.run(Arrays.asList(args));
        System.out.println("Command finished with code: " + result);
    }
}
