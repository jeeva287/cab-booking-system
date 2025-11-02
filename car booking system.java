package cabapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
class Cab {
    String driverName, cabNumber, status;
    double ratePerKm;

    public Cab(String driverName, String cabNumber, double ratePerKm) {
        this.driverName = driverName;
        this.cabNumber = cabNumber;
        this.ratePerKm = ratePerKm;
        this.status = "Available";
    }
    public String toString() {
        return driverName + " - " + cabNumber + " (₹" + ratePerKm + "/km)";
    }
}
public class CabBookingApp extends JFrame implements ActionListener {
    private JComboBox<Cab> cabDropdown;
    private JTextField txtCustomerName, txtFrom, txtTo, txtDistance;
    private JTextArea outputArea;
    private JButton bookBtn, clearBtn;
    private List<Cab> cabList = new ArrayList<>();
    public CabBookingApp() {
        setTitle("Cab Booking System");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));        
        cabList.add(new Cab("Amit Sharma", "DL01AB1234", 15.0));
        cabList.add(new Cab("Priya Singh", "DL01XY4321", 12.0));
        cabList.add(new Cab("Rahul Mehta", "DL01CD5678", 18.0));
        JPanel inputPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Booking Details"));
        inputPanel.add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField();
        inputP