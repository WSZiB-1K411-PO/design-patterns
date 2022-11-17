package command;

import java.util.List;

public class PrintCommand implements Command {
    @Override
    public int run(List<String> args) {
        System.out.println(String.join(" ", args));
        return 0;
    }

    @Override
    public String getName() {
        return "echo";
    }
}
