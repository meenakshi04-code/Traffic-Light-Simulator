import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator {
    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Traffic Light Simulator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel messageLabel = new JLabel();
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        frame.add(messageLabel);

        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        frame.add(redButton);
        frame.add(yellowButton);
        frame.add(greenButton);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("-stop");
                messageLabel.setForeground(Color.RED);
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("-ready");
                messageLabel.setForeground(Color.YELLOW);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("-go");
                messageLabel.setForeground(Color.GREEN);
            }
        });

        messageLabel.setText("");

        frame.setVisible(true);
    }
}