package app;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class WTela01 extends WPanel {
	
	private JLabel lblEstouNaTela;
	
	private JButton btnTela03;
	
	private JButton btnTela04;
	
	private JButton btnTela02;

	/**
	 * Create the panel.
	 */
	public WTela01(JFrame f) {
		super(f);
	}

	@Override
	public void panelHeader() { }

	@Override
	public void panelBody() {
		panelBody.setBackground(Color.DARK_GRAY);
		panelBody.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		

		lblEstouNaTela = new JLabel("Estou na tela 01");
		lblEstouNaTela.setForeground(Color.WHITE);
		lblEstouNaTela.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEstouNaTela.setBackground(Color.WHITE);
		panelBody.add(lblEstouNaTela);
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
