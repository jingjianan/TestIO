package jjn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class testOutStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fio = null;
		FileOutputStream foo = null;
		int c = 0;
		byte [] size = new byte[100];
		try {
			fio = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test\\javafile.txt");
			foo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\test\\javafile1.txt");
			 try {
				/*while((c = fio.read())!=-1){
					foo.write(c) ;
				 }*/
				 while((c=fio.read(size))!=-1){
					 System.out.println(c);
					 foo.write(size);
				 }
				fio.close();
				foo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
