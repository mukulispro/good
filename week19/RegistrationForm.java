import javax.swing.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 20, 200, 25);

        
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 60, 100, 25);
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 1, 100, 1));
        ageSpinner.setBounds(150, 60, 50, 25);

        
        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 100, 100, 25);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(150, 100, 200, 25);

        
        JLabel deptLabel = new JLabel("Department:");
        deptLabel.setBounds(20, 140, 100, 25);
        String[] departments = {"CS", "IT", "ECE", "EEE", "ME", "CE", "AE", "BT", "CH", "MME", "PH", "Math"};
        JComboBox<String> deptCombo = new JComboBox<>(departments);
        deptCombo.setBounds(150, 140, 200, 25);

        
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 180, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        male.setBounds(150, 180, 70, 25);
        female.setBounds(220, 180, 80, 25);
        other.setBounds(300, 180, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        hobbiesLabel.setBounds(20, 220, 100, 25);
        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");
        JCheckBox reading = new JCheckBox("Reading");
        music.setBounds(150, 220, 80, 25);
        sports.setBounds(230, 220, 80, 25);
        reading.setBounds(310, 220, 80, 25);

        
        frame.add(nameLabel); frame.add(nameField);
        frame.add(ageLabel); frame.add(ageSpinner);
        frame.add(phoneLabel); frame.add(phoneField);
        frame.add(deptLabel); frame.add(deptCombo);
        frame.add(genderLabel); frame.add(male); frame.add(female); frame.add(other);
        frame.add(hobbiesLabel); frame.add(music); frame.add(sports); frame.add(reading);

        frame.setVisible(true);
    }
}