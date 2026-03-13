import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class StateManagedForm {
    public static void main(String[] args) {
        new StateManagedForm().createForm();
    }

    public void createForm() {
        JFrame frame = new JFrame("State Management Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);

        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);

        
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 100, 25);
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 1, 120, 1));
        ageSpinner.setBounds(150, 60, 50, 25);

        
        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 100, 100, 25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 100, 200, 25);

        
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 150, 100, 30);
        submitButton.setEnabled(false);

        
        Runnable validateForm = () -> {
            String name = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            int age = (int) ageSpinner.getValue();

            boolean valid = !name.isEmpty()
                    && age >= 1 && age <= 120
                    && phone.matches("\\d{10}");

            submitButton.setEnabled(valid);
        };

        
        nameField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { validateForm.run(); }
            public void removeUpdate(DocumentEvent e) { validateForm.run(); }
            public void changedUpdate(DocumentEvent e) { validateForm.run(); }
        });

        phoneField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) { validateForm.run(); }
            public void removeUpdate(DocumentEvent e) { validateForm.run(); }
            public void changedUpdate(DocumentEvent e) { validateForm.run(); }
        });

        ageSpinner.addChangeListener(e -> validateForm.run());

        
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Form submitted successfully!");
        });

        
        frame.add(nameLabel); frame.add(nameField);
        frame.add(ageLabel); frame.add(ageSpinner);
        frame.add(phoneLabel); frame.add(phoneField);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}