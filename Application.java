/**
*This class launches the Application
*@author Clayton Catanzarite
*@version 1.0
*Programming Project One
*CS322 - Compiler Construction
*Fall 2019
*/
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.awt.*;
public class Application extends Regex{
	public static void main(String args[]) throws FileNotFoundException {
		Jframe frame = new Jframe("Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
		Scanner scan=new Scanner(System.in);
		File log=new File(auth.log);//TODO:figure out how to add file
		Scanner scnr = new Scanner(log);
		String line ="";
		hashMapCreator();
		while(scnr.nextLine()){
			line=scnr.nextLine();
			hashMapEntry(line);
		}//while loop
	}//main method
	
	public static void  argumentAccepter(){
		System.out.println("enter filename\n");
		String filename = scan.nextLine();
		System.out.println("The filename is"+filename);
		System.out.println("enter print flag\n");
		int printFlag = scan.nextInt();
		System.out.println("The print flag is "+printFlag);
		 
	}//argument method
	
}//class
