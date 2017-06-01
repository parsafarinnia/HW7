import javax.swing.*;
import java.awt.*;

/**
 * Created by parsa on 5/30/17.
 */
public class MainFrame extends JFrame {
    public Photo photo=null;
    public MainFrame()  {

        super("photo shop");
        this.setLayout(new FlowLayout());
        this.setSize(1000,1000);
        //MainPanel mainPanel = new MainPanel(...);
        //MenuBar menuBar = new MenuBar(...);


        //menuBar.setPanel(mainPanel);
        MenuBar menuBar = new MenuBar(this);

        setJMenuBar(menuBar);
        setVisible(true);


    }


}
