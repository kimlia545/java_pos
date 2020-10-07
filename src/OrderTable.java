

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

	class OrderTable extends JPanel{
	DefaultTableModel model;
	
	public OrderTable() {
		this.setBackground(new Color(51,153,102));
		this.setLayout(null);

		Font font = new Font("맑은 고딕", Font.BOLD, 18);	
		String ColumnNames[] = {"상품명","수량","정가","할인","금액"};
		Object rowData[][] = {
							
				};
		
		model = new DefaultTableModel(rowData,ColumnNames);
		JTable table = new JTable(model);
		JScrollPane scoll = new JScrollPane(table);
		add(scoll);
		scoll.setBounds(0,20, 700, 350);
		
		setVisible(true);
		
	}		
		}
