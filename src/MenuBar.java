import javax.swing.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image;
/**
 * Created by parsa on 5/30/17.
 */
public class MenuBar extends JMenuBar {

    private MainPanel mainPanel;
    public MainFrame frame;

    {
        //mainPanel.setInputMap(....);
    }

    public MenuBar(MainFrame frame) {
        super();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        this.frame = frame;
        //JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");

        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser("/Users/parsa/Desktop");
                frame.photo = new Photo(fileChooser.getSelectedFile());

            }
        });
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem cropMenuItem = new JMenuItem("Crop");
        JMenuItem rotateMenuItem = new JMenuItem("rotate");
        JMenuItem colorMenuItem = new JMenuItem("Color");
        JMenuItem effectMenuItem = new JMenuItem("effect");


        //fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        editMenu.add(cropMenuItem);
        editMenu.add(rotateMenuItem);
        editMenu.add(colorMenuItem);
        editMenu.add(effectMenuItem);

        add(fileMenu);
        add(editMenu);

        System.out.println("1");


    }
}
