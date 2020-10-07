import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.swing.*;

public class MainPage extends JFrame implements ActionListener {
	LogPage log;
	InfoPage info;
	SidePage side;
	OrderPage order;
	OrderHistory history;
	DeliveryPage delivery;
	Deliverylist list;
	ManagementPage management;
	Calendar cal;
	JPanel mainpnl;
	Employee emp;
	
	public MainPage() {
		setSize(1280,800); //������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //xŬ���� ����
		setResizable(false); //ũ�⸦ �����Ҽ� ���� ���� 
		setTitle("��Ÿ����"); 
		Calendar cal = Calendar.getInstance(); 
		cal.set(2020,04,23);  
		cal.add(Calendar.YEAR, +2); //2���
		
		emp = new Employee();
		log = new LogPage();
		info = new InfoPage();
		side = new SidePage();
		order = new OrderPage();
		history = new OrderHistory();
		delivery = new DeliveryPage();
		list = new Deliverylist();
		management = new ManagementPage();
		mainpnl = new JPanel();
		
		mainpnl.setLayout(null); //��ġ������ null �� ��ǥ ���� ����� ��
		///////////////////////////////////////////////////////
		log.logbtn.addActionListener(this);
		log.setBounds(0, 0,1280, 800);
		info.setBounds(200, 0, 1080, 800);
		side.setBounds(0,0,400,800);
		order.setBounds(200, 0, 1080, 800);
		history.setBounds(200, 0, 1080, 800);
		delivery.setBounds(200, 0, 1080, 800);
		list.setBounds(200, 0, 1080, 800);
		management.setBounds(200, 0, 1080, 800);
		emp.setBounds(200, 0, 1080, 800);
		
		mainpnl.add(log);
		side.logoutbtn.addActionListener(this); //��ư �׼Ǹ�����
		side.infobtn.addActionListener(this);
		side.orderbtn.addActionListener(this);
		side.orderlistbtn.addActionListener(this);
		side.deliverybtn.addActionListener(this); 
		side.deliverylistbtn.addActionListener(this);
		side.employeebtn.addActionListener(this);
		side.moneybtn.addActionListener(this);
		info.infobtn.addActionListener(this);
		
		
		///////////////////////////////////////////////////////
		this.add(mainpnl);
		setVisible(true); //ȭ���� ���̰�
	}
		
	public static void main (String args[]) throws IOException {
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new MainPage();
		/*Static_FileInOut.fileWrite("info/Test.txt", "������"); // ���� ����
		
		String tempFile = Static_FileInOut.fileRead("info/Test.txt"); // �ڷ� �����̱�
		tempFile = tempFile.concat("\n�߰�����1");
		
		Static_FileInOut.fileWrite("info/Test.txt", tempFile); // ������ ���� ����
*/	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		log.idtx.setText("star"); //���̵�
		log.pstx.setText("1234"); //��й�ȣ
		
		if(e.getSource()==log.logbtn&&log.idtx.getText().equals("star") && new String(log.pstx.getText()).equals("1234")) {
			mainpnl.removeAll(); //ȭ�� �� �����
			JOptionPane.showMessageDialog(null, "�α����Ͽ����ϴ�."); 
			mainpnl.add(info);
			mainpnl.add(side);
			mainpnl.revalidate(); // ȭ��
			mainpnl.repaint();	//  �ٽ� ǥ��		
		}
		else if (e.getSource()==side.logoutbtn) {
			mainpnl.removeAll();
			JOptionPane.showMessageDialog(null, "�α׾ƿ��Ͽ����ϴ�.");
			mainpnl.add(log);
			mainpnl.revalidate();
			mainpnl.repaint();
		}
		else if (e.getSource()==info.infobtn) {
			info.txtime.setText("2019.11.22-2022.11.21");
			mainpnl.revalidate();
			mainpnl.repaint();	
		}
		else if(e.getSource()==side.orderbtn) { //side��ư�� ������
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(order);
			mainpnl.add(side);
			side.orderbtn.setBackground(new Color(198,228,191)); //��ư ���� ����
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		
		else if(e.getSource()==side.orderlistbtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(history);
			mainpnl.add(side);
			side.orderlistbtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		else if(e.getSource()==side.deliverybtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(delivery);
			mainpnl.add(side);
			side.deliverybtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		else if(e.getSource()==side.deliverylistbtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(list);
			mainpnl.add(side);
			side.deliverylistbtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		else if(e.getSource()==side.employeebtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(emp);
			mainpnl.add(side);
			side.employeebtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		
		else if(e.getSource()==side.moneybtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(management);
			mainpnl.add(side);
			SidePage.moneybtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		else if(e.getSource()==side.infobtn) {
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(info);
			mainpnl.add(side);
			side.infobtn.setBackground(new Color(198,228,191));
			mainpnl.revalidate();
			mainpnl.repaint();			
		}
		
	}

	void colorDefautl() {
		// �޼ҵ� Ŭ���� ��ư�� ������ �޶�������
		side.infobtn.setBackground(new Color(60,179,113));
		side.orderbtn.setBackground(new Color(60,179,113));
		side.orderlistbtn.setBackground(new Color(60,179,113));
		side.deliverybtn.setBackground(new Color(60,179,113));
		side.deliverylistbtn.setBackground(new Color(60,179,113));
		side.employeebtn.setBackground(new Color(60,179,113));
		side.moneybtn.setBackground(new Color(60,179,113));
	}

}

	