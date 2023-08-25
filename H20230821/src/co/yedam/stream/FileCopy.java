package co.yedam.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		long start = System.currentTimeMills();
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/IMG_0907.jpg");
			FileOutputStream fos = new FileOutputStream("C:/Temp/copy.jpg");
			byte[] but = new byte[100];
			while(true) {
			int val = fis.read(buf);
			if(val == -1) {
				break;
			}
			fos.write(val);
			}
			fos.close();
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("end - "+(end-start)+" ms");
		
	}
}
