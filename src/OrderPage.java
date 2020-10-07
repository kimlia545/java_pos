import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class OrderPage extends JPanel implements ActionListener {

	OrderTable table;
	OrderCalc calc;
	OrderPos pos;
	OrderMenu menu;
	BufferedReader br;
	
	public OrderPage() {
		this.setBackground(new Color(51,153,102));
		this.setLayout(null);
		
		calc = new OrderCalc();
		table = new OrderTable();
		pos = new OrderPos();
		menu = new OrderMenu();
		
		for(int i=0;i<menu.drinkbtn.length;i++){
			menu.drinkbtn[i].addActionListener(this);
		}
		 
		menu.setBounds(25,370, 700, 350);
		table.setBounds(25,0, 700, 350);
		calc.setBounds(750,250,300,500);
		pos.setBounds(750, 25,300, 210);

		Font font = new Font("���� ���", Font.BOLD, 18);	
		
		pos.yesbtn.addActionListener(this);
		pos.nobtn.addActionListener(this);
		pos.cardbtn.addActionListener(this);
		pos.cashbtn.addActionListener(this);
		
		this.add(table);
		this.add(calc);
		this.add(menu);
		this.add(pos);
	
	
		this.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menu.drinkbtn[0]) {			
			addRow(menu.drinkbtn[0].getText(),0);
			//table.model.addRow(new Object[]{"����������","1","3000","300","2700"});			
		}
		else if(e.getSource()==menu.drinkbtn[1]) {
			addRow(menu.drinkbtn[1].getText(),1);
			//table.model.addRow(new Object[]{"ī��Ḷ���ƶ�","1","3500","500","3000"});
		}
		else if(e.getSource()==menu.drinkbtn[2]) {
			addRow(menu.drinkbtn[2].getText(),2);
			//table.model.addRow(new Object[]{"�������������ĳ�","1","3500","500","3000"});
		}
		else if(e.getSource()==menu.drinkbtn[3]) {
			addRow(menu.drinkbtn[3].getText(),3);
			//table.model.addRow(new Object[]{"��ü��","1","4000","500","3500"});
		}
		else if(e.getSource()==menu.drinkbtn[4]) {
			addRow(menu.drinkbtn[4].getText(),4);
			//table.model.addRow(new Object[]{"ī���","1","3000","300","2700"});
		}
		else if(e.getSource()==menu.drinkbtn[5]) {
			addRow(menu.drinkbtn[5].getText(),5);
			//table.model.addRow(new Object[]{"īǪġ��","1","3000","300","2700"});
		}
		else if(e.getSource()==menu.drinkbtn[6]) {
			addRow(menu.drinkbtn[6].getText(),6);
			//table.model.addRow(new Object[]{"ī���ī","1","3300","300","3000"});
		}
		if(e.getSource()==menu.drinkbtn[7]) {
			addRow(menu.drinkbtn[7].getText(),7);
			//table.model.addRow(new Object[]{"�Ƹ޸�ī��","1","2000","200","1800"});
		}
		else if(e.getSource()==menu.drinkbtn[8]) {
			addRow(menu.drinkbtn[8].getText(),8);
			//table.model.addRow(new Object[]{"ȭ��Ʈ��ī","1","3000","300","2700"});
		}
		else if(e.getSource()==menu.drinkbtn[9]) {
			addRow(menu.drinkbtn[9].getText(),9);
			//table.model.addRow(new Object[]{"����������Ǫġ��","1","4000","500","3500"});
		}
		else if(e.getSource()==menu.drinkbtn[10]) {
			addRow(menu.drinkbtn[10].getText(),10);
			//table.model.addRow(new Object[]{"��Ż���ȼҴ�","1","2000","200","1800"});
		}
		else if(e.getSource()==menu.drinkbtn[11]) {
			addRow(menu.drinkbtn[11].getText(),11);
			//table.model.addRow(new Object[]{"�׸�Ƽ��","1","2500","500","2000"});
		}
		else if(e.getSource()==menu.drinkbtn[12]) {
			addRow(menu.drinkbtn[12].getText(),12);
			//table.model.addRow(new Object[]{"�ٴҶ��","1","3000","300","2700"});
		}
		else if(e.getSource()==menu.drinkbtn[13]) {
			addRow(menu.drinkbtn[13].getText(),13);
			//table.model.addRow(new Object[]{"���Ƽ","1","1500","500","1000"});
		}
		else if(e.getSource()==menu.drinkbtn[14]) {
			addRow(menu.drinkbtn[14].getText(),14);
			//table.model.addRow(new Object[]{"���","1","3000","300","2700"});
		}
		else if(e.getSource()==menu.drinkbtn[15]) {
			addRow(menu.drinkbtn[15].getText(),15);
			//table.model.addRow(new Object[]{"������","1","2000","200","1800"});
		}
		else if(e.getSource()==pos.yesbtn) {
			colorDefautl(pos.yesbtn);			
			writeOrder();			
			pos.yesbtn.setBackground(new Color(57,131,66));
			removetable();
		}
		else if(e.getSource()==pos.nobtn) {
			colorDefautl(pos.nobtn);
			JOptionPane.showMessageDialog(null, "�ֹ��� ��ҵǾ����ϴ�.");
			removetable();
			pos.nobtn.setBackground(new Color(57,131,66));
		}
	}
	private void addRow(String str, int index){	
		// �ֹ���� ���߹迭
		Object[][] coffee={
							{"����������",1,3000,300,2700},
							{"ī��Ḷ���ƶ�",1,3500,500,3000},
							{"�������������ĳ�",1,3500,500,3000},
							{"��ü��",1,4000,500,3500},
							{"ī���",1,3000,300,2700},
							{"īǪġ��",1,3000,300,2700},
							{"ī���ī",1,3300,300,3000},
							{"�Ƹ޸�ī��",1,2000,200,1800},
							{"ȭ��Ʈ��ī",1,3000,300,2700},
							{"����������Ǫġ��",1,4000,500,3500},
							{"��Ż���ȼҴ�",1,2000,200,1800},
							{"�׸�Ƽ��",1,2500,500,2000},
							{"�ٴҶ��",1,3000,300,2700},
							{"���Ƽ",1,1500,500,1000},
							{"���",1,3000,300,2700},
							{"������",1,2000,200,1800}
						  };
		
		Object currentDrink=null;
		int currentRow = -1; //0���ʹϱ� -1�� ����
		
		for(int i=0;i<table.model.getRowCount();i++){
			if(table.model.getValueAt(i, 0).equals(str)){
				currentRow=i;
			}
		}
		
		if(currentRow==-1){  //���� �޴��� ������ �޴��� �ֱ�
			table.model.addRow(new Object[]{str,coffee[index][1],coffee[index][2],coffee[index][3],coffee[index][4]});
		}else{ //���� �޴��� ������ ���� ���� ���ΰ��ݸ� �߰�
			int currentCnt = (int)table.model.getValueAt(currentRow, 1);
			table.model.setValueAt(++currentCnt, currentRow, 1);
			table.model.setValueAt(currentCnt*(int)coffee[index][2], currentRow, 2);
			table.model.setValueAt(currentCnt*(int)coffee[index][3], currentRow, 3);
			table.model.setValueAt(currentCnt*(int)coffee[index][4], currentRow, 4);
		}
		
	}
	private void writeOrder() { 
		
		FileWriter fw = null ;
		BufferedWriter bw = null;
		
		String str = "ī��"; 
		if(!pos.cardbtn.isSelected()){ //!�� �ݴ�
			str = "����";
		}
		try{	
			if(table.model.getRowCount()>0){
				fw = new FileWriter("files/Test"+System.currentTimeMillis()+".txt"); //�ؽ�Ʈ�� ����
				bw = new BufferedWriter(fw);
				
				for(int i=0;i<table.model.getRowCount();i++){
					for(int j=0;j<5;j++){
						bw.write(table.model.getValueAt(i, j)+" ");	//���ۿ� ������ �Է�
					}
					bw.write(str+"  ����Ϸ� ");
					bw.newLine(); //���ۿ� ���� ����
				}
				bw.flush(); //������ ������ ���Ͽ� ����
				
				JOptionPane.showMessageDialog(null, "�ֹ� ������ ����Ǿ����ϴ�.");
				
			}else{
				JOptionPane.showMessageDialog(this, "�ֹ� ������ �����ϴ�.");
			
			}
			
		}catch ( IOException e ) {
			System.out.println(e);
		}finally{
			try {
				if(fw != null){	fw.close();}
				if(bw != null){	bw.close();}				
				} catch ( IOException e ) {}
		}	
	} 
	void colorDefautl(JButton btn) {
		// TODO �ڵ� ������ �޼ҵ� ����
		pos.yesbtn.setBackground(new Color(57,131,66));
		pos.nobtn.setBackground(new Color(57,131,66));
		pos.cashbtn.setBackground(new Color(57,131,66));
		pos.cardbtn.setBackground(new Color(57,131,66));
		btn.setBackground(new Color(198,228,191));
	}	
	private void removetable(){
		int rowcount;
		rowcount = table.model.getRowCount();

		for (int i=0; i<rowcount; i++) {
			table.model.removeRow(0);
		}
		
	}
}
		