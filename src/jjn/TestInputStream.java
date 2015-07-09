package jjn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputStream {

	/**
	 * @param args
	 */
	 
	public static void main(String[] args) {
		FileInputStream fio = null;
		int c = 0;
		int num = 0;
	    int size = 5;
		byte [] d = new byte [size];
		try {
			 fio = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\javafile.txt");
			
			/* while((c = fio.read())!=-1){
				 System.out.println(c);
				 num++;
			 }*/
			 
			 while((c = fio.read(d,1,4))!=-1){
				 for(int i=0;i<d.length;i++ ){
					 System.out.print((char)d[i]);
				 }
			//	 System.out.println(c);
				 num++;
			 }
			 System.out.println();
			 System.out.println(num);	
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		 try {
			fio.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
