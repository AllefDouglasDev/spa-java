package app;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WTela05 extends WPanel {

	/**
	 * Create the panel.
	 */
	public WTela05(JFrame f) {
		super(f);
	}

	@Override
	public void panelHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void panelBody() {
		JButton btnMeuButu = new JButton("Meu but\u00E3u");
		panelBody.add(btnMeuButu);

		
	}

	@Override
	public void panelFooter() {
		// TODO Auto-generated method stub
		
	}

}
