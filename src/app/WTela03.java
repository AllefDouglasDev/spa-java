package app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WTela03 extends WPanel {
	
	private JLabel lblEstouNaTela;

	private JButton btnTela01;
	
	private JButton btnTela02;
	
	private JButton btnTela04;
	
	/**
	 * Create the panel.
	 */
	public WTela03(JFrame f) {
		super(f);
	}

	@Override
	public void panelHeader() { }

	@Override
	public void panelBody() {
		panelBody.setBackground(Color.MAGENTA);
		
		lblEstouNaTela = new JLabel("Estou na tela 03");
		lblEstouNaTela.setForeground(Color.WHITE);
		lblEstouNaTela.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEstouNaTela.setBackground(Color.WHITE);
		panelBody.add(lblEstouNaTela);
	}

	@Override
	public void panelFooter() {
		btnTela01 = new JButton("Tela 01");
		btnTela02 = new JButton("Tela 02");
		btnTela04 = new JButton("Tela 04");
		
		btnTela01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela01").setVisible(true);
			}
		});
		
		btnTela02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela02").setVisible(true);
			}
		});
		
		btnTela04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela04").setVisible(true);
			}
		});
		
		panelFooter.add(btnTela01);
		panelFooter.add(btnTela02);
		panelFooter.add(btnTela04);
	}
}
