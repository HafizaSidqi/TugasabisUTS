package objekgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FormGUI extends JFrame {
    String nama, jk, agama, hobby;
    final JTextField fnama = new JTextField(10);
    
    JLabel lnama = new JLabel("Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel("Jenis Kelamin ");
    
    JRadioButton rbPria = new JRadioButton(" Laki=laki ");
    JRadioButton rbWanita = new JRadioButton(" Perempuan ");
    
    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama =
            {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
    JLabel lhobby = new JLabel(" Hobby ");
    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");
    
    JButton btnSave = new JButton("OK");
    
    
    JLabel hasilnama = new JLabel();
    JLabel hasiljk = new JLabel();
    JLabel hasilagama = new JLabel();
    JLabel hasilhobby = new JLabel();
    
    public FormGUI(){
    setTitle("BIODATA");
        setDefaultCloseOperation(3);
        setSize(350,500);
        
        
        btnSave.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                if(fnama.getText().length()==0){
                    JOptionPane.showMessageDialog(null, "Nama tidak ada");
                } else {
                    nama = fnama.getText();
                    hasilnama.setText(nama);
                }
                if(rbPria.isSelected()){
                    jk =rbPria.getText();
                } else if (rbWanita.isSelected()) {
                    jk = rbWanita.getText();
                }
                String agama = (String)cmbAgama.getSelectedItem();
                if(cbSepakbola.isSelected()){
                    hobby = cbSepakbola.getText();
                    hasilhobby.setText(" Sepakbola ");
                } else if (cbBasket.isSelected()){
                    hobby = cbBasket.getText();
                    hasilhobby.setText("Basket");
                }
        TampilGUI tampil = new TampilGUI(nama, jk, agama, hobby);
        tampil.setVisible(true);
                dispose();
            }
        });
        
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        setLayout(null);
        add(lnama);
        add(fnama);
        add(ljeniskelamin);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbSepakbola);
        add(cbBasket);
        add(btnSave);
        
        lnama.setBounds(10, 10, 120, 20);
        fnama.setBounds(130, 10, 150, 20);
        ljeniskelamin.setBounds(10, 35, 120, 20);
        rbPria.setBounds(130, 35, 100, 20);
        rbWanita.setBounds(230, 35, 100, 20);
        lagama.setBounds(10, 60, 150, 20);
        cmbAgama.setBounds(130, 60, 150, 20);
        lhobby.setBounds(10, 85, 120, 20);
        cbSepakbola.setBounds(130, 85, 100, 20);
        cbBasket.setBounds(230, 85, 150, 20);
        btnSave.setBounds(100, 130, 120, 20);
        
        //pack();
        setVisible(true);
        
    }
}
