package app;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WApp {

	private JFrame frame;

	private List<JPanel> telas;
	
	private int first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WApp window = new WApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 621, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		frame.setLocationRelativeTo(null);
		WTela06 tela06 = new WTela06(frame);
		addWindow(tela06);
		
		WTela01 tela01 = new WTela01(frame);
		addWindow(tela01);
		
		WTela02 tela02 = new WTela02(frame);
		addWindow(tela02);
		
		WTela03 tela03 = new WTela03(frame);
		addWindow(tela03);
		
		WTela04 tela04 = new WTela04(frame);
		addWindow(tela04);
		
		tela06.putPanel("tela01", tela01);
		
		tela01.putPanel("tela02", tela02);
		tela01.putPanel("tela03", tela03);
		tela01.putPanel("tela04", tela04);
		
		tela02.putPanel("tela01", tela01);
		tela02.putPanel("tela03", tela03);
		tela02.putPanel("tela04", tela04);
		
		tela03.putPanel("tela01", tela01);
		tela03.putPanel("tela02", tela02);
		tela03.putPanel("tela04", tela04);
		
		tela04.putPanel("tela01", tela01);
		tela04.putPanel("tela02", tela02);
		tela04.putPanel("tela03", tela03);
		
		build();
	}
	
	private void addWindow(JPanel p) {
		if (null == telas)
			telas = new ArrayList<>();
		telas.add(p);
		frame.getContentPane().add(p);
	}
	
	private void build() {
		first = 0;
		telas.forEach(p -> {
			if(first == 0) 
				first++;
			else 
				p.setVisible(false);
		});
	}

}
