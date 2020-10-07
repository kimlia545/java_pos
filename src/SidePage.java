import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SidePage extends JPanel{
	JButton supportbtn, logoutbtn;
	JButton infobtn, orderbtn, orderlistbtn, deliverybtn, deliverylistbtn, employeebtn;
	static JButton moneybtn;
	
	public SidePage() {
		this.setLayout(null);
		this.setBackground(new Color(46,139,87));
		Font font = new Font("���� ���", Font.BOLD, 18);	
		
		supportbtn = new JButton("support");
		supportbtn.setBackground(new Color(144,238,144));
		supportbtn.setBounds(0, 10, 100, 30);
		supportbtn.setFont(font);
		
		logoutbtn = new JButton("logout");
		logoutbtn.setBackground(new Color(0,128,0));
		logoutbtn.setBounds(100, 10, 100, 30);
		logoutbtn.setFont(font);
		
		infobtn = new JButton("info");
		infobtn.setBackground(new Color(60,179,113));
		infobtn.setBounds(20, 100, 150, 30);
		infobtn.setFont(font);
		
		orderbtn = new JButton("order");
		orderbtn.setBackground(new Color(60,179,113));
		orderbtn.setBounds(20, 150, 150, 30);
		orderbtn.setFont(font);
		
		orderlistbtn = new JButton("orderlist");
		orderlistbtn.setBackground(new Color(60,179,113));
		orderlistbtn.setBounds(20, 200, 150, 30);
		orderlistbtn.setFont(font);
		
		deliverybtn = new JButton("delivery");
		deliverybtn.setBackground(new Color(60,179,113));
		deliverybtn.setBounds(20, 250, 150, 30);
		deliverybtn.setFont(font);
		
		deliverylistbtn = new JButton("deliverylist");
		deliverylistbtn.setBackground(new Color(60,179,113));
		deliverylistbtn.setBounds(20, 300, 150, 30);
		deliverylistbtn.setFont(font);
		
		
		employeebtn = new JButton("employee");
		employeebtn.setBackground(new Color(60,179,113));
		employeebtn.setBounds(20, 350, 150, 30);
		employeebtn.setFont(font);
		
		moneybtn = new JButton("money");
		moneybtn.setBackground(new Color(60,179,113));	
		moneybtn.setBounds(20, 400, 150, 30);
		moneybtn.setFont(font);
		
		this.add(supportbtn);
		this.add(logoutbtn);
		this.add(infobtn);
		this.add(orderbtn);
		this.add(orderlistbtn);
		this.add(deliverybtn);
		this.add(deliverylistbtn);
		this.add(employeebtn);
		this.add(moneybtn);
		
	}
}