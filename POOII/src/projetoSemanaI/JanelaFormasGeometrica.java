package projetoSemanaI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JanelaFormasGeometrica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaFormasGeometrica frame = new JanelaFormasGeometrica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaFormasGeometrica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}
	
	public void paint (Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D retangulo = new Rectangle2D.Double(80, 90, 240, 170);
		g2.draw(retangulo);
		
		g2.setColor(Color.GREEN);
		g2.fillRect(82, 91, 238, 169);
		
		Ellipse2D ellipse = new Ellipse2D.Double(100, 104, 200, 150);
		g2.draw(ellipse);
		
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		
		g2.dispose();
	}

}
