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
		setSize(1280,800); //사이즈
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x클릭시 종료
		setResizable(false); //크기를 조절할수 없게 조정 
		setTitle("스타벅스"); 
		Calendar cal = Calendar.getInstance(); 
		cal.set(2020,04,23);  
		cal.add(Calendar.YEAR, +2); //2년뒤
		
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
		
		mainpnl.setLayout(null); //배치관리자 null 값 좌표 지정 해줘야 함
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
		side.logoutbtn.addActionListener(this); //버튼 액션리스너
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
		setVisible(true); //화면이 보이게
	}
		
	public static void main (String args[]) throws IOException {
		try{
			UIManager.setLookAndFeel
			("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e){
			System.out.println("ERROR");
		}
		new MainPage();
		/*Static_FileInOut.fileWrite("info/Test.txt", "스누피"); // 파일 저장
		
		String tempFile = Static_FileInOut.fileRead("info/Test.txt"); // 자료 덧붙이기
		tempFile = tempFile.concat("\n추가직원1");
		
		Static_FileInOut.fileWrite("info/Test.txt", tempFile); // 덧붙인 파일 저장
*/	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		log.idtx.setText("star"); //아이디
		log.pstx.setText("1234"); //비밀번호
		
		if(e.getSource()==log.logbtn&&log.idtx.getText().equals("star") && new String(log.pstx.getText()).equals("1234")) {
			mainpnl.removeAll(); //화면 다 지우기
			JOptionPane.showMessageDialog(null, "로그인하였습니다."); 
			mainpnl.add(info);
			mainpnl.add(side);
			mainpnl.revalidate(); // 화면
			mainpnl.repaint();	//  다시 표시		
		}
		else if (e.getSource()==side.logoutbtn) {
			mainpnl.removeAll();
			JOptionPane.showMessageDialog(null, "로그아웃하였습니다.");
			mainpnl.add(log);
			mainpnl.revalidate();
			mainpnl.repaint();
		}
		else if (e.getSource()==info.infobtn) {
			info.txtime.setText("2019.11.22-2022.11.21");
			mainpnl.revalidate();
			mainpnl.repaint();	
		}
		else if(e.getSource()==side.orderbtn) { //side버튼을 누를시
			colorDefautl();
			mainpnl.removeAll();
			mainpnl.add(order);
			mainpnl.add(side);
			side.orderbtn.setBackground(new Color(198,228,191)); //버튼 배경색 지정
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
		// 메소드 클릭한 버튼만 색깔이 달라지도록
		side.infobtn.setBackground(new Color(60,179,113));
		side.orderbtn.setBackground(new Color(60,179,113));
		side.orderlistbtn.setBackground(new Color(60,179,113));
		side.deliverybtn.setBackground(new Color(60,179,113));
		side.deliverylistbtn.setBackground(new Color(60,179,113));
		side.employeebtn.setBackground(new Color(60,179,113));
		side.moneybtn.setBackground(new Color(60,179,113));
	}

}

	