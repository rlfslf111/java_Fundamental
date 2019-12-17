package java_20191205.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener{
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	private BufferedReader br;
	private BufferedWriter bw;
	public UnicastClient(String id, String ip,int port){
		this.id = id;
		this.ip = ip;
		this.port = port;
		
		jframe = new JFrame("Unicast Chatting");
		/**************북쪽시작*********************/
		JPanel j1 = new JPanel();
		JLabel jl1 = new JLabel("User ID : ["+id+"]");
		JLabel jl2 = new JLabel("Server IP : "+ip);
		j1.setLayout(new BorderLayout());
		j1.add(jl1,BorderLayout.CENTER);
		j1.add(jl2,BorderLayout.EAST);
		/**************북쪽끝*********************/
		/**************중앙시작*********************/
		jta = new JTextArea("",20,50);
		JScrollPane jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jta.setBackground(new Color(255,255,200));
		jta.setEditable(false);
		/**************중앙끝*********************/
		
		/**************남쪽시작*********************/
		JPanel j2 = new JPanel();
		jtf = new JTextField(30);
		jbtn = new JButton("SEND");
		j2.setLayout(new BorderLayout());
		j2.add(jtf, BorderLayout.CENTER);
		j2.add(jbtn, BorderLayout.EAST);
		/**************남쪽끝*********************/
		
		jframe.add(j1,BorderLayout.NORTH);
		jframe.add(jsp,BorderLayout.CENTER);
		jframe.add(j2,BorderLayout.SOUTH);
		
		jframe.pack();
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		jbtn.addActionListener(this);
		jtf.addActionListener(this);
		
		jframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			public void windowOpened(WindowEvent e){
				jtf.requestFocus();
			}
		});
		
	}
	
	public void connect(){
		try {
			Socket socket = new Socket(ip,port);
			
			//OutputStream out = socket.getOutputStream();
			//OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
			bw = 
					new BufferedWriter(
							new OutputStreamWriter(
									socket.getOutputStream()));
			
			//InputStream in = socket.getInputStream();
			//InputStreamReader isr = new InputStreamReader(socket.getInputStream());
			br = 
					new BufferedReader(
							new InputStreamReader(
									socket.getInputStream()));
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new UnicastClient("syh1011","192.168.0.203",3000).connect();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String message = jtf.getText();
		if(obj == jbtn ){
			try {
				bw.write(id + ":"+message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				
				jta.append(readLine+"\n");
				jtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}else if(obj == jtf){
			try {
				bw.write(id + ":"+message);
				bw.newLine();
				bw.flush();
				
				String readLine = br.readLine();
				
				jta.append(readLine+"\n");
				jtf.setText("");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}