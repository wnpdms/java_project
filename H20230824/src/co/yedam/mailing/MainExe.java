package co.yedam.mailing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MainExe {
	static Scanner scn = new Scanner(System.in);
	String logId;

	public static void main(String[] args) {
		// 음원실행 쓰레드 생성.
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
//				wavplayer();
			}

		});
		thread.start();

		boolean run = true;
		while (run) {
			System.out.println("1.추가 2.목록 3.메일 4.종료");
			System.out.print("선택>> ");
			switch (scn.nextInt()) {
			case 1:
				System.out.println("추가합니다...");
				break;
			case 2:
				System.out.println("목록을 봅니다...");
				break;
			case 3:
				scn.nextLine();
				mailsend();
				break;
			case 4:
				System.out.println("프로세스를 종료합니다.");
				run = false;
				break;

			}
		}
		System.out.println("end of prog.");
		scn.close();
	}

	static void wavplayer() {
		while (true) {
			try {
				File file = new File("c:/temp/sample.wav");
				AudioInputStream ais = AudioSystem.getAudioInputStream(file);
				Clip clip = AudioSystem.getClip();
				clip.open(ais);
				clip.start();

				Thread.sleep(clip.getMicrosecondLength() / 1000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	static void mailsend() {
		System.out.print("수신자 이메일: ");
		String to = scn.nextLine();

		System.out.print("제목: ");
		String title = scn.nextLine();

		System.out.print("내용: ");
		StringBuilder sb = new StringBuilder();
		sb.append("<p>비밀번호 초기화 메일입니다.</p>");
		sb.append("<p>12345</P>");
		String content = scn.nextLine();
		sb.append("<p>" + content + "</p>");
		sb.append("<b>Bye ~~</B>");

		content = sb.toString();

		SendMail sendMail = new SendMail();
		sendMail.sendMail(to, title, content);

		scn.close();
	}
}
