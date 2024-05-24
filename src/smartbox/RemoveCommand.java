package smartbox;

import mvc.*;

public class RemoveCommand extends Command {
    public RemoveCommand(Model model) {
        super(model);
    }

    @Override
    public void execute() {
        String input = Utilities.ask("Remove Component Name?");
        if(input == null){
            return;
        }
        try{
            ((Container)model).remComponent(input);
        }
        catch (Exception e) {
            mvc.Utilities.error(e);
            e.printStackTrace();
        }
    }
}
