import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Employee extends JPanel implements ActionListener {
	JButton btn1, empbtn1, emp_del_btn;
	JPanel pnl;
	Dialog2 d;
	JPanel jp;
	DefaultTableModel model;
	JTable table;
	
	public Employee(){
		this.setLayout(null);
		this.setBackground(new Color(98,166,98));
		
		String info [] = {"�����̸�","����ó","�ٹ�����","�ٹ��ð�","�ٹ�����"};
		String emp[][] = {};
		
		model = new DefaultTableModel(emp,info);
		table = new JTable(model);
		JScrollPane scoll = new JScrollPane(table);
		
		//table.setBounds(150,90,750,600);
		scoll.setBounds(150,90,750,600);
		
		empbtn1 = new JButton("����");
		empbtn1.setBackground(new Color(80,165,64));
		empbtn1.setBounds(115,15,100,50);
		emp_del_btn = new JButton("����");
		emp_del_btn.setBackground(new Color(80,165,64));
		emp_del_btn.setBounds(215,15,100,50);
		
		d = new Dialog2();
		btn1 = new JButton("�����߰�");
		btn1.addActionListener(this);
		btn1.setBackground(new Color(80,165,64));
		btn1.setBounds(5,15,100,50);
		
		d.btn1.addActionListener(this);
		
		pnl = new JPanel(new GridLayout(0,2,10,10));
		pnl.setBackground(new Color(52,124,44));
		pnl.setBounds(30, 20, 1010, 720);
		pnl.setLayout(null);
		
		pnl.add(emp_del_btn);
		pnl.add(empbtn1);
		pnl.add(scoll);
		pnl.add(btn1);
		
		readOrder();
		emp_del_btn.addActionListener(this);
		empbtn1.addActionListener(this);
		
		add(pnl);
		
	}	
	/*Object[] obj = new Object[5]; //object ���� ��� 
	
	Object[] obj2={"1",2,3,4,5,};
	
	new Obejct[]{3,4,5,6,7};*/
	
	private void writeOrder() { 
		String str = "info/.txt"; //  �������� ��ġ
		BufferedWriter bw= null;
		
		try {			// ����ó�� �ʼ� 
			bw = new BufferedWriter(new FileWriter(str, true)); //Bufferdwriter�� Filewriter�� �ʿ� 
			for(int i=0; i<model.getRowCount();i++){  // ���̺� ������ŭ
				for(int j=0;j<5;j++){ // ���̺��� 5ĭ �����̸�,����ó,����,�ð�,����
					bw.write(model.getValueAt(i, j)+ " "); //(i,j)�� ��Ʈ������ �޾Ƽ� stringŸ������ �Ǳ����ؼ� +"" ���
				}
			
			bw.newLine(); // ����
			}
			
			bw.flush(); // ���� ���� ������ ���ۿ� �����ִ� �����͸� ��½�Ŵ ���۸� ���� ����
			
			
			
		} catch (IOException e) {
			// TODO �ڵ� ������ catch ���
			e.printStackTrace();
		} finally{
			
			try {
				if(bw !=null){ //���� bw�� ������ ������ ����
					bw.close();
				}
			} catch (IOException e) {
				// TODO �ڵ� ������ catch ���
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			d.setVisible(true); //���̾˷α� ȭ�鿡 ����
		}
		else if(e.getSource()==d.btn1) {
		model.addRow(new Object[]{d.tf1.getText(), d.tf2.getText(), //object �迭 ���� �� ���̺� ����
					d.tf3.getText(), d.tf4.getText(), d.tf5.getText()});
			d.tf1.setText("");
			d.tf2.setText("");
			d.tf3.setText("");
			d.tf4.setText("");
			d.tf5.setText("");
		}else if(e.getSource()==emp_del_btn) { 
			int i = table.getSelectedRow(); // ���õ� ���� �ִٸ� i�� ����
			if (i<0) { //���� i�� ���õ��������� -1 i�� 0���� ������ ����
				return;	
			}
			model.removeRow(i); // �� i�� �����Ѵ�
			this.revalidate();
			this.repaint();	
		}else if(e.getSource()==empbtn1){
			writeOrder();
		}
	}
	
	private void readOrder() { 
		String str = "info/.txt"; //  �������� ��ġ
		
		File file = new File(str); 
		FileReader fr = null;
		if(file.exists()){ // ���� ������ �ִٸ�
			
			try {
				fr = new FileReader(file); 
			} catch (FileNotFoundException e) {
				e.printStackTrace(); //���� ������ ������ �ڵ� ���� �޽��� ���
			}
			BufferedReader br = new BufferedReader(fr);
			Scanner scanner = new Scanner(br); //���۸� �̿��� �Է� ��ĳ�� 
			
			while(scanner.hasNext()){ //while�� ������ �ݺ��� ������ 
				
				String [] strB = new String [5]; 
				
				strB[0] = scanner.next();
				strB[1] = scanner.next();
				strB[2] = scanner.next();
				strB[3] = scanner.next();
				strB[4] = scanner.next(); //��ĳ�ʸ� �⺻������ �������� ������
				
				model.addRow((Object[])strB);
			}
		}		
	}
}	


