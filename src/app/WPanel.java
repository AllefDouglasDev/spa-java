package app;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class WPanel extends JPanel {
	// Frame onde a tela está inserida
	private JFrame frame;
	// Lista de telas dependentes dessa tela
	private List<JPanel> pReference;
	// Nome referente ao panel, para ser encontrado mais facilmente
	private List<String> pReferenceName;
	// Panel superior
	protected JPanel panelHeader;
	// Corpo da tela
	protected JPanel panelBody;
	// Parte inferior da tela
	protected JPanel panelFooter;
	// Métodos a serem obrigatoriamente implementados
	public abstract void panelHeader();
	
	public abstract void panelBody();
	
	public abstract void panelFooter();
	
	/**
	 * Construtor para iniciar tela já configurada
	 * 
	 * @param JFrame frame principal a qual essa tela está inserida
	 */
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
	
	/**
	 * Insere uma tela como dependencia dessa tela
	 * 
	 * @param String referencia
	 * @param JPanel
	 */
	public void putPanel(String r, JPanel p) {
		if(null == pReference)
			pReference = new ArrayList<>();
		if(null == pReferenceName)
			pReferenceName = new ArrayList<>();
		
		pReferenceName.add(r);
		pReference.add(p);
	}
	
	/**
	 * Retorna uma tela a partir de sua referencia
	 * 
	 * @param String referencia
	 * @return
	 */
	public JPanel getPanel(String r) {
		if (null != pReference) {
			for (int i = 0; i < pReferenceName.size(); i++) {
				if (pReferenceName.get(i).equals(r))
					return pReference.get(i);
			}
		}
		return null;
	}

	/**
	 * Retorna o frame que essa tela está inserida
	 * @return JFrame frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Altera o frame que essa tela está inserida
	 * @param JFrame frame
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
