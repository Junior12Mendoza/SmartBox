package smartbox;
import mvc.*;

import java.util.Collection;

public class ContainerView extends View {

    private java.awt.List components;

    public ContainerView(Model model) {
        super(model);
        components = new java.awt.List(10);
        this.add(components);
    }

    @Override
    public void update(){
        int i = 0;
        Collection<Component> componentSet = ((Container) model).getComponents();
        components.removeAll();

        for(Component component : componentSet){
            components.add(component.toString(), i);
            i++;
        }

        repaint();
    }
}