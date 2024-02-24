package gamecomplex;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
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

@SuppressWarnings({ "serial", "unused" })
public class ZigZag extends JFrame {

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
					ZigZag frame = new ZigZag();
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
	public ZigZag() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ZigZag.class.getResource("/gamecomplex/pp.jpg")));
		setTitle("PotterManiacos | ZigZag de Letras");
		setResizable(false);
		setBackground(Color.BLACK);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 310);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 424, 174);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){	
			    	String palavra = textField.getText();
			        
			    	int k;

			        for(k = 0; k < palavra.length(); k++) {
			        	if(k % 2 == 0) {
			        	char A = palavra.charAt(k);
			        	textArea.append("\n" + A);
			        }else if(k % 2 == 1) {
			        	char A = palavra.charAt(k);
			        	textArea.append("\n   " + A);
			      }
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
		textField.setBounds(10, 51, 424, 28);
		contentPane.add(textField);
		
		JLabel lblZigZag = new JLabel("ZIG ZAG");
		lblZigZag.setHorizontalAlignment(SwingConstants.CENTER);
		lblZigZag.setForeground(Color.WHITE);
		lblZigZag.setFont(new Font("Dialog", Font.BOLD, 17));
		lblZigZag.setBounds(10, 11, 424, 29);
		contentPane.add(lblZigZag);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				ZigZag.this.dispose();
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
		        
		    	int k;

		        for(k = 0; k < palavra.length(); k++) {
		        	if(k % 2 == 0) {
		        	char A = palavra.charAt(k);
		        	textArea.append("\n" + A);
		        }else if(k % 2 == 1) {
		        	char A = palavra.charAt(k);
		        	textArea.append("\n   " + A);
		      }
		    }
		        textArea.append("\n");
		        textArea.append("\n");
		        textArea.append("========================");
	            textArea.append("\n");
	            textArea.append("\n");
			
			}
		});
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(344, 11, 89, 28);
		contentPane.add(btnEnter);
	}
}
