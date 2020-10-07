import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class DeliveryPage extends JPanel implements ActionListener {
	JPanel uppnl, midpnl, downpnl, pnl, pnl1, pnl2, pnl3, pnl4;
	JButton []  orderbtn, categorybtn, explainbtn, amountbtn, requestbtn, namebtn;
	JButton plusbtn;
	JButton btn1, btn2, btn3, btn4;
	

	public DeliveryPage(){
		this.setLayout(null);
		this.setBackground(new Color(51,153,102));
		
		btn1 = new JButton("����");
		btn2 = new JButton("����");
		btn3 = new JButton("�ŷ�ó");
		btn4 = new JButton("���ֻ���");
		btn1.setBackground(new Color(115,195,108));
		btn2.setBackground(new Color(115,195,108));
		btn3.setBackground(new Color(115,195,108));
		btn4.setBackground(new Color(115,195,108));
		
		uppnl = new JPanel();
		midpnl = new JPanel();
		downpnl = new JPanel();
		pnl1 = new JPanel();
		pnl2 = new JPanel();
		pnl3 = new JPanel();
		pnl4 = new JPanel();
		uppnl.setBackground(new Color(98,166,98));
		uppnl.setBounds(40,15,1000,50);
		uppnl.setLayout(new GridLayout(1,0,10,10));
		uppnl.add(btn1);
		uppnl.add(btn2);
		uppnl.add(btn3);
		uppnl.add(btn4);
		
		this.setBackground(new Color(98,166,98));
		midpnl.setBackground(new Color(98,166,98));
		

		plusbtn = new JButton("���ֿ�û");
		plusbtn.setBackground(new Color(173,255,47));
		plusbtn.setBounds(865,695,155,50);
		
		
	
	String order[] = {"����","����","���̽�Ĩ","ũ��","����","����","��","��Ȧ��"}; //��ư�ȿ� �� ����
	orderbtn = new JButton [8]; //��ư 10�� ����
		for(int num=0; num<=7; num++) { //for ���� 0���� �����̶� 9���� �۰�
			orderbtn[num] =new JButton(order[num]);
			pnl1.add(orderbtn[num]);
			orderbtn[num].setBackground(new Color(141,186,127));
		}
		
		midpnl.add(pnl1);
		pnl1.setLayout(new GridLayout(0,1,10,10));
		
		String cate []= {"3KG","3L","1KG","1�ڽ�","1�ڽ�","2�ڽ�","4�ڽ�","2�ڽ�"};
		categorybtn = new JButton [8];
		for(int num=0; num<=7; num++) {
			categorybtn[num] =new JButton(cate[num]);
			pnl2.add(categorybtn[num]);
			categorybtn[num].setBackground(new Color(141,186,127));
		}
		midpnl.add(pnl2);
		pnl2.setLayout(new GridLayout(0,1,10,10));
		
		String name []= {"�̵��","����","�����÷��̽�","������","����Ƽ","��ٹ�","������","ũ����Ʈ"};
		namebtn = new JButton [8];
		for(int num=0; num<=7; num++) {
			namebtn[num] =new JButton(name[num]);
			pnl3.add(namebtn[num]);
			namebtn[num].setBackground(new Color(141,186,127));
		}
		midpnl.add(pnl3);
		pnl3.setLayout(new GridLayout(0,1,10,10));
		
		String plus[] = {"������","����Ϸ�","������","����Ϸ�","������","����Ϸ�","������","����Ϸ�"};
		amountbtn = new JButton [8];
		for(int num=0; num<=7; num++) {
			amountbtn[num] =new JButton(plus[num]);
			pnl4.add(amountbtn[num]);
			amountbtn[num].setBackground(new Color(141,186,127));
		}
		midpnl.add(pnl4);
		pnl4.setLayout(new GridLayout(0,1,10,10));
		
		midpnl.setBounds(40, 100, 1000, 560);
		
		plusbtn.addActionListener(this);
		
	/*for(int i=0; i<namebtn.length; i++) {
		midpnl.add(categorybtn[i]);
		midpnl.add(namebtn[i]);
		midpnl.add(amountbtn[i]);
		midpnl.add(orderbtn[i]);
	}*/
		
		pnl1.setBackground(new Color(98,166,98));
		pnl2.setBackground(new Color(98,166,98));
		pnl3.setBackground(new Color(98,166,98));
		pnl4.setBackground(new Color(98,166,98));
		
		midpnl.setLayout(new GridLayout(1,0,10,10));
		add(uppnl);
		add(downpnl);
		add(plusbtn);
		add(midpnl);
		

		setVisible(true);
		
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(plusbtn == e.getSource()){
			JOptionPane.showMessageDialog(null, "���ְ� �Ϸ�Ǿ����ϴ�.");
		}
	}
}

