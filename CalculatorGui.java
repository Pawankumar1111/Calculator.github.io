
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalculatorGui extends JFrame
implements ActionListener
	{
		JTextField tf,tf1,tf2,tf3;
		JTextArea area;
		JScrollPane pane;
		JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
		JLabel l,l1,l2,l3;
		
	
	public void setGUI()
	{
		super.setBounds(100, 100, 500, 600);
		super.setTitle("CALCULATOR");
		super.setResizable(false);
		//for text fields
		tf = new JTextField();  //text field for data1
		tf.setBounds(120, 100, 300, 25);//x starts from 100& length is 300
		super.add(tf);                  //y starts from 100& width is 25
		
		tf1 = new JTextField();   //text field for data2
		 tf1.setBounds(120, 125, 300, 25);
		super.add(tf1);
		

		tf2 = new JTextField();  //text field for result
		tf2.setBounds(120, 150, 300, 25);
		super.add(tf2);
		
		tf3 = new JTextField();   //text field for operation
		tf3.setBounds(120, 175, 300, 25);
		super.add(tf3);
		
		//for text area
		area = new JTextArea();
		pane = new JScrollPane(area); 
		pane.setBounds(120, 200, 300, 240);
		super.add(pane);
		// create object of font
		Font font = new Font
				("", Font.ITALIC, 38);
		// apply font to the text area
		area.setFont(font);
		// apply a color to text area
		area.setForeground(Color.white);
		
		area.setBackground(Color.pink);
		
		//buttons
		b1 = new JButton("ADD");        //addition button
		b1.setBounds(120, 440, 100, 30);
		super.add(b1);
		// register button for event handling
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		b1.setBackground(Color.pink);
	
		

		b2 = new JButton("SUB");      //sub button
		b2.setBounds(220, 440, 100, 30);
		super.add(b2);
		b2.addActionListener(this);
		b2.setForeground(Color.white);
		b2.setBackground(Color.pink);
		
		b3 = new JButton("MUL");
		b3.setBounds(320, 440, 100, 30);
		super.add(b3);
		b3.addActionListener(this);
		b3.setForeground(Color.white);
		b3.setBackground(Color.pink);
		
		b4 = new JButton("DIV");
		b4.setBounds(120, 470, 100, 30);
		super.add(b4);
		b4.addActionListener(this);
		b4.setForeground(Color.white);
		b4.setBackground(Color.pink);
		
		b5 = new JButton("MOD");
		b5.setBounds(220, 470, 100, 30);
		super.add(b5);
		b5.addActionListener(this);
		b5.setForeground(Color.white);
		b5.setBackground(Color.pink);
		
		b6 = new JButton("MAX");
		b6.setBounds(320, 470, 100, 30);
		super.add(b6);
		b6.addActionListener(this);
		b6.setForeground(Color.white);
		b6.setBackground(Color.pink);
		
		b7 = new JButton("MIN");
		b7.setBounds(120, 500, 100, 30);
		super.add(b7);
		b7.addActionListener(this);
		b7.setForeground(Color.white);
		b7.setBackground(Color.pink);
		
		b8 = new JButton("CONCAT");
		b8.setBounds(220, 500, 100, 30);
		super.add(b8);
		b8.addActionListener(this);
		b8.setForeground(Color.white);
		b8.setBackground(Color.pink);
		
		b9 = new JButton("DATE");
		b9.setBounds(320, 500, 100, 30);
		super.add(b9);
		b9.addActionListener(this);
		b9.setForeground(Color.white);
		b9.setBackground(Color.pink);
		
		b10= new JButton("CLEAR");
		b10.setBounds(120, 530, 150, 30);
		super.add(b10);
		b10.addActionListener(this);
		b10.setForeground(Color.white);
		b10.setBackground(Color.pink);
		
		b11 = new JButton("EXIT");
		b11.setBounds(270, 530, 150, 30);
		super.add(b11);
		b11.addActionListener(this);
		b11.setForeground(Color.white);
		b11.setBackground(Color.pink);
		
		
		
		//for lables
		
		l = new JLabel("DATA1");
		l.setBounds(50, 100, 70, 25);
		super.add(l);
		l.setForeground(Color.pink);
		
		
		
		l1 = new JLabel("DATA2");
		l1.setBounds(50, 125, 70, 25);
		super.add(l1);
		l1.setForeground(Color.pink);
		
		l2 = new JLabel("RESULT");
		l2.setBounds(50, 150, 70, 25);
		super.add(l2);
		l2.setForeground(Color.pink);
		
		l3 = new JLabel("OPERATION");
		l3.setBounds(50, 175, 70, 25);
		super.add(l3);
		l3.setForeground(Color.pink);
		
		
		// 3rd last
		super.setLayout(null);
		
		// 2nd last 
		super.setVisible(true);
		// last 
		super.setDefaultCloseOperation
		(JFrame.EXIT_ON_CLOSE);
	}
		
		
	public static void main(String[] args)
	{
		CalculatorGui m=new CalculatorGui();
		m.setGUI();
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int a = Integer.parseInt(tf.getText());
		int	b = Integer.parseInt(tf1.getText()); 
	       int c=0;  
	          c=a+b;  
	       tf2.setText(Integer.toString(a+b));
	       tf3.setText("ADDITION");
		}
	 else if(ae.getSource()==b2)
	 {  
		 {int a = Integer.parseInt(tf.getText());
			int	b = Integer.parseInt(tf1.getText()); 
		       int c=0;   
         tf2.setText(Integer.toString(a-b));}
		 tf3.setText("SUBTRACTION");
		 }
	 else if(ae.getSource()==b3)
		 { int a = Integer.parseInt(tf.getText());
			int	b = Integer.parseInt(tf1.getText()); 
		       int c=0;   
        tf2.setText(Integer.toString(a*b));
        tf3.setText("MULTIPLICATION");
		 }
	 else if(ae.getSource()==b4)
	 { int a = Integer.parseInt(tf.getText());
		int	b = Integer.parseInt(tf1.getText()); 
	       int c=0;   
       tf2.setText(Integer.toString(a/b));
       tf3.setText("DIVISION");
	 }
	 else if(ae.getSource()==b5)
	 { int a = Integer.parseInt(tf.getText());
		int	b = Integer.parseInt(tf1.getText()); 
	       int c=0;   
     tf2.setText(Integer.toString(a%b));
     tf3.setText("MODULUS");
	 }
	 else if(ae.getSource()==b7)
		{
			 int a= Integer.parseInt(tf.getText());
			 int b= Integer.parseInt(tf1.getText());
			 int c=0;
	          c=a>b?b:a; 
	          tf2.setText(Integer.toString( c));
			tf3.setText("MINIMUM");
		}
		else if(ae.getSource()==b6)
		{
			int a=Integer.parseInt(tf.getText());
			int b= Integer.parseInt(tf1.getText());
			int c=0;
			c=a>b?a:b;
			tf2.setText(Integer.toString(c));
			tf3.setText("Maximum");
		}
		else if(ae.getSource()==b8)
		 {  
		      String  s1= tf.getText(),
		         s2= tf1.getText();
		         tf2.setText(s1+s2);
		     tf3.setText("CONCATENATION"); 
		   }
		else if (ae.getSource()==b9)
		{ 
		// DateFormat df =new SimpleDateFormat("yyyy-mm-dd");
		// tf3.setText(df.format(tf3.getText()));
			area.setText("DATE"+"-7/12/2019"); 
		}
		else if(ae.getSource()==b10)
		{
			tf.setText("");  //to clear text field data1
			tf1.setText(""); //to clear text field data2
			tf2.setText(""); //to clear text field result
			tf3.setText("CLEAR");
		}
		else if (ae.getSource()==b11)
		{
			System.exit(0);
			tf3.setText("EXIT");
		}
		
	}
}