package smartbox;
import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;

import javax.swing.*;
import mvc.*;

public class ContainerPanel extends AppPanel {
    java.awt.List components;
    private JButton add;
    private JButton rem;
    private JButton run;

    public ContainerPanel(AppFactory factory) {
        super(factory);
        add = new JButton("Add");
        add.addActionListener(this);
        controlPanel.add(add);

        rem = new JButton("Rem");
        rem.addActionListener(this);
        controlPanel.add(rem);

        run = new JButton("Run");
        run.addActionListener(this);
        controlPanel.add(run);
    }

    // this override needed to re-initialize component fields table:
    public void setModel(Model m) {
        super.setModel(m);
        ((Container) m).initContainer(); // restore fields of components
    }

    public static void main(String[] args) {
        AppPanel panel = new ContainerPanel(new ContainerFactory());
        panel.display();
    }
}