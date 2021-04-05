package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_estoque = new JButton("Estoque");
		btn_estoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btn_estoque.setBounds(133, 23, 153, 40);
		frame.getContentPane().add(btn_estoque);
		
		JButton btn_compras = new JButton("Compras");
		btn_compras.setBounds(133, 145, 153, 40);
		frame.getContentPane().add(btn_compras);
		
		JButton btn_novo = new JButton("Novo+");
		btn_novo.setBounds(133, 86, 153, 40);
		frame.getContentPane().add(btn_novo);
		
		JButton btn_excluir = new JButton("Excluir");
		btn_excluir.setBounds(133, 196, 153, 40);
		frame.getContentPane().add(btn_excluir);
	}

}
