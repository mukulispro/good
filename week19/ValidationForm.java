import javax.swing.*;
import java.awt.*;

public class ValidationForm {
    public static void main(String[] args) {
        new ValidationForm().createForm();
    }

    public void createForm() {
        JFrame frame = new JFrame("Input Validation Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);

        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);

        
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 100, 25);
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 60, 200, 25);

        
        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 100, 100, 25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 100, 200, 25);

        
        JButton submitButton = new JButton("Validate");
        submitButton.setBounds(150, 150, 100, 30);

        submitButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String phone = phoneField.getText().trim();

            
            nameField.setBackground(Color.WHITE);
            ageField.setBackground(Color.WHITE);
            phoneField.setBackground(Color.WHITE);

            
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Name cannot be empty!");
                nameField.setBackground(Color.PINK);
                return;
            }

            
            int age;
            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Age must be numeric!");
                ageField.setBackground(Color.PINK);
                return;
            }

            
            if (age < 1 || age > 120) {
                JOptionPane.showMessageDialog(frame, "Age must be between 1 and 120!");
                ageField.setBackground(Color.PINK);
                return;
            }

            
            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(frame, "Phone number must be 10 digits!");
                phoneField.setBackground(Color.PINK);
                return;
            }

            JOptionPane.showMessageDialog(frame, "Validation Successful!");
        });

        
        frame.add(nameLabel); frame.add(nameField);
        frame.add(ageLabel); frame.add(ageField);
        frame.add(phoneLabel); frame.add(phoneField);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}