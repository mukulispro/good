import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TableWithScroll {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Records with Scroll");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        
        String[] columnNames = {"ID", "Name", "Age", "Department"};

        
        Object[][] rowData = {
            {1, "Alice", 20, "CS"},
            {2, "Bob", 22, "IT"},
            {3, "Charlie", 19, "ECE"},
            {4, "Diana", 21, "ME"},
            {5, "Ethan", 23, "CE"},
            {6, "Fiona", 20, "BT"},
            {7, "George", 24, "EEE"},
            {8, "Hannah", 22, "Math"},
            {9, "Ian", 25, "PH"},
            {10, "Jane", 21, "MME"}
        };

        
        DefaultTableModel model = new DefaultTableModel(rowData, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        
        JScrollPane scrollPane = new JScrollPane(table);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}