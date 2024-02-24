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
public class T9 extends JFrame {

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
					T9 frame = new T9();
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
	public T9() {
		setBackground(Color.BLACK);
		setTitle("PotterManiacos | T9");
		setIconImage(Toolkit.getDefaultToolkit().getImage(T9.class.getResource("/gamecomplex/pp.jpg")));
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
					
					palavra = palavra.replaceAll("a", "2");
					palavra = palavra.replaceAll("b", "2");
					palavra = palavra.replaceAll("c", "2");
					palavra = palavra.replaceAll("ç", "2");
					palavra = palavra.replaceAll("d", "3");
					palavra = palavra.replaceAll("e", "3");
					palavra = palavra.replaceAll("f", "3");
					palavra = palavra.replaceAll("g", "4");
					palavra = palavra.replaceAll("h", "4");
					palavra = palavra.replaceAll("i", "4");
					palavra = palavra.replaceAll("j", "5");
					palavra = palavra.replaceAll("k", "5");
					palavra = palavra.replaceAll("l", "5");
					palavra = palavra.replaceAll("m", "6");
					palavra = palavra.replaceAll("n", "6");
					palavra = palavra.replaceAll("o", "6");
					palavra = palavra.replaceAll("p", "7");
					palavra = palavra.replaceAll("q", "7");
					palavra = palavra.replaceAll("r", "7");
					palavra = palavra.replaceAll("s", "7");
					palavra = palavra.replaceAll("t", "8");
					palavra = palavra.replaceAll("u", "8");
					palavra = palavra.replaceAll("v", "8");
					palavra = palavra.replaceAll("w", "9");
					palavra = palavra.replaceAll("x", "9");
					palavra = palavra.replaceAll("y", "9");
					palavra = palavra.replaceAll("z", "9");
					
					palavra = palavra.replaceAll("A", "2");
					palavra = palavra.replaceAll("B", "2");
					palavra = palavra.replaceAll("C", "2");
					palavra = palavra.replaceAll("Ç", "2");
					palavra = palavra.replaceAll("D", "3");
					palavra = palavra.replaceAll("E", "3");
					palavra = palavra.replaceAll("F", "3");
					palavra = palavra.replaceAll("G", "4");
					palavra = palavra.replaceAll("H", "4");
					palavra = palavra.replaceAll("I", "4");
					palavra = palavra.replaceAll("J", "5");
					palavra = palavra.replaceAll("K", "5");
					palavra = palavra.replaceAll("L", "5");
					palavra = palavra.replaceAll("M", "6");
					palavra = palavra.replaceAll("N", "6");
					palavra = palavra.replaceAll("O", "6");
					palavra = palavra.replaceAll("P", "7");
					palavra = palavra.replaceAll("Q", "7");
					palavra = palavra.replaceAll("R", "7");
					palavra = palavra.replaceAll("S", "7");
					palavra = palavra.replaceAll("T", "8");
					palavra = palavra.replaceAll("U", "8");
					palavra = palavra.replaceAll("V", "8");
					palavra = palavra.replaceAll("W", "9");
					palavra = palavra.replaceAll("X", "9");
					palavra = palavra.replaceAll("Y", "9");
					palavra = palavra.replaceAll("Z", "9");
					
					palavra = palavra.replaceAll("á", "2");
					palavra = palavra.replaceAll("à", "2");
					palavra = palavra.replaceAll("â", "2");
					palavra = palavra.replaceAll("ã", "2");
					palavra = palavra.replaceAll("ä", "2");
					
					palavra = palavra.replaceAll("Á", "2");
					palavra = palavra.replaceAll("À", "2");
					palavra = palavra.replaceAll("Â", "2");
					palavra = palavra.replaceAll("Ã", "2");
					palavra = palavra.replaceAll("Ä", "2");
					
					palavra = palavra.replaceAll("é", "3");
					palavra = palavra.replaceAll("è", "3");
					palavra = palavra.replaceAll("ê", "3");
					palavra = palavra.replaceAll("ë", "3");
					
					palavra = palavra.replaceAll("É", "3");
					palavra = palavra.replaceAll("È", "3");
					palavra = palavra.replaceAll("Ê", "3");
					palavra = palavra.replaceAll("Ë", "3");
					
					palavra = palavra.replaceAll("í", "4");
					palavra = palavra.replaceAll("ì", "4");
					palavra = palavra.replaceAll("î", "4");
					palavra = palavra.replaceAll("ï", "4");
					
					palavra = palavra.replaceAll("Í", "4");
					palavra = palavra.replaceAll("Ì", "4");
					palavra = palavra.replaceAll("Î", "4");
					palavra = palavra.replaceAll("Ï", "4");
					
					palavra = palavra.replaceAll("ó", "6");
					palavra = palavra.replaceAll("ò", "6");
					palavra = palavra.replaceAll("ô", "6");
					palavra = palavra.replaceAll("õ", "6");
					palavra = palavra.replaceAll("ö", "6");
					
					palavra = palavra.replaceAll("Ó", "6");
					palavra = palavra.replaceAll("Ò", "6");
					palavra = palavra.replaceAll("Ô", "6");
					palavra = palavra.replaceAll("Õ", "6");
					palavra = palavra.replaceAll("Ö", "6");
					
					palavra = palavra.replaceAll("ú", "8");
					palavra = palavra.replaceAll("ù", "8");
					palavra = palavra.replaceAll("û", "8");
					palavra = palavra.replaceAll("ü", "8");
					
					palavra = palavra.replaceAll("Ú", "8");
					palavra = palavra.replaceAll("Ù", "8");
					palavra = palavra.replaceAll("Û", "8");
					palavra = palavra.replaceAll("Ü", "8");
					
					palavra = palavra.replaceAll("_", " ");
					
					textArea.append(palavra);
					
			        
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
		
		JLabel lblT = new JLabel("T9 447");
		lblT.setHorizontalAlignment(SwingConstants.CENTER);
		lblT.setForeground(Color.WHITE);
		lblT.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblT.setBounds(10, 11, 414, 29);
		contentPane.add(lblT);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				T9.this.dispose();
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
				
				palavra = palavra.replaceAll("a", "2");
				palavra = palavra.replaceAll("b", "2");
				palavra = palavra.replaceAll("c", "2");
				palavra = palavra.replaceAll("ç", "2");
				palavra = palavra.replaceAll("d", "3");
				palavra = palavra.replaceAll("e", "3");
				palavra = palavra.replaceAll("f", "3");
				palavra = palavra.replaceAll("g", "4");
				palavra = palavra.replaceAll("h", "4");
				palavra = palavra.replaceAll("i", "4");
				palavra = palavra.replaceAll("j", "5");
				palavra = palavra.replaceAll("k", "5");
				palavra = palavra.replaceAll("l", "5");
				palavra = palavra.replaceAll("m", "6");
				palavra = palavra.replaceAll("n", "6");
				palavra = palavra.replaceAll("o", "6");
				palavra = palavra.replaceAll("p", "7");
				palavra = palavra.replaceAll("q", "7");
				palavra = palavra.replaceAll("r", "7");
				palavra = palavra.replaceAll("s", "7");
				palavra = palavra.replaceAll("t", "8");
				palavra = palavra.replaceAll("u", "8");
				palavra = palavra.replaceAll("v", "8");
				palavra = palavra.replaceAll("w", "9");
				palavra = palavra.replaceAll("x", "9");
				palavra = palavra.replaceAll("y", "9");
				palavra = palavra.replaceAll("z", "9");
				
				palavra = palavra.replaceAll("A", "2");
				palavra = palavra.replaceAll("B", "2");
				palavra = palavra.replaceAll("C", "2");
				palavra = palavra.replaceAll("Ç", "2");
				palavra = palavra.replaceAll("D", "3");
				palavra = palavra.replaceAll("E", "3");
				palavra = palavra.replaceAll("F", "3");
				palavra = palavra.replaceAll("G", "4");
				palavra = palavra.replaceAll("H", "4");
				palavra = palavra.replaceAll("I", "4");
				palavra = palavra.replaceAll("J", "5");
				palavra = palavra.replaceAll("K", "5");
				palavra = palavra.replaceAll("L", "5");
				palavra = palavra.replaceAll("M", "6");
				palavra = palavra.replaceAll("N", "6");
				palavra = palavra.replaceAll("O", "6");
				palavra = palavra.replaceAll("P", "7");
				palavra = palavra.replaceAll("Q", "7");
				palavra = palavra.replaceAll("R", "7");
				palavra = palavra.replaceAll("S", "7");
				palavra = palavra.replaceAll("T", "8");
				palavra = palavra.replaceAll("U", "8");
				palavra = palavra.replaceAll("V", "8");
				palavra = palavra.replaceAll("W", "9");
				palavra = palavra.replaceAll("X", "9");
				palavra = palavra.replaceAll("Y", "9");
				palavra = palavra.replaceAll("Z", "9");
				
				palavra = palavra.replaceAll("á", "2");
				palavra = palavra.replaceAll("à", "2");
				palavra = palavra.replaceAll("â", "2");
				palavra = palavra.replaceAll("ã", "2");
				palavra = palavra.replaceAll("ä", "2");
				
				palavra = palavra.replaceAll("Á", "2");
				palavra = palavra.replaceAll("À", "2");
				palavra = palavra.replaceAll("Â", "2");
				palavra = palavra.replaceAll("Ã", "2");
				palavra = palavra.replaceAll("Ä", "2");
				
				palavra = palavra.replaceAll("é", "3");
				palavra = palavra.replaceAll("è", "3");
				palavra = palavra.replaceAll("ê", "3");
				palavra = palavra.replaceAll("ë", "3");
				
				palavra = palavra.replaceAll("É", "3");
				palavra = palavra.replaceAll("È", "3");
				palavra = palavra.replaceAll("Ê", "3");
				palavra = palavra.replaceAll("Ë", "3");
				
				palavra = palavra.replaceAll("í", "4");
				palavra = palavra.replaceAll("ì", "4");
				palavra = palavra.replaceAll("î", "4");
				palavra = palavra.replaceAll("ï", "4");
				
				palavra = palavra.replaceAll("Í", "4");
				palavra = palavra.replaceAll("Ì", "4");
				palavra = palavra.replaceAll("Î", "4");
				palavra = palavra.replaceAll("Ï", "4");
				
				palavra = palavra.replaceAll("ó", "6");
				palavra = palavra.replaceAll("ò", "6");
				palavra = palavra.replaceAll("ô", "6");
				palavra = palavra.replaceAll("õ", "6");
				palavra = palavra.replaceAll("ö", "6");
				
				palavra = palavra.replaceAll("Ó", "6");
				palavra = palavra.replaceAll("Ò", "6");
				palavra = palavra.replaceAll("Ô", "6");
				palavra = palavra.replaceAll("Õ", "6");
				palavra = palavra.replaceAll("Ö", "6");
				
				palavra = palavra.replaceAll("ú", "8");
				palavra = palavra.replaceAll("ù", "8");
				palavra = palavra.replaceAll("û", "8");
				palavra = palavra.replaceAll("ü", "8");
				
				palavra = palavra.replaceAll("Ú", "8");
				palavra = palavra.replaceAll("Ù", "8");
				palavra = palavra.replaceAll("Û", "8");
				palavra = palavra.replaceAll("Ü", "8");
				
				palavra = palavra.replaceAll("_", " ");
				
				textArea.append(palavra);
				
		        
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
