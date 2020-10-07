import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Dialog2 extends JDialog implements ActionListener{
	JButton btn1,btn2;
	JPanel pnl, pnldown;
	JTextField tf1, tf2, tf3, tf4, tf5;
	JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
	
	public Dialog2(){
		setSize(700,600);
		this.setBackground(new Color(98,166,98));
		//{"�����̸�","����ó","�ٹ�����","�ٹ��ð�","�ٹ�����"
		setTitle("��������");
		btn1 = new JButton("Ȯ��");
		btn2 = new JButton("���");
		
		pnl = new JPanel();
		
		lbl1 = new JLabel("�����̸�");
		lbl2 = new JLabel("����ó");
		lbl3 = new JLabel("�ٹ�����");
		lbl4 = new JLabel("�ٹ��ð�");
		lbl5 = new JLabel("�ٹ�����");
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		tf4 = new JTextField(20);
		tf5 = new JTextField(20);
		
		pnl.setLayout(new GridLayout(0,1,5,5));
		pnldown = new JPanel();
		
		
		pnl.add(lbl1);
		pnl.add(tf1);
		pnl.add(lbl2);
		pnl.add(tf2);
		pnl.add(lbl3);
		pnl.add(tf3);
		pnl.add(lbl4);
		pnl.add(tf4);
		pnl.add(lbl5);
		pnl.add(tf5);
		
		pnldown.add(btn1);
		pnldown.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		pnl.add(pnldown);
		add(pnl);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btn2 == e.getSource()){
			dispose();
		}
		else if (btn1 == e.getSource()) {
			tf1.getText();
			tf2.getText();
			dispose();
		}
	}
}