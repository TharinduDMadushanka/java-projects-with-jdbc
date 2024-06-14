package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame {
    public MainView() {
        setTitle("Main View");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton itemButton = new JButton("Item");
        JButton customerButton = new JButton("Customer");

        itemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ItemView().setVisible(true);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new CustomerView().setVisible(true);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        panel.add(itemButton);
        panel.add(customerButton);
        add(panel);
    }

    public static void main(String[] args) {
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
}

