package app;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class WTela02 extends WPanel {
	
	private JButton btnTela01;
	private JButton btnTela03;
	private JButton btnTela04;
	
	private JLabel lblEstouNaTela;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public WTela02(JFrame f) {
		super(f);	
	}

	@Override
	public void panelHeader() {
	}

	@Override
	public void panelBody() {
		panelBody.setBackground(Color.RED);
		
		lblEstouNaTela = new JLabel("Estou na tela 02");
		lblEstouNaTela.setForeground(Color.WHITE);
		lblEstouNaTela.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEstouNaTela.setBackground(Color.WHITE);
		panelBody.add(lblEstouNaTela);
		
		textField = new JTextField();
		panelBody.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void panelFooter() {
		btnTela01 = new JButton("Tela 01");
		btnTela03 = new JButton("Tela 03");
		btnTela04 = new JButton("Tela 04");
		
		btnTela01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				getPanel("tela01").setVisible(true);
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
		
		panelFooter.add(btnTela01);
		panelFooter.add(btnTela03);
		panelFooter.add(btnTela04);
	}

}
