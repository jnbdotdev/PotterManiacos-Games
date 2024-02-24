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
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class TorreDupla extends JFrame {

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
					TorreDupla frame = new TorreDupla();
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
	public TorreDupla() {
		setResizable(false);
		setTitle("PotterManiacos | Torre Dupla");
		setAlwaysOnTop(true);
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TorreDupla.class.getResource("/gamecomplex/pp.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 305);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.DARK_GRAY);
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 414, 160);
		contentPane_1.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if(e.getKeyCode() == KeyEvent.VK_ENTER ){	
			    	String palavra = textField.getText();
			        palavra = palavra.toUpperCase();
			        int i;

			       textArea.append("```");
					 for (i = 0; i < palavra.length(); i++) {
				        char a = palavra.charAt(i);
				        textArea.append("\n" + a + a);
			          
			        }
					textArea.append("\n```");
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
		contentPane_1.add(textField);
		
		JLabel lblTorreDupla = new JLabel("TORRE DUPLA");
		lblTorreDupla.setHorizontalAlignment(SwingConstants.CENTER);
		lblTorreDupla.setForeground(Color.WHITE);
		lblTorreDupla.setFont(new Font("Dialog", Font.BOLD, 17));
		lblTorreDupla.setBounds(10, 11, 414, 29);
		contentPane_1.add(lblTorreDupla);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				TorreDupla.this.dispose();
				UnionWindow union = new UnionWindow();
				union.setVisible(true);
				
			}
		});
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(10, 11, 89, 28);
		contentPane_1.add(btnVoltar);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				String palavra = textField.getText();
		        palavra = palavra.toUpperCase();
		        int i;

		       textArea.append("```");
				 for (i = 0; i < palavra.length(); i++) {
			        char a = palavra.charAt(i);
			        textArea.append("\n" + a + a);
		          
		        }
				textArea.append("\n```");
		        textArea.append("\n");
		        textArea.append("\n");
		        textArea.append("========================");
	            textArea.append("\n");
	            textArea.append("\n");
			
			}
		});
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(335, 11, 89, 28);
		contentPane_1.add(btnEnter);
	}
}
