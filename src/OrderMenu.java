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
	
	 
	String[] drink = {"����������","ī��Ḷ���ƶ�","�������������ĳ�","��ü��","ī���","īǪġ��","ī���ī","�Ƹ޸�ī��",
			"ȭ��Ʈ��ī","����������Ǫġ��","��Ż���ȼҴ�","�׸�Ƽ��","�ٴҶ��","���Ƽ","���","������"};

	for(int i=0; i<drink.length; i++){
		drinkbtn[i] = new JButton();
		drinkbtn[i].setText(drink[i]);	//��ư�� ���� �ֱ�	
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
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}

}
