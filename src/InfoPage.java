import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Calendar;

public class InfoPage extends JPanel implements ActionListener {
	JButton infobtn;
	JLabel ifowner, ifname, iftime, iflocation, imglbl;
	JTextField txowner, txname, txtime, txlocation;
	
	
	public InfoPage() {
		this.setLayout(null);
		this.setBackground(new Color(51,153,102));
		Font font = new Font("맑은 고딕", Font.BOLD, 18);	
		
		
		imglbl = new JLabel();
		imglbl.setIcon(new ImageIcon("C:/Users/user/Desktop/Java/Test/src/image/store.jpg"));
		imglbl.setBounds(400, 600, 250, 150);
		
		ifowner = new JLabel("가맹점주");
		ifowner.setBounds(350, 150, 150, 30);
		ifowner.setFont(font);
		
		txowner = new JTextField("김순학");
		txowner.setBounds(450, 150, 150, 30);
		txowner.setFont(font);
		
		ifname = new JLabel("가맹점명");
		ifname.setBounds(350, 200, 150, 30);
		ifname.setFont(font);
		
		txname = new JTextField("서면중앙로 스타벅스");
		txname.setBounds(450, 200, 200, 30);
		txname.setFont(font);
		
		iftime = new JLabel("계약기간");
		iftime.setBounds(350, 250, 150, 30);
		iftime.setFont(font);
		
		txtime = new JTextField("2019.11.22-2020.04.23");
		txtime.setBounds(450, 250, 200, 30);
		txtime.setFont(font);
		
		infobtn = new JButton("계약기간 연장요청");
		infobtn.setBounds(650, 250, 200, 30);
		infobtn.setFont(font);
		
		infobtn.addActionListener(this);
		infobtn.setBackground(new Color(0,165,114));
		
		
		iflocation = new JLabel("가맹점 위치");
		iflocation.setBounds(350, 300, 150, 30);
		iflocation.setFont(font);
		
		txlocation = new JTextField("부산광역시 부산진구 부전2동 중앙대로 701");
		txlocation.setBounds(450, 300, 400, 30);
		txlocation.setFont(font);
		
		this.add(imglbl);
		this.add(ifowner);
		this.add(txowner);
		this.add(ifname);
		this.add(txname);
		this.add(iftime);
		this.add(txtime);
		this.add(iflocation);
		this.add(txlocation);
		this.add(infobtn);
	
		
	}

	private LayoutManager GridLayout(int i, int j) {
		// TODO 자동 생성된 메소드 스텁
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 자동 생성된 메소드 스텁
		
	}
}
		