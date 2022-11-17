package command;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor(
                new AddCommand(),
                new PrintCommand()
        );

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        while (!line.equals("exit")) {
            commandExecutor.run(line);
            line = scanner.nextLine();
        }
    }
}
