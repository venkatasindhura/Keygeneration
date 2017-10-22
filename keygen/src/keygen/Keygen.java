package keygen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.*;
public class Keygen  extends JFrame{
	public static void main(String args[]){
		Keygen kg=new Keygen();
	}
	public void actbtn(){
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
	
 Keygen(){
	 super("Key-Generator");
	 setSize(100,70);
	 panel.setLayout(null);
	
	 
	 txt.setBounds(70, 30, 150, 20);
	 btn.setBounds(110, 100, 80, 20);
	 
	 panel.add(txt);
	 panel.add(btn);
	 
	 getContentPane().add(panel);
	 setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setVisible(true);
	 actbtn();
	 
 }
 
 JButton btn=new JButton("Generator");
 JPanel panel=new JPanel();
 JTextField txt=new JTextField(29);
 
 
}
