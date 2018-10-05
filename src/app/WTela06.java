package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WTela06 extends WPanel {

	/**
	 * Create the panel.
	 */
	public WTela06(JFrame f) {
		super(f);
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				getPanel("tela01").setVisible(true);;
			}
		});
		panelFooter.add(btnNewButton);

	}

	@Override
	public void panelHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void panelBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void panelFooter() {
		// TODO Auto-generated method stub
		
	}

}
