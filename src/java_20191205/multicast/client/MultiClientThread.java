package java_20191205.multicast.client;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JTextArea;

public class MultiClientThread implements Runnable {
	private BufferedReader br;
	private JTextArea jta;
	public MultiClientThread(BufferedReader br, JTextArea jta) {
		// TODO Auto-generated constructor stub
		this.br = br;
		this.jta = jta;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				String readLine = br.readLine();
				
				if(readLine.equals("exit")){
					System.exit(0);
				}else{
					jta.append(readLine+"\n");
					jta.setCaretPosition(jta.getDocument().getLength());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}