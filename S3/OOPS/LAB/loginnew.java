import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test implements ActionListener {
    JLabel u, p1, r;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;
    
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password";

    Test() {
        JFrame f = new JFrame("Login Form");
        
        u = new JLabel("Username");
        p1 = new JLabel("Password");
        r = new JLabel();
        
        t1 = new JTextField(16);
        t2 = new JPasswordField(16);
        
        b1 = new JButton("Clear");
        b2 = new JButton("Submit");
        
        JPanel p = new JPanel();
        p.add(u);
        p.add(t1);
        p.add(p1);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        p.add(r);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f.add(p);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        String s1 = t1.getText();
        String s2 = new String(t2.getPassword());

        if (s.equals("Submit")) {
            if (s1.equals(VALID_USERNAME) && s2.equals(VALID_PASSWORD)) {
                r.setText("Login successful!");
            } else {
                r.setText("Invalid username or password.");
            }
            t1.setText("");
            t2.setText("");
        } else if (s.equals("Clear")) {
            t1.setText("");
            t2.setText("");
            r.setText("");
        }
    }

    public static void main(String args[]) {
        new Test();
    }
}

 
 
