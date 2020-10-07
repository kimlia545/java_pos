import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;

class Background extends JPanel implements ActionListener  {
	JButton downrightbtn, downleftbtn, pagebtn; 
	JPanel downpnl;
	
	 
	public Background () {
		this.setLayout(null);
		
		downrightbtn = new JButton(">");
		downleftbtn = new JButton("<");
		pagebtn = new JButton("Current 1"); 
		downpnl = new JPanel();
		downpnl.setBackground(new Color(98,166,98)); 
		downrightbtn.setBackground(new Color(141,186,127));
		downleftbtn.setBackground(new Color(141,186,127));
		pagebtn.setBackground(new Color(141,186,127));
		
		downpnl.add(downleftbtn);
		downpnl.add(pagebtn);
		downpnl.add(downrightbtn);
		
		downpnl.setBounds(40, 700, 1000, 50);
		add(downpnl);
		
		this.setBackground(new Color(98,166,98));
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		}
		
	}
