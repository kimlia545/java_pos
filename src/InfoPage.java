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
		Font font = new Font("���� ���", Font.BOLD, 18);	
		
		
		imglbl = new JLabel();
		imglbl.setIcon(new ImageIcon("C:/Users/user/Desktop/Java/Test/src/image/store.jpg"));
		imglbl.setBounds(400, 600, 250, 150);
		
		ifowner = new JLabel("��������");
		ifowner.setBounds(350, 150, 150, 30);
		ifowner.setFont(font);
		
		txowner = new JTextField("�����");
		txowner.setBounds(450, 150, 150, 30);
		txowner.setFont(font);
		
		ifname = new JLabel("��������");
		ifname.setBounds(350, 200, 150, 30);
		ifname.setFont(font);
		
		txname = new JTextField("�����߾ӷ� ��Ÿ����");
		txname.setBounds(450, 200, 200, 30);
		txname.setFont(font);
		
		iftime = new JLabel("���Ⱓ");
		iftime.setBounds(350, 250, 150, 30);
		iftime.setFont(font);
		
		txtime = new JTextField("2019.11.22-2020.04.23");
		txtime.setBounds(450, 250, 200, 30);
		txtime.setFont(font);
		
		infobtn = new JButton("���Ⱓ �����û");
		infobtn.setBounds(650, 250, 200, 30);
		infobtn.setFont(font);
		
		infobtn.addActionListener(this);
		infobtn.setBackground(new Color(0,165,114));
		
		
		iflocation = new JLabel("������ ��ġ");
		iflocation.setBounds(350, 300, 150, 30);
		iflocation.setFont(font);
		
		txlocation = new JTextField("�λ걤���� �λ����� ����2�� �߾Ӵ�� 701");
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
		// TODO �ڵ� ������ �޼ҵ� ����
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
	}
}
		