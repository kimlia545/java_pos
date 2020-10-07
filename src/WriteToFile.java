import java.io.*;

import javax.swing.JButton;

public class WriteToFile {
	final static String FILE_NAME = "Order.txt";
	public static void main(String[] args ) {
		FileWriter fw = null ;
		BufferedWriter bw = null;
		String order= null; 
		try{ 
			fw = new FileWriter( FILE_NAME ); 
			bw = new BufferedWriter( fw );
			bw.write("Hello World"); 
			bw.newLine(); 
			bw.write("Welcome to java");
			bw.newLine();
			bw.flush(); 
		}catch ( IOException e ) {
			System.out.println(e); 
		}finally{
			try { fw.close(); } catch ( IOException e ) {}
			try { bw.close(); } catch ( IOException e ) {}
		}
		FileReader rw = null ;
		BufferedReader br = null;
		try{
			rw = new FileReader( FILE_NAME );
			br = new BufferedReader( rw );
			String readLine = null ;
			while( ( readLine =  br.readLine()) != null ){
			    System.out.println(readLine);
			}
		}catch ( IOException e ) {
			System.out.println(e);
		}finally{
			try { rw.close(); } catch ( IOException e ) {}
			try { br.close(); } catch ( IOException e ) {}
		} 
	}
}




