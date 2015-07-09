package jjn;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {

	
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:/test.txt");
			BufferedOutputStream bo = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bo);
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/data/data.txt");
			BufferedInputStream br = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(br);
			dos.write(1);
			dos.writeBoolean(true);
			/*dos.writeBytes("好好");
			dos.writeDouble(0.32313213);
			dos.writeFloat((float) 1.3333);
			dos.writeLong(12345);*/
			
			/*System.out.println(1);
			System.out.println(true);
			System.out.println("好好");
			System.out.println(0.32313213);
			System.out.println(1.3333);
			System.out.println(12345);*/
			dis.read();
			dis.readBoolean();
			dis.close();
			br.close();
			fis.close();
		     }catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				//搞不懂


	}

	}
	}
