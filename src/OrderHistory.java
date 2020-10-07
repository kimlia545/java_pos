import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;

class OrderHistory extends JPanel implements ActionListener {
	//JPanel onepnl, twopnl, threepnl, fourpnl, totalpnl, timepnl;
	
	//JButton [] orderbtn,timebtn ,infobtn, paymentbtn, statusbtn;
	
	JPanel totalpnl;
	JButton [] orderbtn;
	String [][] str;
	SimpleDateFormat format1;	
	Date time;		
	String time1;
	OrderPage page;
	Calendar date; 
	JButton downrightbtn, downleftbtn, pagebtn; 
	JPanel downpnl;
	JButton rightbtn, leftbtn, paybtn, checkbtn;
	JTextField datetx;
	int nYear, nMonth, nDay; 
	JPanel uppnl;
	int dayClicked = 0;
	int i= 1;
	File[] files;
	
	public OrderHistory(){
		this.setBackground(new Color(51,153,102));
		this.setLayout(null);
		
		
		leftbtn = new JButton("<");
		rightbtn = new JButton(">");
		paybtn = new JButton("주문상태");
		checkbtn = new JButton("결제수단");
		
		leftbtn.addActionListener(this);
		rightbtn.addActionListener(this);
		
		Calendar calendar = new GregorianCalendar(Locale.KOREA);
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
		checkbtn.setBackground(new Color(141,186,127));
		paybtn.setBackground(new Color(141,186,127));
		
		this.setBackground(new Color(98,166,98));
		
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
		
		page = new OrderPage();
		
//		onepnl = new JPanel();
//		twopnl = new JPanel();
//		threepnl = new JPanel();
//		fourpnl = new JPanel();
		totalpnl = new JPanel();
		totalpnl.setBounds(40, 100, 1000, 560);
		
//		onepnl.setBackground(new Color(98,166,98));
//		twopnl.setBackground(new Color(98,166,98));
//		threepnl.setBackground(new Color(98,166,98));
//		fourpnl.setBackground(new Color(98,166,98));
		totalpnl.setBackground(new Color(98,166,98));
		
//		timepnl = new JPanel();
//		timepnl.setBackground(new Color(98,166,98));
		
		//orderbtn[10].setBackground(new Color(141,186,127));
		//infobtn[9].setBackground(new Color(141,186,127));
		//paymentbtn[9].setBackground(new Color(141,186,127));
		//statusbtn[9].setBackground(new Color(141,186,127));
		
		format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");	
		time = new Date();		
		time1 = format1.format(time);		
		
		/*String order = "주문번호";
		orderbtn = new JButton[10];
		for(int num=0; num<=9; num++) {
			orderbtn[num] = new JButton(order);
			onepnl.add(orderbtn[num]);
			orderbtn[num].setBackground(new Color(141,186,127));
		}
		
		totalpnl.add(onepnl);
		onepnl.setLayout(new GridLayout(0,1,10,10));
		
		String time = time1;
		timebtn = new JButton [10];
		for(int num =0; num<=9; num++) {
			timebtn[num] = new JButton(time);
			timepnl.add(timebtn[num]);
			timebtn[num].setBackground(new Color(141,186,127));
		}
		
		totalpnl.add(timepnl);
		timepnl.setLayout(new GridLayout(0,1,10,10));
		
		String info = "";
		infobtn = new JButton [10];
		for(int num =0; num<=9; num++) {
			infobtn[num] = new JButton(info);
			twopnl.add(infobtn[num]);
			infobtn[num].setBackground(new Color(141,186,127));
		}
		
		totalpnl.add(twopnl);
		twopnl.setLayout(new GridLayout(0,1,10,10));
		
		
		String pay = "카드";
		paymentbtn = new JButton [10];
		for(int num=0; num<=9; num++) {
			paymentbtn[num] =new JButton(pay);
			threepnl.add(paymentbtn[num]);
			paymentbtn[num].setBackground(new Color(141,186,127));
		}
		threepnl.setLayout(new GridLayout(0,1,10,10));
		totalpnl.add(threepnl);
		
		String status = "결재완료";
		statusbtn = new JButton [10];
		for(int num=0; num<=9; num++) {
			statusbtn[num] =new JButton(status);
			fourpnl.add(statusbtn[num]);
			statusbtn[num].setBackground(new Color(141,186,127));
		}
		
		fourpnl.setLayout(new GridLayout(0,1,10,10));
		totalpnl.add(fourpnl);*/
		
		
		totalpnl.setLayout(new GridLayout(0,7,10,10));
	
		//btnDate = new JButton(HelpFunc.getTodayYYYYMMDD());
		
		add(totalpnl);		
		
		Vector v = new Vector();
		
		File[] f = getFileList();			
		for(int i=0;i<f.length;i++){
			StringTokenizer st = new StringTokenizer(readFile(f[i].getName()),"\r\n");
			str = new String[st.countTokens()][7];
			int ii=0;
			while(st.hasMoreTokens()){				
				StringTokenizer st2 = new StringTokenizer(st.nextToken());
				for(int k=0;k<7;k++){
					str[ii][k]=st2.nextToken();
				}
					ii++;
			}
			v.add(str);
		}
		
		for(int i = 0; i < v.size(); i++){
			addBtn((String[][])v.get(i));
		}
		
//		String[][] n = (String[][])v.get(3);
//		System.out.println(n[0][0]);	
//			for(int i=0;i<v.size();i++){
//				for(int j=0;j<((String[][]) v.get(i)).length;j++){
//					for(int k=0;k<7;k++){
//						System.out.print(((String[][]) v.get(i))[j][k] + '\n');
//						Object tmp = ((String[][]) v.get(0))[j][k];
//						test[k] = new JButton("" + ((String[][]) v.get(i))[j][k]);
//						//test[k].setBounds(50 * k + 50, 100, 50, 50);
//						totalpnl.add(test[k]);
//						if(k == 6)
//							return;
////						int tmp = v.size();
////						String[][] tmp2 = (String[][])v.get(0);
////						System.out.println(tmp2[0][0]);
////						System.out.println(tmp2[0][1]);
////						System.out.println(tmp2[0][2]);
////						System.out.println(tmp2[0][3]);
////						//Object tmp6 = tmp2;
////						int a = 10;
//						
////						test = new JButton("" + ((String[][]) v.get(i))[j][k]);
////						test.setBounds(100, 100, 100, 100);
////						totalpnl.add(test);
////						break;
//					}					
//				}
//				System.out.println();
//			}
		
			
				
			setVisible(true);
	}
	
	private void addBtn(String[][] str){
		
		for(int i = 0; i < str.length; i++){
			JButton[] btn = new JButton[7];
			for(int j = 0; j < 7; j++){
				btn[j] = new JButton(str[i][j]);
				totalpnl.add(btn[j]);
				btn[j].setBackground(new Color(141,186,127));
			}
		}
	}
	
	
	String readFile(String input){
		String result="";
		try {
			BufferedReader reader = new BufferedReader(new FileReader("files/"+input));
			String str="";			
			while ((str = reader.readLine()) != null) {
					result = result+str+"\r\n";
				}
		} catch (FileNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return result;
		
	}
	
	File[] getFileList(){
		String path="files/";
		File dir = new File(path);
		File[] files = dir.listFiles();
		return files;
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

