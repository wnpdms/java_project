package co.yedam.files;

import java.io.File;

public class FileExe {
	public static void main(String[] args) {
		String msg = "파일에 관한 정보를 보여주는 클래스 File";
		timeMsg(msg);

		String[] names = { "홍길동", "최길동", "박길동", "김길동" };
		File path = new File("d:학생공유/temp");
		if(!path .exists()) {
			path.mkdir();	
		}		
		for (int i = 0; i < names.length; i++) {
			if (path.exists()) {
				File folder = new File("d:/학생공유/temp" + names[i] + ".txt");
				folder.delete();
			}
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void timeMsg(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			System.out.print(msg.charAt(i));
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	static void deleteFile() {
		File file = new File("c:/temp/");
		if (!file.exists()) {
			String[] files = file.list();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i]);
				File listFile = new File("c:/temp/" + files[i]);
				if (listFile.length() == 0)
					listFile.delete();
			}

		}
	}
}
