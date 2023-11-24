package week8GUIs.hello_gui_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame{
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myFirstLabel;

    HelloGUI() {
        setContentPane(mainPanel);

        setPreferredSize(new Dimension(500, 500));
        /* pack all the components in, lay them out,
        organize them, put them in the right places, make sure they are the right sizes
         */
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants. EXIT_ON_CLOSE);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // code here - this will run when button is clicked
                myFirstLabel.setText("Hello Gui Programmers!!");
            }
        });

    }
}
