package smartbox;

import mvc.*;

public class ContainerFactory implements AppFactory {
    @Override
    public Model makeModel() {
        return new Container();
    }

    @Override
    public View makeView(Model m) {
        return new ContainerView((Container)m);
    }

    @Override
    public String getTitle() {
        return "SmartBox Project";
    }

    @Override
    public String[] getHelp() {
        return new String[]{
                "Click on the buttons to make the program run",
                "Add: Adds the input component",
                "Rem: Removes the input component",
                "Run: Runs the input component",
        };
    }

    @Override
    public String[] getEditCommands() {
        return new String[]{"Add","Remove","Run"};
    }


    @Override
    public String about() {
        return "SmartBox Version 1.0 for CS151";
    }

    @Override
    public Command makeEditCommand(Model model, String type, Object source) {
        switch(type){
            case "Add":
                return new AddCommand(model);
            case "Rem":
                return new RemoveCommand(model);
            case "Run":
                return new RunCommand(model);
            default:
                return null;
        }
    }
}
