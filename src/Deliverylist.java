
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;

class Deliverylist extends JPanel implements ActionListener {
	JPanel onepnl, twopnl, threepnl, fourpnl, totalpnl, downpnl;
	JButton downrightbtn, downleftbtn, pagebtn; 
	JButton [] orderbtn;
	JButton [] infobtn; 
	JButton [] statusbtn;
	JButton [] paymentbtn; 
	JButton rightbtn, leftbtn, paybtn, checkbtn;
	JTextField datetx;
	int nYear, nMonth, nDay; 
	JPanel uppnl;
	int dayClicked = 0;
	int i = 1;

	
	JButton addbtn;

	public Deliverylist(){
		this.setLayout(null);
		this.setBackground(new Color(98,166,98));
		

		onepnl = new JPanel();
		twopnl = new JPanel();
		threepnl = new JPanel();
		fourpnl = new JPanel();
		totalpnl = new JPanel();
		onepnl.setBackground(new Color(98,166,98));
		twopnl.setBackground(new Color(98,166,98));
		threepnl.setBackground(new Color(98,166,98));
		fourpnl.setBackground(new Color(98,166,98));
		totalpnl.setBackground(new Color(98,166,98));
		
		leftbtn = new JButton("<");
		rightbtn = new JButton(">");
		leftbtn.setBackground(new Color(141,186,127));
		rightbtn.setBackground(new Color(141,186,127));
		rightbtn.addActionListener(this);
		leftbtn.addActionListener(this);
		
		
		Calendar calendar = new GregorianCalendar(Locale.KOREA); //달력
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(Calendar.MONTH) + 1;
		nDay = calendar.get(Calendar.DAY_OF_MONTH);
		datetx = new JTextField( nYear + "-"+ nMonth + "-" + nDay);
	
		uppnl = new JPanel();
		
		uppnl.add(leftbtn);
		uppnl.add(datetx);
		uppnl.add(rightbtn);

		add(uppnl);
		uppnl.setBounds(40,15,1000,50);
		uppnl.setBackground(new Color(98,166,98));
	
		leftbtn.setBackground(new Color(141,186,127));
		rightbtn.setBackground(new Color(141,186,127));
	
		String order[] = {"발주번호1","발주번호2","발주번호3","발주번호4","발주번호5","발주번호6","발주번호7","발주번호8","발주번호9"};
		orderbtn = new JButton[9];
		for(int num=0; num<=8; num++) {
			orderbtn[num] = new JButton(order[num]);
			onepnl.add(orderbtn[num]);
			orderbtn[num].setBackground(new Color(141,186,127));
		}
		
		totalpnl.add(onepnl);
		onepnl.setLayout(new GridLayout(0,1,10,10));
		
		String info[] = {"100000원 10개","110000원 1개","25000원 5개","16500원 3개","5500원 1개","10500원 6개","50000원 1개","100000원 2개","20000원 5개",};
		infobtn = new JButton [9];
		for(int num =0; num<=8; num++) {
			infobtn[num] = new JButton(info[num]);
			twopnl.add(infobtn[num]);
			infobtn[num].setBackground(new Color(141,186,127));
		}
		
		totalpnl.add(twopnl);
		twopnl.setLayout(new GridLayout(0,1,10,10));
		
		String pay[] = {"카드","현금","카드","카드","현금","현금","카드","카드","현금"};
		paymentbtn = new JButton [9];
		for(int num=0; num<=8; num++) {
			paymentbtn[num] =new JButton(pay[num]);
			threepnl.add(paymentbtn[num]);
			paymentbtn[num].setBackground(new Color(141,186,127));
		}
		
		threepnl.setLayout(new GridLayout(0,1,10,10));
		totalpnl.add(threepnl);
		
		String status[] = {"배달완료","결재완료","결재대기","배달중","결재완료","배달완료","결재대기","배달중","배달중"};
		statusbtn = new JButton [9];
		for(int num=0; num<=8; num++) {
			statusbtn[num] =new JButton(status[num]);
			fourpnl.add(statusbtn[num]);
			statusbtn[num].setBackground(new Color(141,186,127));
		}
		
		fourpnl.setLayout(new GridLayout(0,1,10,10));
		totalpnl.add(fourpnl);
		
		totalpnl.setLayout(new GridLayout(1,0,10,10));
		totalpnl.setBounds(40, 100, 1000, 560);
		
		
		downrightbtn = new JButton(">");
		downleftbtn = new JButton("<");
		pagebtn = new JButton("Current"+i);
		
		downpnl = new JPanel();
		downpnl.setBackground(new Color(98,166,98));
		downrightbtn.setBackground(new Color(141,186,127));
		downleftbtn.setBackground(new Color(141,186,127));
		pagebtn.setBackground(new Color(141,186,127));
		
		downpnl.add(downleftbtn);
		downpnl.add(pagebtn);
		downpnl.add(downrightbtn);
		
		downrightbtn.addActionListener(this);
		downleftbtn.addActionListener(this);
		
		downpnl.setBounds(40, 700, 1000, 50);
		add(downpnl);
		//System.out.println(1);
		
			add(totalpnl);
			setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(leftbtn == e.getSource()){
			dayClicked--;
			String past = getSpecificDateFromToday(dayClicked);
			datetx.setText(past);	
		}

		else if(rightbtn == e.getSource()){
			dayClicked++;
			String past = getSpecificDateFromToday(dayClicked);
			datetx.setText(past);
		}
			else if(downleftbtn == e.getSource()){
				if (i>=2){
				i--;
				pagebtn.setText("current"+i);
			}
			}
			else if(downrightbtn == e.getSource()){
				i++;
				pagebtn.setText("current"+i);
			}
			
		}
		public static String getSpecificDateFromToday(int day){
		
		Date today = new Date();
		Date past = new Date(today.getTime() -
				-(day * 86400000));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(past.getTime());

	}
}


