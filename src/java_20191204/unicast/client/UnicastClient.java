package java_20191204.unicast.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UnicastClient implements ActionListener {
	private JFrame jframe;
	private JTextArea jta;
	private JButton jbtn;
	private JTextField jtf;
	private String id;
	private String ip;
	private int port;
	public UnicastClient(String id,String ip,int port){
		this.id = id;
		this.ip = ip;
		this.port=port;
		jframe = new JFrame("Unicast Chatting");
		/*******************상단시작********************/
		JPanel j1 = new JPanel();
		JLabel j2 = new JLabel("User ID : ["+id+"]");
		JLabel j3 = new JLabel("Server IP : "+ip);
		j1.setLayout(new BorderLayout());
		j1.add(j2,BorderLayout.CENTER);
		j1.add(j3,BorderLayout.EAST);
		/*******************상단끝**********************/
		
		
		/*******************중앙시작********************/
		jta = new JTextArea("",20,50);
		JScrollPane jsp = new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jta.setBackground(new Color(255,255,255));
		jta.setEditable(false);
		/*******************중앙끝*********************/
		
		
		/*******************하단시작********************/
		JPanel j4 = new JPanel();
		jtf = new JTextField(30);
		jbtn = new JButton("SEND");
		j4.setLayout(new BorderLayout());
		j4.add(jtf,BorderLayout.CENTER);
		j4.add(jbtn,BorderLayout.EAST);
		/*******************하단끝*********************/
		
		jframe.add(j1,BorderLayout.NORTH);
		jframe.add(jsp,BorderLayout.CENTER);
		jframe.add(j4,BorderLayout.SOUTH);
		
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
	
	
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new UnicastClient("Gil","192.168.0.205",3000);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String message = jtf.getText();
		if(obj == jbtn){
			jta.append(id +":"+message+"\n");
			jtf.setText("");
		}else if(obj == jtf){
			jta.append(id +":"+message+"\n");
			jtf.setText("");
		}
		
	}
}
