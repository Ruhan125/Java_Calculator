import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
 




public class CalculatorOne {
	
	
	static double num1,num2;
	static char ope;
 
 
 
	public static void main(String[] args)
	{
 
 
		JFrame frame = new JFrame("Calculator");
		frame.setSize(360,450);
		
	    frame.setDefaultCloseOperation(3);
	    frame.setLayout(null); 
		frame.setLocationRelativeTo(null);
		
		JPanel panel1 = new JPanel();
		JPanel panel2= new JPanel();
		
		panel1.setBounds(10,10,320,100);
		panel1.setBackground(Color.gray);
		panel1.setLayout(null);
 
		final JTextField jtf = new JTextField();
		jtf.setBounds(8,8,305,85);
		jtf.setFont(new Font("Arial", Font.BOLD, 28));
 
		panel1.add(jtf);
 
		panel2.setBounds(10,120,320,270);
		panel2.setBackground(Color.black);
		panel2.setLayout(new GridLayout(4,4,5,5));
		frame.add(panel2);
 
		JButton zero = new JButton("0");
		zero.setFont(new Font("Arial", Font.BOLD, 28));
		zero.setBackground(Color.gray);
		zero.setForeground(Color.white);
		zero.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent e)
			      {
			    	  String st = jtf.getText();
			    	  if(st.equals("0"))
			    	  {
			    		  st="";
 
			    	  }
			    	  jtf.setText(st+"0");
			      }
 
 
 
				});
		
 
		JButton one = new JButton("1");
		one.setFont(new Font("Arial", Font.BOLD, 28));
		one.setBackground(Color.gray);
		one.setForeground(Color.white);
		one.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"1");
	      }
 
 
 
		});
		
		
		JButton two = new JButton("2");
		two.setFont(new Font("Arial", Font.BOLD, 28));
		two.setBackground(Color.gray);
		two.setForeground(Color.white);
		two.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"2");
	      }
 
 
 
		});
		
		
		JButton three = new JButton("3");
		three.setFont(new Font("Arial", Font.BOLD, 28));
		three.setBackground(Color.gray);
		three.setForeground(Color.white);
		three.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"3");
	      }
 
 
 
		});
		
		
		JButton four = new JButton("4");
		four.setFont(new Font("Arial", Font.BOLD, 28));
		four.setBackground(Color.gray);
		four.setForeground(Color.white);
		four.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"4");
	      }
 
 
 
		});
		
		
		JButton five = new JButton("5");
		five.setFont(new Font("Arial", Font.BOLD, 28));
		five.setBackground(Color.gray);
		five.setForeground(Color.white);
		five.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"5");
	      }
 
 
 
		});
		
		
		JButton six = new JButton("6");
		six.setFont(new Font("Arial", Font.BOLD, 28));
		six.setBackground(Color.gray);
		six.setForeground(Color.white);
		six.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"6");
	      }
 
 
 
		});
		
		
		JButton seven = new JButton("7");
		seven.setFont(new Font("Arial", Font.BOLD, 28));
		seven.setBackground(Color.gray);
		seven.setForeground(Color.white);
		seven.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"7");
	      }
 
 
 
		});
		
		
		JButton eight = new JButton("8");
		eight.setFont(new Font("Arial", Font.BOLD, 28));
		eight.setBackground(Color.gray);
		eight.setForeground(Color.white);
		eight.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.equals("0"))
	    	  {
	    		  st="";
 
	    	  }
	    	  jtf.setText(st+"8");
	      }
 
 
 
		});
		
		JButton nine = new JButton("9");
		nine.setFont(new Font("Arial", Font.BOLD, 28));
		nine.setBackground(Color.gray);
		nine.setForeground(Color.white);
		nine.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent e)
			      {
			    	  String st = jtf.getText();
			    	  if(st.equals("0"))
			    	  {
			    		  st="";
 
			    	  }
			    	  jtf.setText(st+"9");
			      }
 
 
 
				});
 
		
		JButton plus = new JButton("+");
		plus.setFont(new Font("Arial", Font.BOLD, 28));
		plus.setBackground(Color.orange);
		plus.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  num1 = Double.valueOf(st);
		    	  ope = '+';
 
	    	  }
 
 
	      }
 
 
 
		});
		
		
		JButton minus = new JButton("-");
		minus.setFont(new Font("Arial", Font.BOLD, 28));
		minus.setBackground(Color.orange);
		minus.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  num1 = Double.valueOf(st);
		    	  ope = '-';
 
	    	  }
 
 
	      }
 
 
 
		});
		
		
		JButton div = new JButton("/");
		div.setFont(new Font("Arial", Font.BOLD, 28));
		div.setBackground(Color.orange);
		div.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  num1 = Double.valueOf(st);
		    	  ope = '/';
 
	    	  }
 
 
	      }
 
 
 
		});
		
		JButton mult = new JButton("X");
		mult.setFont(new Font("Arial", Font.BOLD, 28));
		mult.setBackground(Color.orange);
		mult.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  num1 = Double.valueOf(st);
		    	  ope = 'x';
 
	    	  }
 
 
	      }
 
 
 
		});
		
		JButton doub = new JButton(".");
		doub.setFont(new Font("Arial", Font.BOLD, 28));
		doub.setBackground(Color.gray);
		doub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				 String st = jtf.getText();
				 jtf.setText(st+".");
				 
			}
			
				}
				
				
				);
		
		JButton per = new JButton("%");
		per.setFont(new Font("Arial", Font.BOLD, 28));
		per.setBackground(Color.orange);
		per.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  num1 = Double.valueOf(st);
		    	  ope = '%';
 
	    	  }
 
 
	      }
 
 
 
		});
		
		
		JButton equal = new JButton("=");
		equal.setFont(new Font("Arial", Font.BOLD, 28));
		equal.setBackground(Color.orange);
		equal.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	 String st = jtf.getText();
	    	 if(st.length()>0 && ope =='+' || ope == '-' || ope == 'x' || ope =='/'|| ope == '%')
	    	 {
	    		 num2 = Double.valueOf(st);
 
		    	 Double result =0.0;
		    	 if(ope=='+')
		    		 result= num1+num2;
		    	 else if (ope== '-')
		    		 result = num1-num2;
		    	 else if(ope=='x')
		    		 result = num1*num2;
		    	 else if(ope=='/')
		    		 result = num1/num2;
		    	 else if(ope=='%')
		    		 result = num1*num2/100;
 
 
		    	 jtf.setText(Double.toString(result));
 
 
	    	 }
	    	 ope = ' ';
 
 
 
	      }
 
		});
		
		
		JButton del= new JButton("AC");
		
		del.setFont(new Font("Arial", Font.BOLD, 18));
		del.setBackground(Color.orange);
		del.addActionListener(new ActionListener()
		{
	      public void actionPerformed(ActionEvent e)
	      {
	    	  String st = jtf.getText();
	    	  if(st.length()>0)
	    	  {
	    		  jtf.setText("");
		    	  
		    	
 
	    	  }
 
 
	      }
 
 
 
		});
		
		
		
        frame.getContentPane().setBackground(Color.black);
      
        
        panel2.add(one);
		panel2.add(two);
		panel2.add(three);
		panel2.add(plus);
		panel2.add(minus);
		panel2.add(four);
		panel2.add(five);
		panel2.add(six);
		panel2.add(mult);
		panel2.add(div);
		panel2.add(seven);
		panel2.add(eight);
		panel2.add(nine);
		panel2.add(equal);
		panel2.add(per);
		panel2.add(zero);
	    panel2.add(doub);
	    panel2.add(del);
	   
		frame.add(panel1);
		frame.setVisible(true);
 
 
}

}















