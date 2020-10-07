import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;
//�������
class ManagementPage extends JPanel implements ActionListener  {
	JPanel pnlup, pnlmid, pnldown, pnl;
	JButton btnright, btnleft;
	JTextField datetx, totaltx;
	JLabel totallbl;
	JButton closebtn;
	int nYear; 
	int nMonth; 
	int nDay;
	JButton extrabtn, eventbtn1, eventbtn2, eventbtn3, eventbtn4,extrabtn2, eventbtn5 ;
	JPanel listpnl, pnl1, pnl2,pnl3,pnl4;
	JTextField extratx;
	JLabel pictureLabel, pictureLabel2, pictureLabel3, pictureLabel4,pictureLabel5;
	ImageIcon [] icon;
	JTextField event;
	
	
	public ManagementPage () {
		this.setLayout(null);
		this.setBackground(new Color(51,153,102));
		
		
		
		pnl1 = new JPanel();
		pnl2 = new JPanel();
		pnl3 = new JPanel();
		pnl4 = new JPanel();
		
		pnl4.setLayout(null);
		pnl3.setLayout(null);
	
		pnl = new JPanel(new BorderLayout());
		pnlup = new JPanel();
		pnlmid = new JPanel(new GridLayout(0,1,10,10));
		pnldown = new JPanel();
	
		
		pnlmid.add(pnl3);
		pnlmid.add(pnl4);
		
	
		pnl.setBackground(new Color(98,166,98));
		pnlup.setBackground(new Color(98,166,98));
		pnlmid.setBackground(new Color(116,211,109));
		pnldown.setBackground(new Color(98,166,98));
		pnl.setBounds(15,10,1050,750);
		
		btnright = new JButton(">");
		btnright.setBackground(new Color(141,186,127));
		totaltx = new JTextField("9,999,999");
		btnleft = new JButton("<");
		btnleft.setBackground(new Color(141,186,127));
		totallbl = new JLabel("total");
		closebtn = new JButton("close");
		closebtn.addActionListener(this);
		
		extrabtn = new JButton("extra");
		extrabtn2 = new JButton("extra2");
		extrabtn.setBackground(new Color(105,155,103));
		extrabtn2.setBackground(new Color(105,155,103));
		extrabtn2.addActionListener(this);
		extrabtn.setBounds(50,5,120,50);
		extrabtn2.setBounds(50,70,120,50);
		extrabtn.addActionListener(this);
		
		extratx = new JTextField(45);
		extratx.setBounds(200,5,800,150);
		
		pnl3.add(extrabtn);
		pnl3.add(extrabtn2);
		pnl3.add(extratx);
		
		eventbtn1 = new JButton();
		eventbtn2 = new JButton();
		eventbtn3 = new JButton();
		eventbtn4 = new JButton();
		eventbtn5 = new JButton();
		
		
	
		Calendar calendar = new GregorianCalendar(Locale.KOREA);
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(Calendar.MONTH) + 1;
		nDay = calendar.get(Calendar.DAY_OF_MONTH);
		datetx = new JTextField( nYear + "-"+ nMonth + "-" + nDay);
		
	
		
		pnlup.add(btnleft);
		pnlup.add(datetx);
		pnlup.add(btnright);
		
	
		pnldown.add(totallbl);
		pnldown.add(totaltx);
		pnldown.add(closebtn);
		closebtn.setBackground(new Color(173,255,47));
		
		pnl.add(pnlup,BorderLayout.NORTH);
		pnl.add(pnlmid,BorderLayout.CENTER);
		pnl.add(pnldown,BorderLayout.SOUTH);
		
		pnlmid.setBounds(300,300,200,200);
		
		
		pnl3.setBackground(new Color(98,166,98));
		pnl4.setBackground(new Color(98,166,98));
		
		
		pictureLabel = new JLabel();
		eventbtn1 = new JButton();
		pnl4.add(pictureLabel);
		pnl4.add(eventbtn1);
		eventbtn1.addActionListener(this);
		ImageIcon icon = new ImageIcon("img/m1.jpg");
		eventbtn1.setIcon(icon);
		eventbtn1.setBounds(5,5,200,180);
		
		pictureLabel2 = new JLabel();
		eventbtn2 = new JButton();
		pnl4.add(pictureLabel2);
		pnl4.add(eventbtn2);
		eventbtn2.addActionListener(this);
		ImageIcon icon2 = new ImageIcon("img/m2.jpg");
		eventbtn2.setIcon(icon2);
		eventbtn2.setBounds(210,5,200,180);
		
		pictureLabel3 = new JLabel();
		eventbtn3 = new JButton();
		pnl4.add(pictureLabel3);
		pnl4.add(eventbtn3);
		eventbtn3.addActionListener(this);
		ImageIcon icon3 = new ImageIcon("img/m3.png");
		eventbtn3.setIcon(icon3);
		eventbtn3.setBounds(415,5,200,180);
		
		pictureLabel4 = new JLabel();
		eventbtn4 = new JButton();
		pnl4.add(pictureLabel4);
		pnl4.add(eventbtn4);
		eventbtn4.addActionListener(this);
		ImageIcon icon4 = new ImageIcon("img/m4.jpg");
		eventbtn4.setIcon(icon4);
		eventbtn4.setBounds(620,5,200,180);
		
		pictureLabel5 = new JLabel();
		eventbtn5 = new JButton();
		pnl4.add(pictureLabel5);
		pnl4.add(eventbtn5);
		eventbtn5.addActionListener(this);
		ImageIcon icon5 = new ImageIcon("img/m5.jpg");
		eventbtn5.setIcon(icon5);
		eventbtn5.setBounds(825,5,200,180);
		
		event = new JTextField(30);
		event.setBounds(5, 195, 1025,180);
		pnl4.add(event);
		
		
		add(pnl);
		
		
		
		
		setVisible(true);
	}

	//eventbtn1
	@Override
	public void actionPerformed(ActionEvent e) {
		if(closebtn == e.getSource()) {
		System.exit(0); 
		}else if (e.getSource()==extrabtn) {
			JOptionPane.showMessageDialog(null, "�ֹ�޸� ����ðڽ��ϱ�?", "�ֹ�޸�", JOptionPane.QUESTION_MESSAGE);
			extratx.setEditable(false);
		}else if (e.getSource()==extrabtn2) {
			JOptionPane.showMessageDialog(null, "�޸� �����Ͻðڽ��ϱ�?", "�ֹ�޸�", JOptionPane.QUESTION_MESSAGE);
			extratx.setEditable(true);
		}else if (e.getSource()==eventbtn1) {
			event.setText("2020�� 7��1�� ���� ���� ���θ�� ���Ÿ���Ŀ����Ű����Ǫġ��� �����ĸ���Ǫ��������ֽ� ��簡 ����˴ϴ�.");
		}else if (e.getSource()==eventbtn2) {
			event.setText("2020�� 9��1�� ���� ��Ű�߶���簡 ����˴ϴ� ����ǰ : �佺Ƽ�� ī��� ��Ű�ƶ�&���̽� �佺Ƽ�� ī��� ��Ű�ƶ�");
		}else if (e.getSource()==eventbtn3) {
			event.setText("2020�� 6�� 1�� ���� ��ũ ī��� �ݵ�  ��� ����Ǫġ��&���ں����&���Ӹ�������");
		}else if (e.getSource()==eventbtn4) {
			event.setText("2020�� 10��1�� ���� �ҷ��� ��� ��̰�Ʈ���ݸ�&��̰�Ʈ��ī&��������Ǫġ��");
		}else if (e.getSource()==eventbtn5) {
			event.setText("2020�� 3�� ĳ���� ����Ƽ(ĳ���� Ƽ�� ������ �ɳ����� ��ŭ������ ����� ǳ�̰� ������ ���ο� Ƽ�ٳ� Ƽ) ��ũ����(������ ����ó�� �ε巴�� ����� �� ũ���� �ε巯�� �󶼷� ��ܺ�����.");
	}
}
}


/*eventbtn = new JButton("�� �̺�Ʈ");
eventbtn.setBounds(400,500,150,150);
listpnl = new JPanel(new FlowLayout());
String [] fruits = {"�ٴҶ��", "���ڶ�", "�����̶�", "�����ڶ�", "�׸�Ƽ��", "�޷ж�", "�ٳ�����", "��ũ����","�����"}; 
JList box = new JList(fruits);
box.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

JScrollPane jp = new JScrollPane(box);

pnl2.add(eventbtn);
listpnl.add(jp);
pnl2.add(listpnl);*/