package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_inicial {

	private JFrame frame;
	private JTextField tb_usuario;
	private JTextField tb_senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_inicial window = new Tela_inicial();
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
	public Tela_inicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb_usuario = new JLabel("Usu\u00E1rio");
		lb_usuario.setForeground(Color.WHITE);
		lb_usuario.setBackground(Color.BLACK);
		lb_usuario.setBounds(186, 40, 46, 14);
		frame.getContentPane().add(lb_usuario);
		
		tb_usuario = new JTextField();
		tb_usuario.setBounds(147, 65, 136, 20);
		frame.getContentPane().add(tb_usuario);
		tb_usuario.setColumns(10);
		
		JLabel lb_senha = new JLabel("Senha");
		lb_senha.setForeground(Color.WHITE);
		lb_senha.setBounds(186, 93, 46, 14);
		frame.getContentPane().add(lb_senha);
		
		tb_senha = new JTextField();
		tb_senha.setBounds(147, 118, 136, 20);
		frame.getContentPane().add(tb_senha);
		tb_senha.setColumns(10);
		
		JButton btn_entrar = new JButton("Entrar");
		btn_entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
		if(verificar(tb_usuario.getText(),new String(tb_senha.getText()))) {
			JOptionPane.showMessageDialog(null,"Bem vindo!");
			
			
		}else {
			JOptionPane.showMessageDialog(null,"Dados Invalidos!","ERRO",JOptionPane.WARNING_MESSAGE);
		}
		    
			}
		});
		btn_entrar.setBounds(175, 168, 89, 39);
		frame.getContentPane().add(btn_entrar);
	}

	protected void setDefault(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean verificar(String nome,String senha) {
		return nome.equals("junior") && senha.equals("1234");
		}
}
