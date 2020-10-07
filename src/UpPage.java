import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;

class UpPage extends JPanel implements ActionListener  {
	JButton rightbtn, leftbtn, paybtn, checkbtn;
	JTextField datetx;
	int nYear, nMonth, nDay; 
	JPanel uppnl;
	
	 
	public UpPage () {
		this.setLayout(null);

		rightbtn = new JButton(">");
		leftbtn = new JButton("<");
		paybtn = new JButton("결재");
		checkbtn = new JButton("확인");
		uppnl.add(rightbtn);
		uppnl.add(leftbtn);
		uppnl.add(paybtn);
		uppnl.add(checkbtn);
		uppnl.add(datetx);
		
		add(uppnl);
		uppnl.setBounds(10,100,1000,50);
		
		Calendar calendar = new GregorianCalendar(Locale.KOREA);
		nYear = calendar.get(Calendar.YEAR);
		nMonth = calendar.get(Calendar.MONTH) + 1;
		nDay = calendar.get(Calendar.DAY_OF_MONTH);
		datetx = new JTextField( nYear + "-"+ nMonth + "-" + nDay);
	
		
		leftbtn.setBackground(new Color(141,186,127));
		rightbtn.setBackground(new Color(141,186,127));
		checkbtn.setBackground(new Color(141,186,127));
		paybtn.setBackground(new Color(141,186,127));
		
		this.setBackground(new Color(98,166,98));
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}