import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class OrderCalc  extends JPanel implements ActionListener {
 JTextField inputText;
 String names[] = {"C", "/", "*", "-" ,"7", "8", "9", "+", "4", "5", "6", "=", "1", "2", "3", "0"};
 int numOne, total, oper;
  

 public OrderCalc()
 {
  //super("자바 계산기");
  
  BorderLayout layout = new BorderLayout(2, 2); 
  setLayout(layout); 
    
  inputText = new JTextField("", SwingConstants.CENTER); 
  inputText.setHorizontalAlignment(JTextField.RIGHT); 
  inputText.setFont(new Font(Font.SERIF, Font.BOLD, 40));
  inputText.setBounds(0,0,450,50);

  
  JPanel pad = new JPanel(new GridLayout(4, 4));
  pad.setBackground(new Color(98,166,98));
  JButton buttons[] = new JButton[names.length];
  
  
  for(int count = 0; count < names.length; count++)
  {
    buttons[count] = new JButton(names[count]);
    buttons[count].setFont(new Font(Font.SERIF, Font.BOLD, 20));
    pad.add(buttons[count]);
    PadInput handler = new PadInput();
    buttons[count].addActionListener(handler);
    buttons[count].setBackground(new Color(141,186,127));
  }  
  
  add(inputText, BorderLayout.NORTH);
  add(pad, BorderLayout.CENTER);

    numOne = 0;
    total = 0;
    oper = 0; 
  
 }

private class PadInput implements ActionListener {
    public void actionPerformed(ActionEvent event) {
       String eventText = event.getActionCommand();

   if(eventText.equals("C"))
   {
    inputText.setText("");
    numOne = 0;
    total = 0;
   
   } 
   else if(eventText.equals("+")){
    inputText.setText("");
    total += numOne;
    oper=0;   
   }
   else if(eventText.equals("-")){
     inputText.setText("");
     total += numOne;
     oper = 1;
   } 

   else if(eventText.equals("*")){
    inputText.setText("");
    total += numOne;
    oper=2;   
   }
   else if(eventText.equals("/")){
     inputText.setText("");
     total += numOne;
     oper = 3;
   } 
   else if(eventText.equals("="))
   {
      if(oper==0){
      total += numOne;
      inputText.setText(""+total);
      numOne = 0;
    
      }
      else if(oper==1){
      total -= numOne;
      inputText.setText(""+total);
      numOne = 0;
    
      }
      else if(oper==2){
      total *= numOne;
      inputText.setText(""+total);
      numOne = 0;
    
      }
      else if(oper==3){
      total /= numOne;
      inputText.setText(""+total);
      numOne = 0;
     
      }
   
   }
   else 
   {
   String  c_num = inputText.getText()+event.getActionCommand();
   inputText.setText(c_num);
   numOne = Integer.parseInt(c_num);
  
   }  
}
    
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO 자동 생성된 메소드 스텁
}	
}