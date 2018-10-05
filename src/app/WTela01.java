package app;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WTela01 extends WPanel {
	
	private JButton btnTela02;
	
	private JLabel lblEstouNaTela;
	private JButton btnTela03;
	private JButton btnTela04;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton button;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public WTela01(JFrame f) {
		super(f);
	}

	@Override
	public void panelHeader() {
	}

	@Override
	public void panelBody() {
		panelBody.setBackground(Color.BLUE);
		panelBody.setLayout(new GridLayout(4, 3, 0, 0));
		
		
	}

	@Override
	public void panelFooter() {
		panelFooter = new JPanel();
		add(panelFooter, BorderLayout.SOUTH);
		
		btnTela02 = new JButton("Tela 02");
		btnTela03 = new JButton("Tela 03");
		btnTela04 = new JButton("Tela 04");
		
		btnTela02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela02").setVisible(true);
			}
		});
		
		btnTela03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela03").setVisible(true);
			}
		});
		
		btnTela04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela04").setVisible(true);
			}
		});
		
		panelFooter.add(btnTela02);
		panelFooter.add(btnTela03);
		panelFooter.add(btnTela04);
	}

}
