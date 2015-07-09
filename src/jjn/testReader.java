package jjn;

import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     FileReader re = null;
	     FileWriter fw = null;
	     int b= 0;
	 //    int num=0;
	     char [] c = new char [11];
	     try {
			re = new FileReader("C:\\Users\\Administrator\\Desktop\\test\\javafile1.txt");
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\test\\javafile2.txt");	
		/*	while((b = re.read())!=-1){
				System.out.print((char)b);
				fw.write(b);
				num++;	
			}
			System.out.print(num);*/
			while((b = re.read(c))!=-1){
				/*for(int i=0;i<c.length;i++){
					System.out.print(c[i]);
				}*/
				System.out.println(c);
				fw.write(c);
			}
	     }  catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			re.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
	}

}
