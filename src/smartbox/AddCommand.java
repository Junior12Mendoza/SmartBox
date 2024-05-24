package smartbox;

import mvc.*;

public class AddCommand extends Command{
    public AddCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() {
        String input = Utilities.ask("Add Component Name?");
        if(input == null){
            return;
        }
        try {
            ((Container) model).addComponent(input);
        } catch (Exception e) {
            mvc.Utilities.error(e);
            e.printStackTrace();
        }
    }
}
