package command;

import java.util.List;

public class AddCommand implements Command {
    @Override
    public int run(List<String> args) {
        double sum = 0;

        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                return 1;
            }
        }

        System.out.println(sum);

        return 0;
    }

    @Override
    public String getName() {
        return "add";
    }
}
