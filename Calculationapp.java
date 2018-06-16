/* Author: Brian Murimi Kivuti
   RegNO:  BIT-1-8509-2/2017
*/

//import statement that will access classes that build the frame
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculationapp extends JFrame implements ActionListener
   {
      JLabel label1,label2,label3;
      JTextField tf1,tf2,tf3;
      JButton button1;
      
      public Calculationapp()//constructor to build the look of the frame
      {
         setTitle("Calculation App");//title of the program
         setSize(450,350);//size of the frame
         
         label1 = new JLabel("First Number"); //create the label with text     
         label1.setBounds(50,50, 100,30); 
         add(label1); //Adding the label to the frame
         
         label2 = new JLabel("Second Number"); //create the label with text     
         label2.setBounds(50,150, 100,30); 
         add(label2); //Adding the label to the frame
         
         label3 = new JLabel("answer will go here");//label for the answer
         label3.setBounds(250,250, 200,30);
         add(label3);
         
         //firstnumber textfield
         tf1=new JTextField();  
         tf1.setBounds(200,50, 200,30);
         add(tf1);
         //secondnumber textfield
         tf2=new JTextField();  
         tf2.setBounds(200,150, 200,30);
         add(tf2);
         
         //calculate button
         button1 = new JButton("Calculate");
         button1.setBounds(50,250, 100,30);
         add(button1);
         
         
         setLayout(null);
         button1.addActionListener(this);
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      public void actionPerformed(ActionEvent e)//action to be performed when the "calculate button is clicked
      {
        String x1 = tf1.getText();
        String x2 = tf2.getText();
                                      //converting the string values into integers. 
        int a = Integer.parseInt(x1); 
        int b = Integer.parseInt(x2);
        
        int sum = a + b; //addition operation
        
        String result = String.valueOf(sum);
        label3.setText(result);
        
      }
      
      public static void main(String args[])
      {
         Calculationapp cal = new Calculationapp();//object of the class
         cal.setVisible(true);//display the object on the screen  
      }
   }