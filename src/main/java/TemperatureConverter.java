import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button1 = new JButton("Convert to Fahrenheit");
        frame.add(button1);
        JTextField field1 = new JTextField(10);
        frame.add(field1);
        JButton button2 = new JButton("Convert to Celsius");
        frame.add(button2);
        JTextField field2 = new JTextField(10);
        frame.add(field2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field1.setText(String.valueOf((Double.parseDouble(field2.getText())*1.8) + 32));
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                field2.setText(String.valueOf((Double.parseDouble(field1.getText())-32) * .5556));
            }
        });

        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}
