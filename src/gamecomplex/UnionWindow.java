package gamecomplex;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings({ "serial", "unused" })
public class UnionWindow extends JFrame {

	
	private JPanel unionPane;

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
					UnionWindow frame = new UnionWindow();
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
	public UnionWindow() {
		setForeground(Color.BLACK);
		setTitle("PotterManiacos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UnionWindow.class.getResource("/gamecomplex/pp.jpg")));
		setResizable(false);
		setBackground(Color.BLACK);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 381);
		unionPane = new JPanel();
		unionPane.setBackground(Color.DARK_GRAY);
		unionPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(unionPane);
		unionPane.setLayout(null);
		
		JLabel lblDigiteUmNmero = new JLabel("SELECIONE O GAME");
		lblDigiteUmNmero.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigiteUmNmero.setForeground(Color.WHITE);
		lblDigiteUmNmero.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblDigiteUmNmero.setBounds(48, 11, 328, 19);
		unionPane.add(lblDigiteUmNmero);
		
		JButton btnCompor = new JButton("Compor");
		btnCompor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Compor compor = new Compor();
				compor.setVisible(true);
			
			}
		});
		btnCompor.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnCompor.setBackground(Color.WHITE);
		btnCompor.setBounds(10, 89, 174, 30);
		unionPane.add(btnCompor);
		
		JButton btnComporDecompor = new JButton("Compor Decompor");
		btnComporDecompor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				ComporDecompor compordecompor = new ComporDecompor();
				compordecompor.setVisible(true);
			
			}
		});
		btnComporDecompor.setBackground(Color.WHITE);
		btnComporDecompor.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnComporDecompor.setBounds(10, 130, 174, 30);
		unionPane.add(btnComporDecompor);
		
		JButton btnDecompor = new JButton("Decompor");
		btnDecompor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Decompor decompor = new Decompor();
				decompor.setVisible(true);
			
			}
		});
		btnDecompor.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnDecompor.setBackground(Color.WHITE);
		btnDecompor.setBounds(10, 171, 174, 30);
		unionPane.add(btnDecompor);
		
		JButton btnDecomporCompor = new JButton("Decompor Compor");
		btnDecomporCompor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				DecomporCompor decomporcompor = new DecomporCompor();
				decomporcompor.setVisible(true);
			
			}
		});
		btnDecomporCompor.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnDecomporCompor.setBackground(Color.WHITE);
		btnDecomporCompor.setBounds(10, 212, 174, 30);
		unionPane.add(btnDecomporCompor);
		
		JButton btnDesmebrando = new JButton("Desmebrando");
		btnDesmebrando.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Desmembrando desmembrando = new Desmembrando();
				desmembrando.setVisible(true);
				
			}
		});
		btnDesmebrando.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnDesmebrando.setBackground(Color.WHITE);
		btnDesmebrando.setBounds(10, 253, 174, 30);
		unionPane.add(btnDesmebrando);
		
		JButton btnAcrostico = new JButton("Acr\u00F3stico");
		btnAcrostico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Acrostico acrostico = new Acrostico();
				acrostico.setVisible(true);
			
			}
		});
		btnAcrostico.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnAcrostico.setBackground(Color.WHITE);
		btnAcrostico.setBounds(10, 48, 174, 30);
		unionPane.add(btnAcrostico);
		
		JButton btnTorreDupla = new JButton("Torre Dupla");
		btnTorreDupla.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				TorreDupla torredupla = new TorreDupla();
				torredupla.setVisible(true);
				
			}
		});
		btnTorreDupla.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnTorreDupla.setBackground(Color.WHITE);
		btnTorreDupla.setBounds(235, 253, 174, 30);
		unionPane.add(btnTorreDupla);
		
		JButton btnTNove = new JButton("T9");
		btnTNove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				T9 t9 = new T9();
				t9.setVisible(true);
			
			}
		});
		btnTNove.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnTNove.setBackground(Color.WHITE);
		btnTNove.setBounds(235, 212, 174, 30);
		unionPane.add(btnTNove);
		
		JButton btnSeparador = new JButton("Separador");
		btnSeparador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Separador separador = new Separador();
				separador.setVisible(true);
				
			}
		});
		btnSeparador.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnSeparador.setBackground(Color.WHITE);
		btnSeparador.setBounds(235, 171, 174, 30);
		unionPane.add(btnSeparador);
		
		JButton btnPontilhado = new JButton("Pontilhado");
		btnPontilhado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Pontilhado pontilhado = new Pontilhado();
				pontilhado.setVisible(true);
			
			}
		});
		btnPontilhado.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnPontilhado.setBackground(Color.WHITE);
		btnPontilhado.setBounds(235, 130, 174, 30);
		unionPane.add(btnPontilhado);
		
		JButton btnGeminio = new JButton("Geminio");
		btnGeminio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Geminio geminio = new Geminio();
				geminio.setVisible(true);
				
			}
		});
		btnGeminio.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnGeminio.setBackground(Color.WHITE);
		btnGeminio.setBounds(235, 48, 174, 30);
		unionPane.add(btnGeminio);
		
		JButton btnEspelho = new JButton("Espelho");
		btnEspelho.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				Espelho espelho = new Espelho();
				espelho.setVisible(true);
				
			}
		});
		btnEspelho.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnEspelho.setBackground(Color.WHITE);
		btnEspelho.setBounds(10, 294, 174, 30);
		unionPane.add(btnEspelho);
		
		JButton btnMalditoTeto = new JButton("Maldito Teto");
		btnMalditoTeto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				MalditoTeto malditoteto = new MalditoTeto();
				malditoteto.setVisible(true);
			
			}
		});
		btnMalditoTeto.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnMalditoTeto.setBackground(Color.WHITE);
		btnMalditoTeto.setBounds(235, 89, 174, 30);
		unionPane.add(btnMalditoTeto);
		
		JButton btnZigzagDeLetras = new JButton("ZigZag");
		btnZigzagDeLetras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				UnionWindow.this.dispose();
				ZigZag zigzag = new ZigZag();
				zigzag.setVisible(true);
			
			}
		});
		btnZigzagDeLetras.setFont(new Font("Lao UI", Font.BOLD, 12));
		btnZigzagDeLetras.setBackground(Color.WHITE);
		btnZigzagDeLetras.setBounds(235, 294, 174, 30);
		unionPane.add(btnZigzagDeLetras);
	}
}
