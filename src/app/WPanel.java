package app;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class WPanel extends JPanel {

	private JFrame frame;
	
	private List<JPanel> pReference;
	
	private List<String> pReferenceName;
	
	protected JPanel panelHeader;
	
	protected JPanel panelBody;
	
	protected JPanel panelFooter;

	public abstract void panelHeader();
	
	public abstract void panelBody();
	
	public abstract void panelFooter();
	
	public WPanel(JFrame f) {
		setFrame(f);
		setLayout(new BorderLayout(0, 0));
		
		panelHeader = new JPanel();
		panelBody = new JPanel();
		panelFooter = new JPanel();
		
		add(panelHeader, BorderLayout.NORTH);
		add(panelBody, BorderLayout.CENTER);
		add(panelFooter, BorderLayout.SOUTH);
		
		panelHeader();
		panelBody();
		panelFooter();
	}
	
	public void putPanel(String r, JPanel p) {
		if(null == pReference)
			pReference = new ArrayList<>();
		if(null == pReferenceName)
			pReferenceName = new ArrayList<>();
		
		pReferenceName.add(r);
		pReference.add(p);
	}
	
	public JPanel getPanel(String r) {
		if (null != pReference) {
			for (int i = 0; i < pReferenceName.size(); i++) {
				if (pReferenceName.get(i).equals(r))
					return pReference.get(i);
			}
		}
		return null;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
