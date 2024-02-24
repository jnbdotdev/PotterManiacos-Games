package gamecomplex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

@SuppressWarnings({ "serial", "unused" })
public class Pontilhado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pontilhado frame = new Pontilhado();
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
	public Pontilhado() {
		setBackground(Color.BLACK);
		setTitle("PotterManiacos | Pontilhado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pontilhado.class.getResource("/gamecomplex/pp.jpg")));
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 414, 160);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){	
			    	String palavra = textField.getText();
			        
			        int i;

			        for (i = 0; i < palavra.length(); i++) {
			            char a = palavra.charAt(i);
			            textArea.append(""+ a + ".");
			          
			        }
			        textArea.append("\n");
			        textArea.append("\n");
			        textArea.append("========================");
		            textArea.append("\n");
		            textArea.append("\n");
				}
				
			}
		});
		textField.setColumns(10);
		textField.setBounds(10, 51, 414, 28);
		contentPane.add(textField);
		
		JLabel lblPontilhado = new JLabel("PONTILHADO");
		lblPontilhado.setHorizontalAlignment(SwingConstants.CENTER);
		lblPontilhado.setForeground(Color.WHITE);
		lblPontilhado.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblPontilhado.setBounds(10, 11, 414, 29);
		contentPane.add(lblPontilhado);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Pontilhado.this.dispose();
				UnionWindow union = new UnionWindow();
				union.setVisible(true);
			
			}
		});
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(10, 11, 89, 28);
		contentPane.add(btnVoltar);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				String palavra = textField.getText();
		        
		        int i;

		        for (i = 0; i < palavra.length(); i++) {
		            char a = palavra.charAt(i);
		            textArea.append(""+ a + ".");
		          
		        }
		        textArea.append("\n");
		        textArea.append("\n");
		        textArea.append("========================");
	            textArea.append("\n");
	            textArea.append("\n");
			
			}
		});
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(335, 11, 89, 28);
		contentPane.add(btnEnter);
	}

}
