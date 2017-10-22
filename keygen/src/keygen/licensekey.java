package keygen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class licensekey extends JFrame {
	
	
	
	public static void main(String args[]){
		licensekey kg=new licensekey();
	}
	/*public void actbtn(){
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae) {
				
				// TODO Auto-generated method stub
				Random rnd=new Random();
				String a = ""+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9);
				String b = ""+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9);
				String c= ""+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9);
				String d = ""+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9);
				String e = ""+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9)+rnd.nextInt(9);
				txt.setText(a+"-"+b+"-"+c+"-"+d+"-"+e);
			}
			
			
		});
	}
	*/
	licensekey(){
	 super("Key-Generator");
	 setSize(100,70);
	 panel.setLayout(null);
	
	 
	 txt.setBounds(70, 30, 150, 20);
	 btn.setBounds(110, 100, 80, 20);
	 
	 panel.add(l1);
	 panel.add(txt);
	 panel.add(btn);
	 
	 getContentPane().add(panel);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setVisible(true);
	// actbtn();
	 
 }
 JLabel l1=new JLabel("ProductId");
 JButton btn=new JButton("Generator");

 JPanel panel=new JPanel();
 JTextField txt=new JTextField(29);

 
 
 
}

