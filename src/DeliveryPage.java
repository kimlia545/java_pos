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
		
		btn1 = new JButton("종류");
		btn2 = new JButton("수량");
		btn3 = new JButton("거래처");
		btn4 = new JButton("발주상태");
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
		

		plusbtn = new JButton("발주요청");
		plusbtn.setBackground(new Color(173,255,47));
		plusbtn.setBounds(865,695,155,50);
		
		
	
	String order[] = {"원두","원액","라이스칩","크림","얼음","빨대","컵","컵홀더"}; //버튼안에 들어갈 글자
	orderbtn = new JButton [8]; //버튼 10개 생성
		for(int num=0; num<=7; num++) { //for 구문 0부터 시작이라서 9보다 작게
			orderbtn[num] =new JButton(order[num]);
			pnl1.add(orderbtn[num]);
			orderbtn[num].setBackground(new Color(141,186,127));
		}
		
		midpnl.add(pnl1);
		pnl1.setLayout(new GridLayout(0,1,10,10));
		
		String cate []= {"3KG","3L","1KG","1박스","1박스","2박스","4박스","2박스"};
		categorybtn = new JButton [8];
		for(int num=0; num<=7; num++) {
			categorybtn[num] =new JButton(cate[num]);
			pnl2.add(categorybtn[num]);
			categorybtn[num].setBackground(new Color(141,186,127));
		}
		midpnl.add(pnl2);
		pnl2.setLayout(new GridLayout(0,1,10,10));
		
		String name []= {"이디야","공차","투썸플레이스","컴포즈","더벤티","백다방","조지아","크래프트"};
		namebtn = new JButton [8];
		for(int num=0; num<=7; num++) {
			namebtn[num] =new JButton(name[num]);
			pnl3.add(namebtn[num]);
			namebtn[num].setBackground(new Color(141,186,127));
		}
		midpnl.add(pnl3);
		pnl3.setLayout(new GridLayout(0,1,10,10));
		
		String plus[] = {"결재대기","결재완료","결재대기","결재완료","결재대기","결재완료","결재대기","결재완료"};
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
			JOptionPane.showMessageDialog(null, "발주가 완료되었습니다.");
		}
	}
}

