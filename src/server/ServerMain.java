package server;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerMain extends JFrame{
	JPanel p_north;
	JTextField t_ip;
	JTextField t_port;
	JButton bt;
	JTextArea area;
	JScrollPane scroll;
	JScrollBar bar;
	
	public ServerMain() {
		p_north = new JPanel();
		t_ip = new JTextField();
		t_port = new JTextField();
		bt = new JButton("서버 가동");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		bar=scroll.getVerticalScrollBar();
		bar.setValue(bar.getMaximum());
		
		area.setFont(new Font("굴림", Font.BOLD, 25));
		t_ip.setPreferredSize(new Dimension(200, 25));
		t_port.setPreferredSize(new Dimension(80, 25));
		
		p_north.add(t_ip);
		p_north.add(t_port);
		p_north.add(bt);
		
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		setVisible(true);
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ServerMain();
	}
}











