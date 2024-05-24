package smartbox;

import mvc.Command;
import mvc.Model;
import mvc.Utilities;

public class RunCommand extends Command {
    public RunCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() {
        String input = Utilities.ask("Component Name?");
        if(input == null){
            return;
        }
        try {
            ((Container) model).launch(input);
        } catch (Exception e) {
            mvc.Utilities.error(e);
            e.printStackTrace();
        }
    }
}
