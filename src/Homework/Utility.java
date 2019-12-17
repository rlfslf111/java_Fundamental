package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class Utility {
	public static boolean isCopy(String FromFile, String toFile){
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		boolean isSuccess = false;
		
		
		try {
			fis = new FileInputStream("C:\\dev\\io\\2019\\12\\jdk.exe");
			fos = new FileOutputStream("C:\\dev\\io\\2019\\12\\jdk-2.exe");
			
			
			byte[] readBytes = new byte[1024*10];
			int readByteCount = 0;
			
			
			while((readByteCount = fis.read(readBytes)) != -1){
				fos.write(readBytes,0,readByteCount);
			}
			isSuccess =true;
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
					
				e.printStackTrace();
			}
		}
		return isSuccess;
	}


	
}