package gamecomplex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

@SuppressWarnings({ "serial", "unused" })
public class Desmembrando extends JFrame {

	private JPanel contentPane;
	private JTextField txtPalavra;

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
					Desmembrando frame = new Desmembrando();
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
	public Desmembrando() {
		setBackground(Color.BLACK);
		setTitle("PotterManiacos | Desmembrando");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Desmembrando.class.getResource("/gamecomplex/pp.jpg")));
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 346);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 413, 206);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		scrollPane.setViewportView(textArea);
		
		txtPalavra = new JTextField();
		txtPalavra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				boolean continuar = true;
				char opcao;
				char opcao1;
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){
					
					while(continuar) {	
						String palavra = txtPalavra.getText();
					
						while (!palavra.isEmpty()) {
						textArea.append("\n");
						textArea.append(palavra);
						if (!palavra.isEmpty()) palavra = palavra.substring (1); 
										
						}
				        textArea.append("\n");
				        textArea.append("\n");
				        textArea.append("========================");
			            textArea.append("\n");
			            textArea.append("\n");
			            break;
					}
				}
			}
		});
		txtPalavra.setBounds(10, 51, 413, 28);
		contentPane.add(txtPalavra);
		txtPalavra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DESMEMBRANDO");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 413, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Desmembrando.this.dispose();
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
			
				boolean continuar = true;
				char opcao;
				char opcao1;
				
				while(continuar) {	
					String palavra = txtPalavra.getText();
				
					while (!palavra.isEmpty()) {
					textArea.append("\n");
					textArea.append(palavra);
					if (!palavra.isEmpty()) palavra = palavra.substring (1); 
									
					}
			        textArea.append("\n");
			        textArea.append("\n");
			        textArea.append("========================");
		            textArea.append("\n");
		            textArea.append("\n");
		            break;
				}
			
			}
		});
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(334, 11, 89, 28);
		contentPane.add(btnEnter);
		
		
	}
	
}
