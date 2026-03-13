import javax.swing.*;

public class AccessibilityDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Accessibility Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100, 70, 100, 30);

        
        saveButton.setMnemonic('S'); 
        saveButton.setToolTipText("Click to save your changes (Alt+S)");

        saveButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Data saved successfully!");
        });

        frame.add(saveButton);
        frame.setVisible(true);
    }
}