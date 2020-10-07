import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


class OrderMenu extends JPanel implements ActionListener {

	JButton[] drinkbtn = new JButton[16];
	
	OrderMenu(){
	JPanel pnl = new JPanel();
	this.setBackground(new Color(98,166,98));
	pnl.setBackground(new Color(98,166,98));
	
	 
	String[] drink = {"에스프레소","카라멜마끼아또","에스프레소콘파냐","돌체라떼","카페라떼","카푸치노","카페모카","아메리카노",
			"화이트모카","오레오프라푸치노","이탈리안소다","그린티라떼","바닐라라떼","허브티","곡물라떼","핫초코"};

	for(int i=0; i<drink.length; i++){
		drinkbtn[i] = new JButton();
		drinkbtn[i].setText(drink[i]);	//버튼에 글자 넣기	
		pnl.add(drinkbtn[i]);
		this.add(pnl);
		pnl.setLayout(new FlowLayout());
		pnl.setPreferredSize(new Dimension(630,340));
		drinkbtn[i].setPreferredSize(new Dimension(150,75));
		drinkbtn[i].setBackground(new Color(141,186,127));
	}
	
	setVisible(true);

}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 자동 생성된 메소드 스텁
		
	}

}
