package command;

import java.util.List;

public interface Command {
    int run(List<String> args);
    String getName();
}
