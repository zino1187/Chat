package client;

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

public class ClientMain extends JFrame{
	JPanel p_north;
	JPanel p_south;
	JTextField t_ip;
	JTextField t_port;
	JTextField t_input;
	JButton bt;
	JTextArea area;
	JScrollPane scroll;
	JScrollBar bar;
	
	public ClientMain() {
		p_north = new JPanel();
		p_south = new JPanel();
		t_ip = new JTextField();
		t_port = new JTextField();
		t_input = new JTextField();
		bt = new JButton("Á¢¼Ó");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		bar=scroll.getVerticalScrollBar();
		bar.setValue(bar.getMaximum());
		
		area.setFont(new Font("±¼¸²", Font.BOLD, 25));
		t_ip.setPreferredSize(new Dimension(200, 25));
		t_port.setPreferredSize(new Dimension(80, 25));
		t_input.setPreferredSize(new Dimension(380, 25));
		
		p_north.add(t_ip);
		p_north.add(t_port);
		p_north.add(bt);
		p_south.add(t_input);
		
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		add(p_south, BorderLayout.SOUTH);
		
		setVisible(true);
		setSize(400,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ClientMain();
	}
}











