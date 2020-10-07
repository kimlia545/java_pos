import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class OrderPos extends JPanel implements ActionListener {
	JPanel totalpnl, balancepnl, pricepnl, amountpnl, btnpnl, pospnl;
	JLabel totallbl, balancelbl, pricelbl, amountlbl, resultlbl;
	JTextField totaltx, balancetx, pricetx, amounttx, resulttx;
	JButton yesbtn, nobtn; 
	JRadioButton cashbtn, cardbtn;
	ButtonGroup bg; 
	
	OrderPos (){
		
		yesbtn = new JButton("결제");
		nobtn = new JButton("취소");
		btnpnl = new JPanel();
		btnpnl.setBackground(new Color(98,166,98));
		yesbtn.setBackground(new Color(57,131,66));
		nobtn.setBackground(new Color(57,131,66));
		
		
		cardbtn = new JRadioButton("카드");
		cashbtn = new JRadioButton("현금");
		cardbtn.setSelected(true);
		bg = new ButtonGroup();
		bg.add(cardbtn);
		bg.add(cashbtn);
		
		
		cardbtn.setBackground(new Color(57,131,66));
		cashbtn.setBackground(new Color(57,131,66));
		btnpnl.add(yesbtn);
		btnpnl.add(nobtn);
		btnpnl.add(cardbtn);
		btnpnl.add(cashbtn);
		
		totallbl = new JLabel("총매출액");
		totaltx = new JTextField(10);
		totaltx.setEnabled(false);
		totalpnl = new JPanel();
		totalpnl.add(totallbl);
		totalpnl.add(totaltx);
		//totaltx.setBackground(new Color(204.235.197));
	
		pricelbl = new JLabel("받을금액");
		pricetx= new JTextField(10);
		pricepnl = new JPanel();
		pricetx.setEnabled(false);
		pricepnl.add(pricelbl);
		pricepnl.add(pricetx);
	
		
	
		amountlbl = new JLabel("받은금액");
		amounttx = new JTextField(10);
		amountpnl = new JPanel();
		amounttx.setEnabled(false);
		amountpnl.add(amountlbl);
		amountpnl.add(amounttx);
		
		
		balancelbl = new JLabel("거스름돈");
		balancetx= new JTextField(10);
		balancepnl  = new JPanel();
		balancetx.setEnabled(false);
		balancepnl.add(balancelbl);
		balancepnl.add(balancetx);
		
		pospnl  = new JPanel();
		pospnl.setLayout(new GridLayout(0,1));
		pospnl.add(totalpnl);
		pospnl.add(pricepnl);
		pospnl.add(amountpnl);
		pospnl.add(balancepnl);
		pospnl.add(btnpnl);
		add(pospnl);

		totalpnl.setBackground(new Color(98,166,98));
		pricepnl.setBackground(new Color(98,166,98));
		amountpnl.setBackground(new Color(98,166,98));
		balancepnl.setBackground(new Color(98,166,98));
		pospnl.setBackground(new Color(98,166,98));
		this.setBackground(new Color(98,166,98));
		
		setVisible(true);
	
	}
	
		public static void main(String args[]){
			new OrderPos();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 자동 생성된 메소드 스텁
		
			
		}

}

		