package objekgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ObjekGUI {

    public static void main(String[] args) {
        GUI g = new GUI();
        
    }
}

class GUI extends JFrame {
    final JTextField fun = new JTextField(10);
    final JPasswordField fpw = new JPasswordField(10);
    JLabel lun = new JLabel(" Username ");
    JLabel lpw = new JLabel(" Password ");
    JButton btnlogin = new JButton("Login");
    public GUI() {
        setTitle("LOGIN");
        setDefaultCloseOperation(3);
        setSize(350,300);
        
        setLayout(null);
        add(lun);
        add(fun);
        add(lpw);
        add(fpw);
        add(btnlogin);
        
        lun.setBounds(10, 10, 120, 20);
        fun.setBounds(130, 10, 150, 20);
        lpw.setBounds(10, 35, 120, 20);
        fpw.setBounds(130, 35, 100, 20);
        btnlogin.setBounds(100, 130, 120, 20);
        
        btnlogin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                FormGUI form = new FormGUI();
                dispose();
            }
        });
        setVisible(true);
        
    }
}