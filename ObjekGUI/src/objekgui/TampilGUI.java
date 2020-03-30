package objekgui;

import javax.swing.*;

class TampilGUI extends JFrame {
    String nama, jk, agama, hobby;
    JLabel lblnama = new JLabel(" Nama ");
    JLabel lbljk = new JLabel(" Jenis Kelamin ");
    JLabel lblagm = new JLabel(" Agama ");
    JLabel lblhb = new JLabel(" Hobby ");
    
    JLabel hasilnama = new JLabel();
    JLabel hasiljk = new JLabel();
    JLabel hasilagama = new JLabel();
    JLabel hasilhobby = new JLabel();
    
    public TampilGUI(String nama, String jk, String agama,String hobby) {
        setTitle("BIODATA");
        setDefaultCloseOperation(3);
        setSize(350,500);
        
        this.nama=nama;
        this.jk=jk;
        this.agama=agama;
        this.hobby=hobby;
        
        hasilnama.setText(nama);
        hasiljk.setText(jk);
        hasilagama.setText(agama);
        hasilhobby.setText(hobby);
        
        setLayout(null);
        add(lblnama);
        add(lbljk);
        add(lblagm);
        add(lblhb);
        add(hasilnama);
        add(hasiljk);
        add(hasilagama);
        add(hasilhobby);
        
        lblnama.setBounds(10,10,120,20);
	lbljk.setBounds(10,35,120,20);
        lblagm.setBounds(10,60,120,20);
        lblhb.setBounds(10,90,120,20);
        hasilnama.setBounds(110,10,120,20);
	hasiljk.setBounds(110,35,120,20);
        hasilagama.setBounds(110,60,120,20);
        hasilhobby.setBounds(110,90,120,20);
        
        setVisible(true);
    }
}