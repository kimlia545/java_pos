import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LogPage extends JPanel implements ActionListener {
	JButton logbtn;
	JFrame log;
	JLabel idlbl, pslbl, imglbl;
	JTextField idtx, pstx;
	
	public LogPage(){
		
		
		this.setLayout(null);
		Font font = new Font("���� ���", Font.PLAIN, 18);	
		imglbl = new JLabel();
		imglbl.setIcon(new ImageIcon("img/2.png"));
		imglbl.setBounds(0, 0, 1280, 800);	
		logbtn = new JButton("log");
		logbtn.setBounds(1050, 200, 150, 30);
		logbtn.setBackground(new Color(128,128,128));
		logbtn.setFont(font);
		//logbtn.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128), 1));
		idlbl = new JLabel("id   ");
		idlbl.setFont(font);
		idlbl.setBounds(1000, 100, 150, 30);
		pslbl = new JLabel("pw");
		pslbl.setFont(font);
		pslbl.setBounds(1000, 150, 150, 30);
		idtx= new JTextField(10);
		idtx.setBounds(1080, 100, 150, 30);
		pstx= new JTextField(10);
		pstx.setBounds(1080, 150, 150, 30);
		logbtn.setBackground(new Color(0,74,0));
		this.add(idlbl);
		this.add(idtx);
		this.add(pslbl);
		this.add(pstx);
		this.add(logbtn);
		this.add(imglbl);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
