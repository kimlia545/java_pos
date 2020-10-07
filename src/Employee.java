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
		
		String info [] = {"직원이름","연락처","근무요일","근무시간","근무형태"};
		String emp[][] = {};
		
		model = new DefaultTableModel(emp,info);
		table = new JTable(model);
		JScrollPane scoll = new JScrollPane(table);
		
		//table.setBounds(150,90,750,600);
		scoll.setBounds(150,90,750,600);
		
		empbtn1 = new JButton("저장");
		empbtn1.setBackground(new Color(80,165,64));
		empbtn1.setBounds(115,15,100,50);
		emp_del_btn = new JButton("삭제");
		emp_del_btn.setBackground(new Color(80,165,64));
		emp_del_btn.setBounds(215,15,100,50);
		
		d = new Dialog2();
		btn1 = new JButton("직원추가");
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
	/*Object[] obj = new Object[5]; //object 생성 방법 
	
	Object[] obj2={"1",2,3,4,5,};
	
	new Obejct[]{3,4,5,6,7};*/
	
	private void writeOrder() { 
		String str = "info/.txt"; //  파일저장 위치
		BufferedWriter bw= null;
		
		try {			// 예외처리 필수 
			bw = new BufferedWriter(new FileWriter(str, true)); //Bufferdwriter는 Filewriter가 필요 
			for(int i=0; i<model.getRowCount();i++){  // 테이블 갯수만큼
				for(int j=0;j<5;j++){ // 테이블이 5칸 직원이름,연락처,요일,시간,형태
					bw.write(model.getValueAt(i, j)+ " "); //(i,j)를 인트값으로 받아서 string타입으로 되기위해서 +"" 사용
				}
			
			bw.newLine(); // 엔터
			}
			
			bw.flush(); // 파일 쓰기 끝내기 버퍼에 남아있는 데이터를 출력시킴 버퍼를 비우는 동작
			
			
			
		} catch (IOException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		} finally{
			
			try {
				if(bw !=null){ //만약 bw에 내용이 있으면 끄기
					bw.close();
				}
			} catch (IOException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			d.setVisible(true); //다이알로그 화면에 보임
		}
		else if(e.getSource()==d.btn1) {
		model.addRow(new Object[]{d.tf1.getText(), d.tf2.getText(), //object 배열 생성 후 테이블에 넣음
					d.tf3.getText(), d.tf4.getText(), d.tf5.getText()});
			d.tf1.setText("");
			d.tf2.setText("");
			d.tf3.setText("");
			d.tf4.setText("");
			d.tf5.setText("");
		}else if(e.getSource()==emp_del_btn) { 
			int i = table.getSelectedRow(); // 선택된 줄이 있다면 i에 들어간다
			if (i<0) { //만약 i가 선택되지않으면 -1 i가 0보다 작으면 리턴
				return;	
			}
			model.removeRow(i); // 줄 i를 삭제한다
			this.revalidate();
			this.repaint();	
		}else if(e.getSource()==empbtn1){
			writeOrder();
		}
	}
	
	private void readOrder() { 
		String str = "info/.txt"; //  파일저장 위치
		
		File file = new File(str); 
		FileReader fr = null;
		if(file.exists()){ // 만약 파일이 있다면
			
			try {
				fr = new FileReader(file); 
			} catch (FileNotFoundException e) {
				e.printStackTrace(); //만약 파일이 없으면 자동 오류 메시지 출력
			}
			BufferedReader br = new BufferedReader(fr);
			Scanner scanner = new Scanner(br); //버퍼를 이용한 입력 스캐너 
			
			while(scanner.hasNext()){ //while는 정해진 반복이 없을때 
				
				String [] strB = new String [5]; 
				
				strB[0] = scanner.next();
				strB[1] = scanner.next();
				strB[2] = scanner.next();
				strB[3] = scanner.next();
				strB[4] = scanner.next(); //스캐너를 기본적으로 공백으로 나누기
				
				model.addRow((Object[])strB);
			}
		}		
	}
}	


