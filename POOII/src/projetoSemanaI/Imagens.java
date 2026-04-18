package projetoSemanaI;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Imagens extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Imagens frame = new Imagens();
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
	public Imagens() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		try {
			Image imagem = ImageIO.read(Imagens.class.getResource("/resources/homer.jpg"));
			
			g2.drawImage(imagem, 100, 30, this);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} 
		
		g2.dispose();
	}	

}
