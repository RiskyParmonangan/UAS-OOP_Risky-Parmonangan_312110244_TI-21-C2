import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Utama {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("TUGAS UAS OOP");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setLayout (new FlowLayout());
        
        JButton klik = new JButton ("Jalankan");
        frame.add (klik);
                
        klik.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                DataDiri DataDiri = new DataDiri ("Risky Parmonangan", 312110244, 19);
                DataDiri.getInfo();
                Prog Prog = new Prog("Teknik Informatika", 3);
                Prog.setDataDiri(DataDiri);
            
                System.out.println ("Program Studi : "+Prog.getNama());
                System.out.println ("Semester : "+Prog.getSem());
            }
        });
    
        frame.setVisible(true);
    }
}