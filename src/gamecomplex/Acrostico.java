package gamecomplex;

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
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings({ "serial", "unused" })
public class Acrostico extends JFrame {

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
					Acrostico frame = new Acrostico();
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
	public Acrostico() {
		setAlwaysOnTop(true);
		setBackground(Color.BLACK);
		setResizable(false);
		setTitle("PotterManiacos | Acr\u00F3stico");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Acrostico.class.getResource("/gamecomplex/pp.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 368);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 414, 228);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			
				if(e.getKeyCode() == KeyEvent.VK_ENTER ){	
			    	
					String palavra = textField.getText();
					palavra = palavra.replaceAll("á", "a");
					palavra = palavra.replaceAll("ã", "a");
					palavra = palavra.replaceAll("à", "a");
					palavra = palavra.replaceAll("â", "a");
					palavra = palavra.replaceAll("ä", "a");
					
					palavra = palavra.replaceAll("Á", "a");
					palavra = palavra.replaceAll("Ã", "a");
					palavra = palavra.replaceAll("À", "a");
					palavra = palavra.replaceAll("Â", "a");
					palavra = palavra.replaceAll("Ä", "a");
					
					palavra = palavra.replaceAll("ç", "c");
					
					palavra = palavra.replaceAll("é", "e");
					palavra = palavra.replaceAll("ê", "e");
					palavra = palavra.replaceAll("è", "e");
					palavra = palavra.replaceAll("ë", "e");
					
					palavra = palavra.replaceAll("É", "e");
					palavra = palavra.replaceAll("Ê", "e");
					palavra = palavra.replaceAll("È", "e");
					palavra = palavra.replaceAll("Ë", "e");
					
					palavra = palavra.replaceAll("í", "i");
					palavra = palavra.replaceAll("î", "i");
					palavra = palavra.replaceAll("ì", "i");
					palavra = palavra.replaceAll("ï", "i");
					
					palavra = palavra.replaceAll("Ì", "i");
					palavra = palavra.replaceAll("Î", "i");
					palavra = palavra.replaceAll("Í", "i");
					palavra = palavra.replaceAll("Ï", "i");
					
					palavra = palavra.replaceAll("ó", "o");
					palavra = palavra.replaceAll("ò", "o");
					palavra = palavra.replaceAll("ô", "o");
					palavra = palavra.replaceAll("õ", "o");
					palavra = palavra.replaceAll("ö", "o");
					
					palavra = palavra.replaceAll("Ó", "o");
					palavra = palavra.replaceAll("Ò", "o");
					palavra = palavra.replaceAll("Õ", "o");
					palavra = palavra.replaceAll("Ô", "o");
					palavra = palavra.replaceAll("Ö", "o");
					
					palavra = palavra.replaceAll("ú", "u");
					palavra = palavra.replaceAll("ù", "u");
					palavra = palavra.replaceAll("û", "u");
					palavra = palavra.replaceAll("ü", "u");
				
					palavra = palavra.replaceAll("Ú", "u");
					palavra = palavra.replaceAll("Ù", "u");
					palavra = palavra.replaceAll("Û", "u");
					palavra = palavra.replaceAll("Ü", "u");
					palavra = palavra.toUpperCase();
					/*		
					A
					*/	
							boolean alohomoraCheck;
							if(!palavra.equalsIgnoreCase("alohomora")) {
								alohomoraCheck = true;
								}else {
								alohomoraCheck = false;
								}
							boolean accioCheck = true;
							if(!palavra.equalsIgnoreCase("accio")) {
								accioCheck = true;
								}else {
								accioCheck = false;
								}
							boolean albusCheck = true;
							if(!palavra.equalsIgnoreCase("albus")) {
								albusCheck = true;
								}else {
								albusCheck = false;
								}
							boolean anapneoCheck = true;
							if(!palavra.equalsIgnoreCase("anapneo")) {
								anapneoCheck = true;
								}else {
								anapneoCheck = false;
								}
							boolean animagoCheck = true;
							if(!palavra.equalsIgnoreCase("animago")) {
								animagoCheck = true;
								}else {
								animagoCheck = false;
								}
							boolean ascendioCheck = true;
							if(!palavra.equalsIgnoreCase("ascendio")) {
								ascendioCheck = true;
								}else {
								ascendioCheck = false;
								}
					/*
					B 
					*/
							boolean bombardaCheck = true;
							if(!palavra.equalsIgnoreCase("bombarda")) {
								bombardaCheck = true;
								}else {
								bombardaCheck = false;
								}
							boolean braquiumCheck = true;
							if(!palavra.equalsIgnoreCase("braquium")) {
								braquiumCheck = true;
								}else {
								braquiumCheck = false;
								}
							boolean brachiabindoCheck = true;
							if(!palavra.equalsIgnoreCase("brachiabindo")) {
								brachiabindoCheck = true;
								}else {
								brachiabindoCheck = false;
								}
							boolean bublioCheck = true;
							if(!palavra.equalsIgnoreCase("bublio")) {
								bublioCheck = true;
								}else {
								bublioCheck = false;
								}
							boolean bamboeCheck = true;
							if(!palavra.equalsIgnoreCase("bamboe")) {
								bamboeCheck = true;
								}else {
								bamboeCheck = false;
								}
							boolean bellatrixCheck = true;
							if(!palavra.equalsIgnoreCase("bellatrix")) {
								bellatrixCheck = true;
								}else {
								bellatrixCheck = false;
								}
					/*
					C
					*/
							boolean caveCheck = true;
							if(!palavra.equalsIgnoreCase("cave")) {
								caveCheck = true;
								}else {
								caveCheck = false;
								}
							boolean crucioCheck = true;
							if(!palavra.equalsIgnoreCase("crucio")) {
								crucioCheck = true;
								}else {
								crucioCheck = false;
								}
							boolean clypeusCheck = true;
							if(!palavra.equalsIgnoreCase("clypeus")) {
								clypeusCheck = true;
								}else {
								clypeusCheck = false;
								}
							boolean confringoCheck = true;
							if(!palavra.equalsIgnoreCase("confringo")) {
								confringoCheck = true;
								}else {
								confringoCheck = false;
								}
							boolean confundusCheck = true;
							if(!palavra.equalsIgnoreCase("confundus")) {
								confundusCheck = true;
								}else {
								confundusCheck = false;
								}
							boolean confractusCheck = true;
							if(!palavra.equalsIgnoreCase("confractus")) {
								confractusCheck = true;
								}else {
								confractusCheck = false;
								}
					/*
					D
					*/
							boolean draconiforsCheck = true;
							if(!palavra.equalsIgnoreCase("draconifors")) {
								draconiforsCheck = true;
								}else {
								draconiforsCheck = false;
								}
							boolean diffindoCheck = true;
							if(!palavra.equalsIgnoreCase("diffindo")) {
								diffindoCheck = true;
								}else {
								diffindoCheck = false;
								}
							boolean dukliforsCheck = true;
							if(!palavra.equalsIgnoreCase("duklifors")) {
								dukliforsCheck = true;
								}else {
								dukliforsCheck = false;
								}
							boolean deletriusCheck = true;
							if(!palavra.equalsIgnoreCase("deletrius")) {
								deletriusCheck = true;
								}else {
								deletriusCheck = false;
								}
							boolean dragaoCheck = true;
							if(!palavra.equalsIgnoreCase("dragao")) {
								dragaoCheck = true;
								}else {
								dragaoCheck = false;
								}
							boolean diabreteCheck = true;
							if(!palavra.equalsIgnoreCase("diabrete")) {
								diabreteCheck = true;
								}else {
								diabreteCheck = false;
								}
					/*
					E
					*/
							boolean episkeyCheck = true;
							if(!palavra.equalsIgnoreCase("episkey")) {
								episkeyCheck = true;
								}else {
								episkeyCheck = false;
								}
							boolean expectoCheck = true;
							if(!palavra.equalsIgnoreCase("expecto")) {
								expectoCheck = true;
								}else {
								expectoCheck = false;
								}
							boolean expelliarmusCheck = true;
							if(!palavra.equalsIgnoreCase("expelliarmus")) {
								expelliarmusCheck = true;
								}else {
								expelliarmusCheck = false;
								}
							boolean estupefacaCheck = true;
							if(!palavra.equalsIgnoreCase("estupefa�a")) {
								estupefacaCheck = true;
								}else {
								estupefacaCheck = false;
								}
							boolean estuporeCheck = true;
							if(!palavra.equalsIgnoreCase("estupore")) {
								estuporeCheck = true;
								}else {
								estuporeCheck = false;
								}
							boolean evanescoCheck = true;
							if(!palavra.equalsIgnoreCase("evanesco")) {
								evanescoCheck = true;
								}else {
								evanescoCheck = false;
								}
					/*
					F
					*/
							boolean flipendoCheck = true;
							if(!palavra.equalsIgnoreCase("flipendo")) {
								flipendoCheck = true;
								}else {
								flipendoCheck = false;
								}
							boolean finiteCheck = true;
							if(!palavra.equalsIgnoreCase("finite")) {
								finiteCheck = true;
								}else {
								finiteCheck = false;
								}
							boolean finestraCheck = true;
							if(!palavra.equalsIgnoreCase("finestra")) {
								finestraCheck = true;
								}else {
								finestraCheck = false;
								}
							boolean ferulaCheck = true;
							if(!palavra.equalsIgnoreCase("ferula")) {
								ferulaCheck = true;
								}else {
								ferulaCheck = false;
								}
							boolean fideliusCheck = true;
							if(!palavra.equalsIgnoreCase("fidelius")) {
								fideliusCheck = true;
								}else {
								fideliusCheck = false;
								}
							boolean furnunculusCheck = true;
							if(!palavra.equalsIgnoreCase("furnunculus")) {
								furnunculusCheck = true;
								}else {
								furnunculusCheck = false;
								}
					/*
					G
					*/
							boolean geminioCheck = true;
							if(!palavra.equalsIgnoreCase("geminio")) {
								geminioCheck = true;
								}else {
								geminioCheck = false;
								}
							boolean godricCheck = true;
							if(!palavra.equalsIgnoreCase("godric")) {
								godricCheck = true;
								}else {
								godricCheck = false;
								}
							boolean guiCheck = true;
							if(!palavra.equalsIgnoreCase("gui")) {
								guiCheck = true;
								}else {
								guiCheck = false;
								}
							boolean gryffindorCheck = true;
							if(!palavra.equalsIgnoreCase("gryffindor")) {
								gryffindorCheck = true;
								}else {
								gryffindorCheck = false;
								}
							boolean glaciusCheck = true;
							if(!palavra.equalsIgnoreCase("glacius")) {
								glaciusCheck = true;
								}else {
								glaciusCheck = false;
								}
							boolean glisseoCheck = true;
							if(!palavra.equalsIgnoreCase("glisseo")) {
								glisseoCheck = true;
								}else {
								glisseoCheck = false;
								}
					/*
					H
					*/
							boolean horcruxCheck = true;
							if(!palavra.equalsIgnoreCase("horcrux")) {
								horcruxCheck = true;
								}else {
								horcruxCheck = false;
								}
							boolean harryCheck = true;
							if(!palavra.equalsIgnoreCase("harry")) {
								harryCheck = true;
								}else {
								harryCheck = false;
								}
							boolean homenumCheck = true;
							if(!palavra.equalsIgnoreCase("homenum")) {
								homenumCheck = true;
								}else {
								homenumCheck = false;
								}
							boolean hypnusCheck = true;
							if(!palavra.equalsIgnoreCase("hypnus")) {
								hypnusCheck = true;
								}else {
								hypnusCheck = false;
								}
							boolean herbivicusCheck = true;
							if(!palavra.equalsIgnoreCase("herbivicus")) {
								herbivicusCheck = true;
								}else {
								herbivicusCheck = false;
								}
							boolean homorfoCheck = true;
							if(!palavra.equalsIgnoreCase("homorfo")) {
								homorfoCheck = true;
								}else {
								homorfoCheck = false;
								}
					/*
					I
					*/
							boolean imperiusCheck = true;
							if(!palavra.equalsIgnoreCase("imperius")) {
								imperiusCheck = true;
								}else {
								imperiusCheck = false;
								}
							boolean incarcerousCheck = true;
							if(!palavra.equalsIgnoreCase("incarcerous")) {
								incarcerousCheck = true;
								}else {
								incarcerousCheck = false;
								}
							boolean incendioCheck = true;
							if(!palavra.equalsIgnoreCase("incendio")) {
								incendioCheck = true;
								}else {
								incendioCheck = false;
								}
							boolean impedimentaCheck = true;
							if(!palavra.equalsIgnoreCase("impedimenta")) {
								impedimentaCheck = true;
								}else {
								impedimentaCheck = false;
								}
							boolean immobilusCheck = true;
							if(!palavra.equalsIgnoreCase("immobilus")) {
								immobilusCheck = true;
								}else {
								immobilusCheck = false;
								}
							boolean imperviusCheck = true;
							if(!palavra.equalsIgnoreCase("impervius")) {
								imperviusCheck = true;
								}else {
								imperviusCheck = false;
								}
					/*
					J
					*/
							boolean jamesPotterCheck = true;
							if(!palavra.equalsIgnoreCase("james")) {
								jamesPotterCheck = true;
								}else {
								jamesPotterCheck = false;
								}
							boolean jorgeWeasleyCheck = true;
							if(!palavra.equalsIgnoreCase("jorge weasley")) {
								jorgeWeasleyCheck = true;
								}else {
								jorgeWeasleyCheck = false;
								}
							boolean jamesSiriusCheck = true;
							if(!palavra.equalsIgnoreCase("james")) {
								jamesSiriusCheck = true;
								}else {
								jamesSiriusCheck = false;
								}
					/*
					K
					*/
							boolean kreacherCheck = true;
							if(!palavra.equalsIgnoreCase("kreacher")) {
								kreacherCheck = true;
								}else {
								kreacherCheck = false;
								}
							boolean karkaroffCheck = true;
							if(!palavra.equalsIgnoreCase("karkaroff")) {
								karkaroffCheck = true;
								}else {
								karkaroffCheck = false;
								}
							boolean krumCheck = true;
							if(!palavra.equalsIgnoreCase("krum")) {
								krumCheck = true;
								}else {
								krumCheck = false;
								}
							boolean kelpieCheck = true;
							if(!palavra.equalsIgnoreCase("kelpie")) {
								kelpieCheck = true;
								}else {
								kelpieCheck = false;
								}
							boolean knightbusCheck = true;
							if(!palavra.equalsIgnoreCase("knight bus")) {
								knightbusCheck = true;
								}else {
								knightbusCheck = false;
								}
							boolean knarlCheck = true;
							if(!palavra.equalsIgnoreCase("knarl")) {
								knarlCheck = true;
								}else {
								knarlCheck = false;
								}

					/*
					L
					*/
							boolean lumusCheck = true;
							if(!palavra.equalsIgnoreCase("lumus")) {
								lumusCheck = true;
								}else {
								lumusCheck = false;
								}
							boolean legilimencyCheck = true;
							if(!palavra.equalsIgnoreCase("legilimency")) {
								legilimencyCheck = true;
								}else {
								legilimencyCheck = false;
								}
							boolean levicorpusCheck = true;
							if(!palavra.equalsIgnoreCase("levicorpus")) {
								levicorpusCheck = true;
								}else {
								levicorpusCheck = false;
								}
							boolean locomotorCheck = true;
							if(!palavra.equalsIgnoreCase("locomotor")) {
								locomotorCheck = true;
								}else {
								locomotorCheck = false;
								}
							boolean loremCheck = true;
							if(!palavra.equalsIgnoreCase("lorem")) {
								loremCheck = true;
								}else {
								loremCheck = false;
								}
							boolean laguzCheck = true;
							if(!palavra.equalsIgnoreCase("laguz")) {
								laguzCheck = true;
								}else {
								laguzCheck = false;
								}
					/*
					M
					*/
							boolean morsmordreCheck = true;
							if(!palavra.equalsIgnoreCase("morsmordre")) {
								morsmordreCheck = true;
								}else {
								morsmordreCheck = false;
								}
							boolean mannazCheck = true;
							if(!palavra.equalsIgnoreCase("mannaz")) {
								mannazCheck = true;
								}else {
								mannazCheck = false;
								}
							boolean mobilicorpusCheck = true;
							if(!palavra.equalsIgnoreCase("mobilicorpus")) {
								mobilicorpusCheck = true;
								}else {
								mobilicorpusCheck = false;
								}
							boolean mobiliarbusCheck = true;
							if(!palavra.equalsIgnoreCase("mobiliarbus")) {
								mobiliarbusCheck = true;
								}else {
								mobiliarbusCheck = false;
								}
							boolean mandrakeCheck = true;
							if(!palavra.equalsIgnoreCase("mandrake")) {
								mandrakeCheck = true;
								}else {
								mandrakeCheck = false;
								}
							boolean maraudersmapCheck = true;
							if(!palavra.equalsIgnoreCase("marauder's map")) {
								maraudersmapCheck = true;
								}else {
								maraudersmapCheck = false;
								}
					/*
					N
					*/
							boolean noxCheck = true;
							if(!palavra.equalsIgnoreCase("nox")) {
								noxCheck = true;
								}else {
								noxCheck = false;
								}
							boolean nauthizCheck = true;
							if(!palavra.equalsIgnoreCase("nauthiz")) {
								nauthizCheck = true;
								}else {
								nauthizCheck = false;
								}
							boolean nargleCheck = true;
							if(!palavra.equalsIgnoreCase("nargle")) {
								nargleCheck = true;
								}else {
								nargleCheck = false;
								}
							boolean narcisaCheck = true;
							if(!palavra.equalsIgnoreCase("narcisa")) {
								narcisaCheck = true;
								}else {
								narcisaCheck = false;
								}
							boolean nataliaCheck = true;
							if(!palavra.equalsIgnoreCase("nat�lia")) {
								nataliaCheck = true;
								}else {
								nataliaCheck = false;
								}
							boolean nigelCheck = true;
							if(!palavra.equalsIgnoreCase("nigel")) {
								nigelCheck = true;
								}else {
								nigelCheck = false;
								}

					/*
					O
					*/
							boolean obliviateCheck = true;
							if(!palavra.equalsIgnoreCase("obliviate")) {
								obliviateCheck = true;
								}else {
								obliviateCheck = false;
								}
							boolean orchideousCheck = true;
							if(!palavra.equalsIgnoreCase("orchideous")) {
								orchideousCheck = true;
								}else {
								orchideousCheck = false;
								}
							boolean ofidioglotaCheck = true;
							if(!palavra.equalsIgnoreCase("oficioglota")) {
								ofidioglotaCheck = true;
								}else {
								ofidioglotaCheck = false;
								}
							boolean ollivandersCheck = true;
							if(!palavra.equalsIgnoreCase("ollivander's")) {
								ollivandersCheck = true;
								}else {
								ollivandersCheck = false;
								}
							boolean odinCheck = true;
							if(!palavra.equalsIgnoreCase("odin")) {
								odinCheck = true;
								}else {
								odinCheck = false;
								}
							boolean othilaCheck = true;
							if(!palavra.equalsIgnoreCase("othila")) {
								othilaCheck = true;
								}else {
								othilaCheck = false;
								}

					/*
					P
					*/
							boolean perhtCheck = true;
							if(!palavra.equalsIgnoreCase("perht")) {
								perhtCheck = true;
								}else {
								perhtCheck = false;
								}
							boolean petrificusCheck = true;
							if(!palavra.equalsIgnoreCase("petrificus")) {
								petrificusCheck = true;
								}else {
								petrificusCheck = false;
								}
							boolean petuniaCheck = true;
							if(!palavra.equalsIgnoreCase("petunia")) {
								petuniaCheck = true;
								}else {
								petuniaCheck = false;
								}
							boolean pericullumCheck = true;
							if(!palavra.equalsIgnoreCase("pericullum")) {
								pericullumCheck = true;
								}else {
								pericullumCheck = false;
								}
							boolean peterCheck = true;
							if(!palavra.equalsIgnoreCase("peter")) {
								peterCheck = true;
								}else {
								peterCheck = false;
								}
							boolean patronoCheck = true;
							if(!palavra.equalsIgnoreCase("patrono")) {
								patronoCheck = true;
								}else {
								patronoCheck = false;
								}
					/*
					Q
					*/
							boolean quadribolCheck = true;
							if(!palavra.equalsIgnoreCase("quadribol")) {
								quadribolCheck = true;
								}else {
								quadribolCheck = false;
								}
							boolean quidditchCheck = true;
							if(!palavra.equalsIgnoreCase("quidditch")) {
								quidditchCheck = true;
								}else {
								quidditchCheck = false;
								}
							boolean quietusCheck = true;
							if(!palavra.equalsIgnoreCase("quietus")) {
								quietusCheck = true;
								}else {
								quietusCheck = false;
								}
							boolean quintipedeCheck = true;
							if(!palavra.equalsIgnoreCase("quintipede")) {
								quintipedeCheck = true;
								}else {
								quintipedeCheck = false;
								}
							boolean quirrelCheck = true;
							if(!palavra.equalsIgnoreCase("quirrel")) {
								quirrelCheck = true;
								}else {
								quirrelCheck = false;
								}
							boolean quirkeCheck = true;
							if(!palavra.equalsIgnoreCase("quirke")) {
								quirkeCheck = true;
								}else {
								quirkeCheck = false;
								}
					/*
					R
					*/
							boolean riddleCheck = true;
							if(!palavra.equalsIgnoreCase("riddle")) {
								riddleCheck = true;
								}else {
								riddleCheck = false;
								}
							boolean ravenclawCheck = true;
							if(!palavra.equalsIgnoreCase("ravenclaw")) {
								ravenclawCheck = true;
								}else {
								ravenclawCheck = false;
								}
							boolean raidoCheck = true;
							if(!palavra.equalsIgnoreCase("raido")) {
								raidoCheck = true;
								}else {
								raidoCheck = false;
								}
							boolean reductoCheck = true;
							if(!palavra.equalsIgnoreCase("reducto")) {
								reductoCheck = true;
								}else {
								reductoCheck = false;
								}
							boolean revelioCheck = true;
							if(!palavra.equalsIgnoreCase("revelio")) {
								revelioCheck = true;
								}else {
								revelioCheck = false;
								}
							boolean riddikulusCheck = true;
							if(!palavra.equalsIgnoreCase("riddikulus")) {
								riddikulusCheck = true;
								}else {
								riddikulusCheck = false;
								}
					/*
					S
					*/
							boolean sectumsempraCheck = true;
							if(!palavra.equalsIgnoreCase("sectumsempra")) {
								sectumsempraCheck = true;
								}else {
								sectumsempraCheck = false;
								}
							boolean salvioCheck = true;
							if(!palavra.equalsIgnoreCase("salvio")) {
								salvioCheck = true;
								}else {
								salvioCheck = false;
								}
							boolean serpensortiaCheck = true;
							if(!palavra.equalsIgnoreCase("serpensortia")) {
								serpensortiaCheck = true;
								}else {
								serpensortiaCheck = false;
								}
							boolean soweluCheck = true;
							if(!palavra.equalsIgnoreCase("sowelu")) {
								soweluCheck = true;
								}else {
								soweluCheck = false;
								}
							boolean sinistroCheck = true;
							if(!palavra.equalsIgnoreCase("sinistro")) {
								sinistroCheck = true;
								}else {
								sinistroCheck = false;
								}
							boolean slytherinCheck = true;
							if(!palavra.equalsIgnoreCase("slytherin")) {
								slytherinCheck = true;
								}else {
								slytherinCheck = false;
								}
					/*
					T
					*/
							boolean transfiguracaoCheck = true;
							if(!palavra.equalsIgnoreCase("transfiguracao")) {
								transfiguracaoCheck = true;
								}else {
								transfiguracaoCheck = false;
								}
							boolean trasgoCheck = true;
							if(!palavra.equalsIgnoreCase("trasgo")) {
								trasgoCheck = true;
								}else {
								trasgoCheck = false;
								}
							boolean travessaCheck = true;
							if(!palavra.equalsIgnoreCase("travessa")) {
								travessaCheck = true;
								}else {
								travessaCheck = false;
								}
							boolean tratoDCMCheck = true;
							if(!palavra.equalsIgnoreCase("trato das criaturas magicas")) {
								tratoDCMCheck = true;
								}else {
								tratoDCMCheck = false;
								}
							boolean thomasCheck = true;
							if(!palavra.equalsIgnoreCase("thomas")) {
								thomasCheck = true;
								}else {
								thomasCheck = false;
								}
							boolean toothillCheck = true;
							if(!palavra.equalsIgnoreCase("toothill")) {
								toothillCheck = true;
								}else {
								toothillCheck = false;
								}
					/*
					U
					*/
							boolean umbridgeCheck = true;
							if(!palavra.equalsIgnoreCase("umbrigde")) {
								umbridgeCheck = true;
								}else {
								umbridgeCheck = false;
								}
							boolean uruzCheck = true;
							if(!palavra.equalsIgnoreCase("uruz")) {
								uruzCheck = true;
								}else {
								uruzCheck = false;
								}
							boolean unicornioCheck = true;
							if(!palavra.equalsIgnoreCase("unicornio")) {
								unicornioCheck = true;
								}else {
								unicornioCheck = false;
								}
							boolean uediuosiCheck = true;
							if(!palavra.equalsIgnoreCase("uediuosi")) {
								uediuosiCheck = true;
								}else {
								uediuosiCheck = false;
								}
							boolean umfravilleCheck = true;
							if(!palavra.equalsIgnoreCase("umfraville")) {
								umfravilleCheck = true;
								}else {
								umfravilleCheck = false;
								}
							boolean umgubularCheck = true;
							if(!palavra.equalsIgnoreCase("umgubular")) {
								umgubularCheck = true;
								}else {
								umgubularCheck = false;
								}
					/*
					V
					*/
							boolean vagemCheck = true;
							if(!palavra.equalsIgnoreCase("vagem")) {
								vagemCheck = true;
								}else {
								vagemCheck = false;
								}
							boolean veravertoCheck = true;
							if(!palavra.equalsIgnoreCase("vera verto")) {
								veravertoCheck = true;
								}else {
								veravertoCheck = false;
								}
							boolean vulneraCheck = true;
							if(!palavra.equalsIgnoreCase("vulnera")) {
								vulneraCheck = true;
								}else {
								vulneraCheck = false;
								}
							boolean veelaCheck = true;
							if(!palavra.equalsIgnoreCase("veela")) {
								veelaCheck = true;
								}else {
								veelaCheck = false;
								}
							boolean venomoustentaculaCheck = true;
							if(!palavra.equalsIgnoreCase("venomous tentacula")) {
								venomoustentaculaCheck = true;
								}else {
								venomoustentaculaCheck = false;
								}
							boolean visgoCheck = true;
							if(!palavra.equalsIgnoreCase("visgo")) {
								visgoCheck = true;
								}else {
								visgoCheck = false;
								}
					/*
					W
					*/
							boolean wingardiumCheck = true;
							if(!palavra.equalsIgnoreCase("wingardium")) {
								wingardiumCheck = true;
								}else {
								wingardiumCheck = false;
								}
							boolean wandCheck = true;
							if(!palavra.equalsIgnoreCase("wand")) {
								wandCheck = true;
								}else {
								wandCheck = false;
								}
							boolean weasleyCheck = true;
							if(!palavra.equalsIgnoreCase("weasley")) {
								weasleyCheck = true;
								}else {
								weasleyCheck = false;
								}
							boolean wizengamotCheck = true;
							if(!palavra.equalsIgnoreCase("wizengamot")) {
								wizengamotCheck = true;
								}else {
								wizengamotCheck = false;
								}
							boolean wunjoCheck = true;
							if(!palavra.equalsIgnoreCase("wunjo")) {
								wunjoCheck = true;
								}else {
								wunjoCheck = false;
								}
							boolean wilkesCheck = true;
							if(!palavra.equalsIgnoreCase("wilkes")) {
								wilkesCheck = true;
								}else {
								wilkesCheck = false;
								}
					/*
					X
					*/
							boolean xenophiliusCheck = true;
							if(!palavra.equalsIgnoreCase("xenophilius")) {
								xenophiliusCheck = true;
								}else {
								xenophiliusCheck = false;
								}
							boolean xaropeCheck = true;
							if(!palavra.equalsIgnoreCase("xarope")) {
								xaropeCheck = true;
								}else {
								xaropeCheck = false;
								}
					/*
					Y
					*/
							boolean yaxleyCheck = true;
							if(!palavra.equalsIgnoreCase("yaxley")) {
								yaxleyCheck = true;
								}else {
								yaxleyCheck = false;
								}
							boolean yetiCheck = true;
							if(!palavra.equalsIgnoreCase("yeti")) {
								yetiCheck = true;
								}else {
								yetiCheck = false;
								}
							boolean yenCheck = true;
							if(!palavra.equalsIgnoreCase("yen")) {
								yenCheck = true;
								}else {
								yenCheck = false;
								}
							boolean youdleCheck = true;
							if(!palavra.equalsIgnoreCase("youdle")) {
								youdleCheck = true;
								}else { 
								youdleCheck = false;
								}
					/*
					Z
					*/
							boolean zabiniCheck = true;
							if(!palavra.equalsIgnoreCase("zabini")) {
								zabiniCheck = true;
								}else {
								zabiniCheck = false;
								}
							boolean zellerCheck = true;
							if(!palavra.equalsIgnoreCase("zeller")) {
								zellerCheck = true;
								}else {
								zellerCheck = false;
								}
							boolean zamojskiCheck = true;
							if(!palavra.equalsIgnoreCase("zamojski")) {
								zamojskiCheck = true;
								}else {
								zamojskiCheck = false;
								}	

							 int i;
							 	
							 
						     
						        for (i = 0; i < palavra.length(); i++) {
						        char a = palavra.charAt(i);

						        
						        textArea.append("\n" + a);
						        if (alohomoraCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("lohomora");
						        	alohomoraCheck = false;
						        }else if (accioCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("ccio");	
						        	accioCheck = false;
						        }else if (anapneoCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("napneo");	
						        	anapneoCheck = false;
						        }else if (animagoCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("nimago");	
						        	animagoCheck = false;
						        }else if (ascendioCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("scendio");	
						        	ascendioCheck = false;
						        }else if (albusCheck == true && (palavra.charAt(i)) == 'A') {
						        	textArea.append("lbus");	
						        	albusCheck = false;
					//=================================================================================	        	
						        
						        }else if (bellatrixCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("ellatrix");	
						        	bellatrixCheck = false;
						        }else if (bombardaCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("ombarda");	
						        	bombardaCheck = false;
						        }else if (braquiumCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("raquium");	
						        	braquiumCheck = false;
						        }else if (brachiabindoCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("rachiabindo");	
						        	brachiabindoCheck = false;
						        }else if (bublioCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("ublio");	
						        	bublioCheck = false;
						        }else if (bamboeCheck == true && (palavra.charAt(i)) == 'B') {
						        	textArea.append("ambo�");	
						        	bamboeCheck = false;
						        	
					//================================================================================	        	
						        	
						        
						        }else if(crucioCheck == true &&(palavra.charAt(i)) == 'C'){
						        	textArea.append("rucio");
						        	crucioCheck = false;
						        }else if (clypeusCheck == true &&(palavra.charAt(i)) == 'C') {
						        	textArea.append("lypeus");	
						        	clypeusCheck = false;
						        }else if (caveCheck == true && (palavra.charAt(i)) == 'C') {
						        	textArea.append("ave");	
						        	caveCheck = false;
						        }else if (confringoCheck == true && (palavra.charAt(i)) == 'C') {
						        	textArea.append("onfringo");	
						        	confringoCheck = false;
						        }else if (confundusCheck == true && (palavra.charAt(i)) == 'C') {
						        	textArea.append("onfundus");	
						        	confundusCheck = false;
						        }else if (confractusCheck == true && (palavra.charAt(i)) == 'C') {
						        	textArea.append("onfractus");	
						        	confractusCheck = false;
						        	
					//================================================================================	        
						        
						        }else if (draconiforsCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("raconifors");	
						        	draconiforsCheck = false;
						        }else if (dragaoCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("rag�o");	
						        	dragaoCheck = false;
						        }else if (diabreteCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("iabrete");	
						        	diabreteCheck = false;
						        }else if (dukliforsCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("uklifors");	
						        	dukliforsCheck = false;
						        }else if (diffindoCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("iffindo");	
						        	diffindoCheck = false;
						        }else if (deletriusCheck == true && (palavra.charAt(i)) == 'D') {
						        	textArea.append("eletrius");	
						        	deletriusCheck = false;
							    
					//================================================================================		       
							        
							        }else if (episkeyCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("piskey");	
							        	episkeyCheck = false;
							        }else if (expectoCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("xpecto");	
							        	expectoCheck = false;
							        }else if (expelliarmusCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("xpelliarmus");	
							        	expelliarmusCheck = false;
							        }else if (estupefacaCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("stupefa�a");	
							        	estupefacaCheck = false;
							        }else if (estuporeCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("stupore");	
							        	estuporeCheck = false;
							        }else if (evanescoCheck == true && (palavra.charAt(i)) == 'E') {
							        	textArea.append("vanesco");	
							        	evanescoCheck = false;
					//================================================================================	
								        
								        }else if (flipendoCheck == true && (palavra.charAt(i)) == 'F') {
								        	textArea.append("lipendo");	
								        	flipendoCheck = false;
								        }else if (finiteCheck == true && (palavra.charAt(i)) == 'F') {
								        	textArea.append("inite");	
								        	finiteCheck = false;
								        }else if (fideliusCheck == true && (palavra.charAt(i)) == 'F') {
								        	textArea.append("idelius");	
								        	fideliusCheck = false;
								        }else if (ferulaCheck == true && (palavra.charAt(i)) == 'F') {
								        	textArea.append("erula");	
								        	ferulaCheck = false;
								        }else if (finestraCheck == true && (palavra.charAt(i)) == 'F') {
								        	textArea.append("inestra");	
								        	finestraCheck = false;
								        }else if (furnunculusCheck == true && (palavra.charAt(i)) == 'F'){
								        	textArea.append("urnunculus");	
								        	furnunculusCheck = false;
					//================================================================================			    			        
								        }else if (geminioCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("eminio");	
								        	geminioCheck = false;
								        }else if (godricCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("odric");	
								        	godricCheck = false;
								        }else if (guiCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("ui Weasley");	
								        	guiCheck = false;
								        }else if (gryffindorCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("ryffindor");	
								        	gryffindorCheck = false;
								        }else if (glaciusCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("lacius");	
								        	glaciusCheck = false;
								        }else if (glisseoCheck == true && (palavra.charAt(i)) == 'G') {
								        	textArea.append("lisseo");	
								        	glisseoCheck = false;
					//================================================================================	

								        }else if (horcruxCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("orcrux");	
								        	horcruxCheck = false;
								        }else if (harryCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("arry");	
								        	harryCheck = false;
								        }else if (homenumCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("omenum");	
								        	homenumCheck = false;
								        }else if (hypnusCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("ypnus");	
								        	hypnusCheck = false;
								        }else if (herbivicusCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("erbivicus");	
								        	herbivicusCheck = false;
								        }else if (homorfoCheck == true && (palavra.charAt(i)) == 'H') {
								        	textArea.append("omorfo");	
								        	homorfoCheck = false;
							        
					//================================================================================		        

								        }else if (imperiusCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("mperius");	
								        	imperiusCheck = false;
								        }else if (incarcerousCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("ncarcerous");	
								        	incarcerousCheck = false;
								        }else if (incendioCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("ncendio");	
								        	incendioCheck = false;
								        }else if (impedimentaCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("mpedimenta");	
								        	impedimentaCheck = false;
								        }else if (immobilusCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("mmobilus");	
								        	immobilusCheck = false;
								        }else if (imperviusCheck == true && (palavra.charAt(i)) == 'I') {
								        	textArea.append("mpervius");	
								        	imperviusCheck = false;
							        
					//================================================================================	

								        }else if (jamesPotterCheck == true && (palavra.charAt(i)) == 'J') {
								        	textArea.append("ames Potter");	
								        	jamesPotterCheck = false;
								        }else if (jorgeWeasleyCheck == true && (palavra.charAt(i)) == 'J') {
								        	textArea.append("orge Weasley");	
								        	jorgeWeasleyCheck = false;
								        }else if (jamesSiriusCheck == true && (palavra.charAt(i)) == 'J') {
								        	textArea.append("ames Sirius Potter");	
								        	jamesSiriusCheck = false;
							        
					//================================================================================	

								        }else if (kreacherCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("reacher");	
								        	kreacherCheck = false;
								        }else if (karkaroffCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("arkaroff");	
								        	karkaroffCheck = false;
								        }else if (knightbusCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("night-Bus");	
								        	knightbusCheck = false;
								        }else if (kelpieCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("elpie");	
								        	kelpieCheck = false;
								        }else if (krumCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("rum");	
								        	krumCheck = false;
								        }else if (knarlCheck == true && (palavra.charAt(i)) == 'K') {
								        	textArea.append("narl");	
								        	knarlCheck = false;
							        
					//================================================================================	

								        }else if (lumusCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("umus");	
								        	lumusCheck = false;
								        }else if (legilimencyCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("egilimency");	
								        	legilimencyCheck = false;
								        }else if (levicorpusCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("evicorpus");	
								        	levicorpusCheck = false;
								        }else if (locomotorCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("ocomotor");	
								        	locomotorCheck = false;
								        }else if (loremCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("orem");	
								        	loremCheck = false;
								        }else if (laguzCheck == true && (palavra.charAt(i)) == 'L') {
								        	textArea.append("laguz");	
								        	laguzCheck = false;
							        
					//================================================================================	

								        }else if (morsmordreCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("orsmordre");	
								        	morsmordreCheck = false;
								        }else if (mannazCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("annaz");	
								        	mannazCheck = false;
								        }else if (mobilicorpusCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("obilicorpus");	
								        	mobilicorpusCheck = false;
								        }else if (mobiliarbusCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("obiliarbus");	
								        	mobiliarbusCheck = false;
								        }else if (mandrakeCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("andrake");	
								        	mandrakeCheck = false;
								        }else if (maraudersmapCheck == true && (palavra.charAt(i)) == 'M') {
								        	textArea.append("arauder's Map");	
								        	maraudersmapCheck = false;
							        
					//================================================================================	

								        }else if (noxCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("ox");	
								        	noxCheck = false;
								        }else if (nigelCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("igel");	
								        	nigelCheck = false;
								        }else if (narcisaCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("arcisa");	
								        	narcisaCheck = false;
								        }else if (nauthizCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("authiz");	
								        	nauthizCheck = false;
								        }else if (nargleCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("argle");	
								        	nargleCheck = false;
								        }else if (nataliaCheck == true && (palavra.charAt(i)) == 'N') {
								        	textArea.append("atalia McDonald");
								        	nataliaCheck = false;
							        
					//================================================================================	

								        }else if (obliviateCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("bliviate");	
								        	obliviateCheck = false;
								        
								        }else if (orchideousCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("rchideous");	
								        	orchideousCheck = false;
								        }else if (ofidioglotaCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("fidioglota");	
								        	ofidioglotaCheck = false;
								        }else if (ollivandersCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("llivander's");	
								        	ollivandersCheck = false;
								        }else if (odinCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("din");	
								        	odinCheck = false;
								        }else if (othilaCheck == true && (palavra.charAt(i)) == 'O') {
								        	textArea.append("thila");	
								        	othilaCheck = false;
							        
					//================================================================================	

								        }else if (petrificusCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("etrificus");	
								        	petrificusCheck = false;
								        }else if (patronoCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("atrono");	
								        	patronoCheck = false;
								        }else if (pericullumCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("ericullum");	
								        	pericullumCheck = false;
								        }else if (peterCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("eter Pettigrew");
								        	peterCheck = false;
								        }else if (petuniaCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("etunia");	
								        	petuniaCheck = false;
								        }else if (perhtCheck == true && (palavra.charAt(i)) == 'P') {
								        	textArea.append("erht");	
								        	perhtCheck = false;
					        
					//================================================================================

								        }else if (quadribolCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uadribol");	
								        	quadribolCheck = false;
								        }else if (quidditchCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uidditch");	
								        	quidditchCheck = false;
								        }else if (quietusCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uietus");	
								        	quietusCheck = false;
								        }else if (quintipedeCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uintipede");	
								        	quintipedeCheck = false;
								        }else if (quirrelCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uirrel");	
								        	quirrelCheck = false;
								        }else if (quirkeCheck == true && (palavra.charAt(i)) == 'Q') {
								        	textArea.append("uirke");	
								        	quirkeCheck = false;
					        
					//================================================================================	

								        }else if (riddikulusCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("iddikulus");	
								        	riddikulusCheck = false;
								        }else if (riddleCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("iddle");	
								        	riddleCheck = false;
								        }else if (revelioCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("evelio");	
								        	revelioCheck = false;
								        }else if (reductoCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("educto");	
								        	reductoCheck = false;
								        }else if (raidoCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("aido");	
								        	raidoCheck = false;
								        }else if (ravenclawCheck == true && (palavra.charAt(i)) == 'R') {
								        	textArea.append("avenclaw");	
								        	ravenclawCheck = false;
					        
					//================================================================================	

								        }else if (sectumsempraCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("ectumsempra");	
								        	sectumsempraCheck = false;
								        }else if (salvioCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("alvio");	
								        	salvioCheck = false;
								        }else if (serpensortiaCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("erpensortia");	
								        	serpensortiaCheck = false;
								        }else if (slytherinCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("lytherin");	
								        	slytherinCheck = false;
								        }else if (soweluCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("owelu");	
								        	soweluCheck = false;
								        }else if (sinistroCheck == true && (palavra.charAt(i)) == 'S') {
								        	textArea.append("inistro");	
								        	sinistroCheck = false;
					        
					//================================================================================	

								        }else if (transfiguracaoCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("ransfiguracao");
								        	transfiguracaoCheck = false;
								        }else if (trasgoCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("rasgo");	
								        	trasgoCheck = false;
								        }else if (travessaCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("ravessa do Tranco");	
								        	travessaCheck = false;
								        }else if (tratoDCMCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("rato das Criaturas Magicas");
								        	tratoDCMCheck = false;
								        }else if (thomasCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("homas");	
								        	thomasCheck = false;
								        }else if (toothillCheck == true && (palavra.charAt(i)) == 'T') {
								        	textArea.append("oothill");	
								        	toothillCheck = false;
					        
					//================================================================================	

								        }else if (umfravilleCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("mfraville");	
								        	umfravilleCheck = false;
								        }else if (uruzCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("ruz");	
								        	uruzCheck = false;
								        }else if (unicornioCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("nic�rnio");	
								        	unicornioCheck = false;
								        }else if (uediuosiCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("ediuosi");
								        	uediuosiCheck = false;
								        }else if (umbridgeCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("mbridge");	
								        	umbridgeCheck = false;
								        }else if (umgubularCheck == true && (palavra.charAt(i)) == 'U') {
								        	textArea.append("mgubular");	
								        	umgubularCheck = false;
					        
					//================================================================================	

								        }else if (veravertoCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("era-Verto");	
								        	veravertoCheck = false;
								        }else if (vulneraCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("ulnera");	
								        	vulneraCheck = false;
								        }else if (visgoCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("isgo");	
								        	visgoCheck = false;
								        }else if (venomoustentaculaCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("enomous-Tentacula");	
								        	venomoustentaculaCheck = false;
								        }else if (veelaCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("eela");	
								        	veelaCheck = false;
								        }else if (vagemCheck == true && (palavra.charAt(i)) == 'V') {
								        	textArea.append("agem");	
								        	vagemCheck = false;
					        
					//================================================================================	

								        }else if (wizengamotCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("izengamot");	
								        	wizengamotCheck = false;
								        }else if (wingardiumCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("ingardium");	
								        	wingardiumCheck = false;
								        }else if (weasleyCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("easley");	
								        	weasleyCheck = false;
								        }else if (wandCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("and");	
								        	wandCheck = false;
								        }else if (wunjoCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("unjo");	
								        	wunjoCheck = false;
								        }else if (wilkesCheck == true && (palavra.charAt(i)) == 'W') {
								        	textArea.append("ilkes");	
								        	wilkesCheck = false;
					        
					//================================================================================	

								        }else if (xenophiliusCheck == true && (palavra.charAt(i)) == 'X') {
								        	textArea.append("enophilius");	
								        	xenophiliusCheck = false;
								        }else if (xaropeCheck == true && (palavra.charAt(i)) == 'X') {
								        	textArea.append("arope");	
								        	xaropeCheck = false;
					        
					//================================================================================	

								        }else if (yaxleyCheck == true && (palavra.charAt(i)) == 'Y') {
								        	textArea.append("axley");	
								        	yaxleyCheck = false;
								        }else if (youdleCheck == true && (palavra.charAt(i)) == 'Y') {
								        	textArea.append("oudle");	
								        	youdleCheck = false;
								        }else if (yetiCheck == true && (palavra.charAt(i)) == 'Y') {
								        	textArea.append("eti");	
								        	yetiCheck = false;
								        }else if (yenCheck == true && (palavra.charAt(i)) == 'Y') {
								        	textArea.append("en");	
								        	yenCheck = false;
					        
					//================================================================================	

								        }else if (zabiniCheck == true && (palavra.charAt(i)) == 'Z') {
								        	textArea.append("abini");	
								        	zabiniCheck = false;
								        }else if (zellerCheck == true && (palavra.charAt(i)) == 'Z') {
								        	textArea.append("eller");	
								        	zellerCheck = false;
								        }else if (zamojskiCheck == true && (palavra.charAt(i)) == 'Z') {
								        	textArea.append("amojski");	
								        	zamojskiCheck = false;

						}
			        }
						        textArea.append("\n");
						        textArea.append("\n");
						        textArea.append("===========================");
						        textArea.append("\n");
						        textArea.append("\n");
				}	
			}
		});
		textField.setColumns(10);
		textField.setBounds(10, 51, 414, 28);
		contentPane.add(textField);
		
		JLabel lblAcrostico = new JLabel("ACROSTICO");
		lblAcrostico.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcrostico.setForeground(Color.WHITE);
		lblAcrostico.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblAcrostico.setBounds(10, 11, 414, 29);
		contentPane.add(lblAcrostico);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				Acrostico.this.dispose();
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
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				palavra = palavra.replaceAll("�", "a");
				
				palavra = palavra.replaceAll("�", "c");
				
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				palavra = palavra.replaceAll("�", "e");
				
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				palavra = palavra.replaceAll("�", "i");
				
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				palavra = palavra.replaceAll("�", "o");
				
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
			
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.replaceAll("�", "u");
				palavra = palavra.toUpperCase();
				/*		
				A
				*/	
						boolean alohomoraCheck;
						if(!palavra.equalsIgnoreCase("alohomora")) {
							alohomoraCheck = true;
							}else {
							alohomoraCheck = false;
							}
						boolean accioCheck = true;
						if(!palavra.equalsIgnoreCase("accio")) {
							accioCheck = true;
							}else {
							accioCheck = false;
							}
						boolean albusCheck = true;
						if(!palavra.equalsIgnoreCase("albus")) {
							albusCheck = true;
							}else {
							albusCheck = false;
							}
						boolean anapneoCheck = true;
						if(!palavra.equalsIgnoreCase("anapneo")) {
							anapneoCheck = true;
							}else {
							anapneoCheck = false;
							}
						boolean animagoCheck = true;
						if(!palavra.equalsIgnoreCase("animago")) {
							animagoCheck = true;
							}else {
							animagoCheck = false;
							}
						boolean ascendioCheck = true;
						if(!palavra.equalsIgnoreCase("ascendio")) {
							ascendioCheck = true;
							}else {
							ascendioCheck = false;
							}
				/*
				B 
				*/
						boolean bombardaCheck = true;
						if(!palavra.equalsIgnoreCase("bombarda")) {
							bombardaCheck = true;
							}else {
							bombardaCheck = false;
							}
						boolean braquiumCheck = true;
						if(!palavra.equalsIgnoreCase("braquium")) {
							braquiumCheck = true;
							}else {
							braquiumCheck = false;
							}
						boolean brachiabindoCheck = true;
						if(!palavra.equalsIgnoreCase("brachiabindo")) {
							brachiabindoCheck = true;
							}else {
							brachiabindoCheck = false;
							}
						boolean bublioCheck = true;
						if(!palavra.equalsIgnoreCase("bublio")) {
							bublioCheck = true;
							}else {
							bublioCheck = false;
							}
						boolean bamboeCheck = true;
						if(!palavra.equalsIgnoreCase("bamboe")) {
							bamboeCheck = true;
							}else {
							bamboeCheck = false;
							}
						boolean bellatrixCheck = true;
						if(!palavra.equalsIgnoreCase("bellatrix")) {
							bellatrixCheck = true;
							}else {
							bellatrixCheck = false;
							}
				/*
				C
				*/
						boolean caveCheck = true;
						if(!palavra.equalsIgnoreCase("cave")) {
							caveCheck = true;
							}else {
							caveCheck = false;
							}
						boolean crucioCheck = true;
						if(!palavra.equalsIgnoreCase("crucio")) {
							crucioCheck = true;
							}else {
							crucioCheck = false;
							}
						boolean clypeusCheck = true;
						if(!palavra.equalsIgnoreCase("clypeus")) {
							clypeusCheck = true;
							}else {
							clypeusCheck = false;
							}
						boolean confringoCheck = true;
						if(!palavra.equalsIgnoreCase("confringo")) {
							confringoCheck = true;
							}else {
							confringoCheck = false;
							}
						boolean confundusCheck = true;
						if(!palavra.equalsIgnoreCase("confundus")) {
							confundusCheck = true;
							}else {
							confundusCheck = false;
							}
						boolean confractusCheck = true;
						if(!palavra.equalsIgnoreCase("confractus")) {
							confractusCheck = true;
							}else {
							confractusCheck = false;
							}
				/*
				D
				*/
						boolean draconiforsCheck = true;
						if(!palavra.equalsIgnoreCase("draconifors")) {
							draconiforsCheck = true;
							}else {
							draconiforsCheck = false;
							}
						boolean diffindoCheck = true;
						if(!palavra.equalsIgnoreCase("diffindo")) {
							diffindoCheck = true;
							}else {
							diffindoCheck = false;
							}
						boolean dukliforsCheck = true;
						if(!palavra.equalsIgnoreCase("duklifors")) {
							dukliforsCheck = true;
							}else {
							dukliforsCheck = false;
							}
						boolean deletriusCheck = true;
						if(!palavra.equalsIgnoreCase("deletrius")) {
							deletriusCheck = true;
							}else {
							deletriusCheck = false;
							}
						boolean dragaoCheck = true;
						if(!palavra.equalsIgnoreCase("dragao")) {
							dragaoCheck = true;
							}else {
							dragaoCheck = false;
							}
						boolean diabreteCheck = true;
						if(!palavra.equalsIgnoreCase("diabrete")) {
							diabreteCheck = true;
							}else {
							diabreteCheck = false;
							}
				/*
				E
				*/
						boolean episkeyCheck = true;
						if(!palavra.equalsIgnoreCase("episkey")) {
							episkeyCheck = true;
							}else {
							episkeyCheck = false;
							}
						boolean expectoCheck = true;
						if(!palavra.equalsIgnoreCase("expecto")) {
							expectoCheck = true;
							}else {
							expectoCheck = false;
							}
						boolean expelliarmusCheck = true;
						if(!palavra.equalsIgnoreCase("expelliarmus")) {
							expelliarmusCheck = true;
							}else {
							expelliarmusCheck = false;
							}
						boolean estupefacaCheck = true;
						if(!palavra.equalsIgnoreCase("estupefaca")) {
							estupefacaCheck = true;
							}else {
							estupefacaCheck = false;
							}
						boolean estuporeCheck = true;
						if(!palavra.equalsIgnoreCase("estupore")) {
							estuporeCheck = true;
							}else {
							estuporeCheck = false;
							}
						boolean evanescoCheck = true;
						if(!palavra.equalsIgnoreCase("evanesco")) {
							evanescoCheck = true;
							}else {
							evanescoCheck = false;
							}
				/*
				F
				*/
						boolean flipendoCheck = true;
						if(!palavra.equalsIgnoreCase("flipendo")) {
							flipendoCheck = true;
							}else {
							flipendoCheck = false;
							}
						boolean finiteCheck = true;
						if(!palavra.equalsIgnoreCase("finite")) {
							finiteCheck = true;
							}else {
							finiteCheck = false;
							}
						boolean finestraCheck = true;
						if(!palavra.equalsIgnoreCase("finestra")) {
							finestraCheck = true;
							}else {
							finestraCheck = false;
							}
						boolean ferulaCheck = true;
						if(!palavra.equalsIgnoreCase("ferula")) {
							ferulaCheck = true;
							}else {
							ferulaCheck = false;
							}
						boolean fideliusCheck = true;
						if(!palavra.equalsIgnoreCase("fidelius")) {
							fideliusCheck = true;
							}else {
							fideliusCheck = false;
							}
						boolean furnunculusCheck = true;
						if(!palavra.equalsIgnoreCase("furnunculus")) {
							furnunculusCheck = true;
							}else {
							furnunculusCheck = false;
							}
				/*
				G
				*/
						boolean geminioCheck = true;
						if(!palavra.equalsIgnoreCase("geminio")) {
							geminioCheck = true;
							}else {
							geminioCheck = false;
							}
						boolean godricCheck = true;
						if(!palavra.equalsIgnoreCase("godric")) {
							godricCheck = true;
							}else {
							godricCheck = false;
							}
						boolean guiCheck = true;
						if(!palavra.equalsIgnoreCase("gui")) {
							guiCheck = true;
							}else {
							guiCheck = false;
							}
						boolean gryffindorCheck = true;
						if(!palavra.equalsIgnoreCase("gryffindor")) {
							gryffindorCheck = true;
							}else {
							gryffindorCheck = false;
							}
						boolean glaciusCheck = true;
						if(!palavra.equalsIgnoreCase("glacius")) {
							glaciusCheck = true;
							}else {
							glaciusCheck = false;
							}
						boolean glisseoCheck = true;
						if(!palavra.equalsIgnoreCase("glisseo")) {
							glisseoCheck = true;
							}else {
							glisseoCheck = false;
							}
				/*
				H
				*/
						boolean horcruxCheck = true;
						if(!palavra.equalsIgnoreCase("horcrux")) {
							horcruxCheck = true;
							}else {
							horcruxCheck = false;
							}
						boolean harryCheck = true;
						if(!palavra.equalsIgnoreCase("harry")) {
							harryCheck = true;
							}else {
							harryCheck = false;
							}
						boolean homenumCheck = true;
						if(!palavra.equalsIgnoreCase("homenum")) {
							homenumCheck = true;
							}else {
							homenumCheck = false;
							}
						boolean hypnusCheck = true;
						if(!palavra.equalsIgnoreCase("hypnus")) {
							hypnusCheck = true;
							}else {
							hypnusCheck = false;
							}
						boolean herbivicusCheck = true;
						if(!palavra.equalsIgnoreCase("herbivicus")) {
							herbivicusCheck = true;
							}else {
							herbivicusCheck = false;
							}
						boolean homorfoCheck = true;
						if(!palavra.equalsIgnoreCase("homorfo")) {
							homorfoCheck = true;
							}else {
							homorfoCheck = false;
							}
				/*
				I
				*/
						boolean imperiusCheck = true;
						if(!palavra.equalsIgnoreCase("imperius")) {
							imperiusCheck = true;
							}else {
							imperiusCheck = false;
							}
						boolean incarcerousCheck = true;
						if(!palavra.equalsIgnoreCase("incarcerous")) {
							incarcerousCheck = true;
							}else {
							incarcerousCheck = false;
							}
						boolean incendioCheck = true;
						if(!palavra.equalsIgnoreCase("incendio")) {
							incendioCheck = true;
							}else {
							incendioCheck = false;
							}
						boolean impedimentaCheck = true;
						if(!palavra.equalsIgnoreCase("impedimenta")) {
							impedimentaCheck = true;
							}else {
							impedimentaCheck = false;
							}
						boolean immobilusCheck = true;
						if(!palavra.equalsIgnoreCase("immobilus")) {
							immobilusCheck = true;
							}else {
							immobilusCheck = false;
							}
						boolean imperviusCheck = true;
						if(!palavra.equalsIgnoreCase("impervius")) {
							imperviusCheck = true;
							}else {
							imperviusCheck = false;
							}
				/*
				J
				*/
						boolean jamesPotterCheck = true;
						if(!palavra.equalsIgnoreCase("james")) {
							jamesPotterCheck = true;
							}else {
							jamesPotterCheck = false;
							}
						boolean jorgeWeasleyCheck = true;
						if(!palavra.equalsIgnoreCase("jorge weasley")) {
							jorgeWeasleyCheck = true;
							}else {
							jorgeWeasleyCheck = false;
							}
						boolean jamesSiriusCheck = true;
						if(!palavra.equalsIgnoreCase("james")) {
							jamesSiriusCheck = true;
							}else {
							jamesSiriusCheck = false;
							}
				/*
				K
				*/
						boolean kreacherCheck = true;
						if(!palavra.equalsIgnoreCase("kreacher")) {
							kreacherCheck = true;
							}else {
							kreacherCheck = false;
							}
						boolean karkaroffCheck = true;
						if(!palavra.equalsIgnoreCase("karkaroff")) {
							karkaroffCheck = true;
							}else {
							karkaroffCheck = false;
							}
						boolean krumCheck = true;
						if(!palavra.equalsIgnoreCase("krum")) {
							krumCheck = true;
							}else {
							krumCheck = false;
							}
						boolean kelpieCheck = true;
						if(!palavra.equalsIgnoreCase("kelpie")) {
							kelpieCheck = true;
							}else {
							kelpieCheck = false;
							}
						boolean knightbusCheck = true;
						if(!palavra.equalsIgnoreCase("knight bus")) {
							knightbusCheck = true;
							}else {
							knightbusCheck = false;
							}
						boolean knarlCheck = true;
						if(!palavra.equalsIgnoreCase("knarl")) {
							knarlCheck = true;
							}else {
							knarlCheck = false;
							}

				/*
				L
				*/
						boolean lumusCheck = true;
						if(!palavra.equalsIgnoreCase("lumus")) {
							lumusCheck = true;
							}else {
							lumusCheck = false;
							}
						boolean legilimencyCheck = true;
						if(!palavra.equalsIgnoreCase("legilimency")) {
							legilimencyCheck = true;
							}else {
							legilimencyCheck = false;
							}
						boolean levicorpusCheck = true;
						if(!palavra.equalsIgnoreCase("levicorpus")) {
							levicorpusCheck = true;
							}else {
							levicorpusCheck = false;
							}
						boolean locomotorCheck = true;
						if(!palavra.equalsIgnoreCase("locomotor")) {
							locomotorCheck = true;
							}else {
							locomotorCheck = false;
							}
						boolean loremCheck = true;
						if(!palavra.equalsIgnoreCase("lorem")) {
							loremCheck = true;
							}else {
							loremCheck = false;
							}
						boolean laguzCheck = true;
						if(!palavra.equalsIgnoreCase("laguz")) {
							laguzCheck = true;
							}else {
							laguzCheck = false;
							}
				/*
				M
				*/
						boolean morsmordreCheck = true;
						if(!palavra.equalsIgnoreCase("morsmordre")) {
							morsmordreCheck = true;
							}else {
							morsmordreCheck = false;
							}
						boolean mannazCheck = true;
						if(!palavra.equalsIgnoreCase("mannaz")) {
							mannazCheck = true;
							}else {
							mannazCheck = false;
							}
						boolean mobilicorpusCheck = true;
						if(!palavra.equalsIgnoreCase("mobilicorpus")) {
							mobilicorpusCheck = true;
							}else {
							mobilicorpusCheck = false;
							}
						boolean mobiliarbusCheck = true;
						if(!palavra.equalsIgnoreCase("mobiliarbus")) {
							mobiliarbusCheck = true;
							}else {
							mobiliarbusCheck = false;
							}
						boolean mandrakeCheck = true;
						if(!palavra.equalsIgnoreCase("mandrake")) {
							mandrakeCheck = true;
							}else {
							mandrakeCheck = false;
							}
						boolean maraudersmapCheck = true;
						if(!palavra.equalsIgnoreCase("marauder's map")) {
							maraudersmapCheck = true;
							}else {
							maraudersmapCheck = false;
							}
				/*
				N
				*/
						boolean noxCheck = true;
						if(!palavra.equalsIgnoreCase("nox")) {
							noxCheck = true;
							}else {
							noxCheck = false;
							}
						boolean nauthizCheck = true;
						if(!palavra.equalsIgnoreCase("nauthiz")) {
							nauthizCheck = true;
							}else {
							nauthizCheck = false;
							}
						boolean nargleCheck = true;
						if(!palavra.equalsIgnoreCase("nargle")) {
							nargleCheck = true;
							}else {
							nargleCheck = false;
							}
						boolean narcisaCheck = true;
						if(!palavra.equalsIgnoreCase("narcisa")) {
							narcisaCheck = true;
							}else {
							narcisaCheck = false;
							}
						boolean nataliaCheck = true;
						if(!palavra.equalsIgnoreCase("natalia")) {
							nataliaCheck = true;
							}else {
							nataliaCheck = false;
							}
						boolean nigelCheck = true;
						if(!palavra.equalsIgnoreCase("nigel")) {
							nigelCheck = true;
							}else {
							nigelCheck = false;
							}

				/*
				O
				*/
						boolean obliviateCheck = true;
						if(!palavra.equalsIgnoreCase("obliviate")) {
							obliviateCheck = true;
							}else {
							obliviateCheck = false;
							}
						boolean orchideousCheck = true;
						if(!palavra.equalsIgnoreCase("orchideous")) {
							orchideousCheck = true;
							}else {
							orchideousCheck = false;
							}
						boolean ofidioglotaCheck = true;
						if(!palavra.equalsIgnoreCase("oficioglota")) {
							ofidioglotaCheck = true;
							}else {
							ofidioglotaCheck = false;
							}
						boolean ollivandersCheck = true;
						if(!palavra.equalsIgnoreCase("ollivander's")) {
							ollivandersCheck = true;
							}else {
							ollivandersCheck = false;
							}
						boolean odinCheck = true;
						if(!palavra.equalsIgnoreCase("odin")) {
							odinCheck = true;
							}else {
							odinCheck = false;
							}
						boolean othilaCheck = true;
						if(!palavra.equalsIgnoreCase("othila")) {
							othilaCheck = true;
							}else {
							othilaCheck = false;
							}

				/*
				P
				*/
						boolean perhtCheck = true;
						if(!palavra.equalsIgnoreCase("perht")) {
							perhtCheck = true;
							}else {
							perhtCheck = false;
							}
						boolean petrificusCheck = true;
						if(!palavra.equalsIgnoreCase("petrificus")) {
							petrificusCheck = true;
							}else {
							petrificusCheck = false;
							}
						boolean petuniaCheck = true;
						if(!palavra.equalsIgnoreCase("petunia")) {
							petuniaCheck = true;
							}else {
							petuniaCheck = false;
							}
						boolean pericullumCheck = true;
						if(!palavra.equalsIgnoreCase("pericullum")) {
							pericullumCheck = true;
							}else {
							pericullumCheck = false;
							}
						boolean peterCheck = true;
						if(!palavra.equalsIgnoreCase("peter")) {
							peterCheck = true;
							}else {
							peterCheck = false;
							}
						boolean patronoCheck = true;
						if(!palavra.equalsIgnoreCase("patrono")) {
							patronoCheck = true;
							}else {
							patronoCheck = false;
							}
				/*
				Q
				*/
						boolean quadribolCheck = true;
						if(!palavra.equalsIgnoreCase("quadribol")) {
							quadribolCheck = true;
							}else {
							quadribolCheck = false;
							}
						boolean quidditchCheck = true;
						if(!palavra.equalsIgnoreCase("quidditch")) {
							quidditchCheck = true;
							}else {
							quidditchCheck = false;
							}
						boolean quietusCheck = true;
						if(!palavra.equalsIgnoreCase("quietus")) {
							quietusCheck = true;
							}else {
							quietusCheck = false;
							}
						boolean quintipedeCheck = true;
						if(!palavra.equalsIgnoreCase("quintipede")) {
							quintipedeCheck = true;
							}else {
							quintipedeCheck = false;
							}
						boolean quirrelCheck = true;
						if(!palavra.equalsIgnoreCase("quirrel")) {
							quirrelCheck = true;
							}else {
							quirrelCheck = false;
							}
						boolean quirkeCheck = true;
						if(!palavra.equalsIgnoreCase("quirke")) {
							quirkeCheck = true;
							}else {
							quirkeCheck = false;
							}
				/*
				R
				*/
						boolean riddleCheck = true;
						if(!palavra.equalsIgnoreCase("riddle")) {
							riddleCheck = true;
							}else {
							riddleCheck = false;
							}
						boolean ravenclawCheck = true;
						if(!palavra.equalsIgnoreCase("ravenclaw")) {
							ravenclawCheck = true;
							}else {
							ravenclawCheck = false;
							}
						boolean raidoCheck = true;
						if(!palavra.equalsIgnoreCase("raido")) {
							raidoCheck = true;
							}else {
							raidoCheck = false;
							}
						boolean reductoCheck = true;
						if(!palavra.equalsIgnoreCase("reducto")) {
							reductoCheck = true;
							}else {
							reductoCheck = false;
							}
						boolean revelioCheck = true;
						if(!palavra.equalsIgnoreCase("revelio")) {
							revelioCheck = true;
							}else {
							revelioCheck = false;
							}
						boolean riddikulusCheck = true;
						if(!palavra.equalsIgnoreCase("riddikulus")) {
							riddikulusCheck = true;
							}else {
							riddikulusCheck = false;
							}
				/*
				S
				*/
						boolean sectumsempraCheck = true;
						if(!palavra.equalsIgnoreCase("sectumsempra")) {
							sectumsempraCheck = true;
							}else {
							sectumsempraCheck = false;
							}
						boolean salvioCheck = true;
						if(!palavra.equalsIgnoreCase("salvio")) {
							salvioCheck = true;
							}else {
							salvioCheck = false;
							}
						boolean serpensortiaCheck = true;
						if(!palavra.equalsIgnoreCase("serpensortia")) {
							serpensortiaCheck = true;
							}else {
							serpensortiaCheck = false;
							}
						boolean soweluCheck = true;
						if(!palavra.equalsIgnoreCase("sowelu")) {
							soweluCheck = true;
							}else {
							soweluCheck = false;
							}
						boolean sinistroCheck = true;
						if(!palavra.equalsIgnoreCase("sinistro")) {
							sinistroCheck = true;
							}else {
							sinistroCheck = false;
							}
						boolean slytherinCheck = true;
						if(!palavra.equalsIgnoreCase("slytherin")) {
							slytherinCheck = true;
							}else {
							slytherinCheck = false;
							}
				/*
				T
				*/
						boolean transfiguracaoCheck = true;
						if(!palavra.equalsIgnoreCase("transfiguracao")) {
							transfiguracaoCheck = true;
							}else {
							transfiguracaoCheck = false;
							}
						boolean trasgoCheck = true;
						if(!palavra.equalsIgnoreCase("trasgo")) {
							trasgoCheck = true;
							}else {
							trasgoCheck = false;
							}
						boolean travessaCheck = true;
						if(!palavra.equalsIgnoreCase("travessa")) {
							travessaCheck = true;
							}else {
							travessaCheck = false;
							}
						boolean tratoDCMCheck = true;
						if(!palavra.equalsIgnoreCase("trato das criaturas m�gicas")) {
							tratoDCMCheck = true;
							}else {
							tratoDCMCheck = false;
							}
						boolean thomasCheck = true;
						if(!palavra.equalsIgnoreCase("thomas")) {
							thomasCheck = true;
							}else {
							thomasCheck = false;
							}
						boolean toothillCheck = true;
						if(!palavra.equalsIgnoreCase("toothill")) {
							toothillCheck = true;
							}else {
							toothillCheck = false;
							}
				/*
				U
				*/
						boolean umbridgeCheck = true;
						if(!palavra.equalsIgnoreCase("umbrigde")) {
							umbridgeCheck = true;
							}else {
							umbridgeCheck = false;
							}
						boolean uruzCheck = true;
						if(!palavra.equalsIgnoreCase("uruz")) {
							uruzCheck = true;
							}else {
							uruzCheck = false;
							}
						boolean unicornioCheck = true;
						if(!palavra.equalsIgnoreCase("unicornio")) {
							unicornioCheck = true;
							}else {
							unicornioCheck = false;
							}
						boolean uediuosiCheck = true;
						if(!palavra.equalsIgnoreCase("uediuosi")) {
							uediuosiCheck = true;
							}else {
							uediuosiCheck = false;
							}
						boolean umfravilleCheck = true;
						if(!palavra.equalsIgnoreCase("umfraville")) {
							umfravilleCheck = true;
							}else {
							umfravilleCheck = false;
							}
						boolean umgubularCheck = true;
						if(!palavra.equalsIgnoreCase("umgubular")) {
							umgubularCheck = true;
							}else {
							umgubularCheck = false;
							}
				/*
				V
				*/
						boolean vagemCheck = true;
						if(!palavra.equalsIgnoreCase("vagem")) {
							vagemCheck = true;
							}else {
							vagemCheck = false;
							}
						boolean veravertoCheck = true;
						if(!palavra.equalsIgnoreCase("vera verto")) {
							veravertoCheck = true;
							}else {
							veravertoCheck = false;
							}
						boolean vulneraCheck = true;
						if(!palavra.equalsIgnoreCase("vulnera")) {
							vulneraCheck = true;
							}else {
							vulneraCheck = false;
							}
						boolean veelaCheck = true;
						if(!palavra.equalsIgnoreCase("veela")) {
							veelaCheck = true;
							}else {
							veelaCheck = false;
							}
						boolean venomoustentaculaCheck = true;
						if(!palavra.equalsIgnoreCase("venomous tentacula")) {
							venomoustentaculaCheck = true;
							}else {
							venomoustentaculaCheck = false;
							}
						boolean visgoCheck = true;
						if(!palavra.equalsIgnoreCase("visgo")) {
							visgoCheck = true;
							}else {
							visgoCheck = false;
							}
				/*
				W
				*/
						boolean wingardiumCheck = true;
						if(!palavra.equalsIgnoreCase("wingardium")) {
							wingardiumCheck = true;
							}else {
							wingardiumCheck = false;
							}
						boolean wandCheck = true;
						if(!palavra.equalsIgnoreCase("wand")) {
							wandCheck = true;
							}else {
							wandCheck = false;
							}
						boolean weasleyCheck = true;
						if(!palavra.equalsIgnoreCase("weasley")) {
							weasleyCheck = true;
							}else {
							weasleyCheck = false;
							}
						boolean wizengamotCheck = true;
						if(!palavra.equalsIgnoreCase("wizengamot")) {
							wizengamotCheck = true;
							}else {
							wizengamotCheck = false;
							}
						boolean wunjoCheck = true;
						if(!palavra.equalsIgnoreCase("wunjo")) {
							wunjoCheck = true;
							}else {
							wunjoCheck = false;
							}
						boolean wilkesCheck = true;
						if(!palavra.equalsIgnoreCase("wilkes")) {
							wilkesCheck = true;
							}else {
							wilkesCheck = false;
							}
				/*
				X
				*/
						boolean xenophiliusCheck = true;
						if(!palavra.equalsIgnoreCase("xenophilius")) {
							xenophiliusCheck = true;
							}else {
							xenophiliusCheck = false;
							}
						boolean xaropeCheck = true;
						if(!palavra.equalsIgnoreCase("xarope")) {
							xaropeCheck = true;
							}else {
							xaropeCheck = false;
							}
				/*
				Y
				*/
						boolean yaxleyCheck = true;
						if(!palavra.equalsIgnoreCase("yaxley")) {
							yaxleyCheck = true;
							}else {
							yaxleyCheck = false;
							}
						boolean yetiCheck = true;
						if(!palavra.equalsIgnoreCase("yeti")) {
							yetiCheck = true;
							}else {
							yetiCheck = false;
							}
						boolean yenCheck = true;
						if(!palavra.equalsIgnoreCase("yen")) {
							yenCheck = true;
							}else {
							yenCheck = false;
							}
						boolean youdleCheck = true;
						if(!palavra.equalsIgnoreCase("youdle")) {
							youdleCheck = true;
							}else { 
							youdleCheck = false;
							}
				/*
				Z
				*/
						boolean zabiniCheck = true;
						if(!palavra.equalsIgnoreCase("zabini")) {
							zabiniCheck = true;
							}else {
							zabiniCheck = false;
							}
						boolean zellerCheck = true;
						if(!palavra.equalsIgnoreCase("zeller")) {
							zellerCheck = true;
							}else {
							zellerCheck = false;
							}
						boolean zamojskiCheck = true;
						if(!palavra.equalsIgnoreCase("zamojski")) {
							zamojskiCheck = true;
							}else {
							zamojskiCheck = false;
							}	

						 int i;
						 	
						 
					     
					        for (i = 0; i < palavra.length(); i++) {
					        char a = palavra.charAt(i);

					        
					        textArea.append("\n" + a);
					        if (alohomoraCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("lohomora");
					        	alohomoraCheck = false;
					        }else if (accioCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("ccio");	
					        	accioCheck = false;
					        }else if (anapneoCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("napneo");	
					        	anapneoCheck = false;
					        }else if (animagoCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("nimago");	
					        	animagoCheck = false;
					        }else if (ascendioCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("scendio");	
					        	ascendioCheck = false;
					        }else if (albusCheck == true && (palavra.charAt(i)) == 'A') {
					        	textArea.append("lbus");	
					        	albusCheck = false;
				//=================================================================================	        	
					        
					        }else if (bellatrixCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("ellatrix");	
					        	bellatrixCheck = false;
					        }else if (bombardaCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("ombarda");	
					        	bombardaCheck = false;
					        }else if (braquiumCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("raquium");	
					        	braquiumCheck = false;
					        }else if (brachiabindoCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("rachiabindo");	
					        	brachiabindoCheck = false;
					        }else if (bublioCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("ublio");	
					        	bublioCheck = false;
					        }else if (bamboeCheck == true && (palavra.charAt(i)) == 'B') {
					        	textArea.append("amboe");
					        	bamboeCheck = false;
					        	
				//================================================================================	        	
					        	
					        
					        }else if(crucioCheck == true &&(palavra.charAt(i)) == 'C'){
					        	textArea.append("rucio");
					        	crucioCheck = false;
					        }else if (clypeusCheck == true &&(palavra.charAt(i)) == 'C') {
					        	textArea.append("lypeus");	
					        	clypeusCheck = false;
					        }else if (caveCheck == true && (palavra.charAt(i)) == 'C') {
					        	textArea.append("ave");	
					        	caveCheck = false;
					        }else if (confringoCheck == true && (palavra.charAt(i)) == 'C') {
					        	textArea.append("onfringo");	
					        	confringoCheck = false;
					        }else if (confundusCheck == true && (palavra.charAt(i)) == 'C') {
					        	textArea.append("onfundus");	
					        	confundusCheck = false;
					        }else if (confractusCheck == true && (palavra.charAt(i)) == 'C') {
					        	textArea.append("onfractus");	
					        	confractusCheck = false;
					        	
				//================================================================================	        
					        
					        }else if (draconiforsCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("raconifors");	
					        	draconiforsCheck = false;
					        }else if (dragaoCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("ragao");
					        	dragaoCheck = false;
					        }else if (diabreteCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("iabrete");	
					        	diabreteCheck = false;
					        }else if (dukliforsCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("uklifors");	
					        	dukliforsCheck = false;
					        }else if (diffindoCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("iffindo");	
					        	diffindoCheck = false;
					        }else if (deletriusCheck == true && (palavra.charAt(i)) == 'D') {
					        	textArea.append("eletrius");	
					        	deletriusCheck = false;
						    
				//================================================================================		       
						        
						        }else if (episkeyCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("piskey");	
						        	episkeyCheck = false;
						        }else if (expectoCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("xpecto");	
						        	expectoCheck = false;
						        }else if (expelliarmusCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("xpelliarmus");	
						        	expelliarmusCheck = false;
						        }else if (estupefacaCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("stupefa�a");	
						        	estupefacaCheck = false;
						        }else if (estuporeCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("stupore");	
						        	estuporeCheck = false;
						        }else if (evanescoCheck == true && (palavra.charAt(i)) == 'E') {
						        	textArea.append("vanesco");	
						        	evanescoCheck = false;
				//================================================================================	
							        
							        }else if (flipendoCheck == true && (palavra.charAt(i)) == 'F') {
							        	textArea.append("lipendo");	
							        	flipendoCheck = false;
							        }else if (finiteCheck == true && (palavra.charAt(i)) == 'F') {
							        	textArea.append("inite");	
							        	finiteCheck = false;
							        }else if (fideliusCheck == true && (palavra.charAt(i)) == 'F') {
							        	textArea.append("idelius");	
							        	fideliusCheck = false;
							        }else if (ferulaCheck == true && (palavra.charAt(i)) == 'F') {
							        	textArea.append("erula");	
							        	ferulaCheck = false;
							        }else if (finestraCheck == true && (palavra.charAt(i)) == 'F') {
							        	textArea.append("inestra");	
							        	finestraCheck = false;
							        }else if (furnunculusCheck == true && (palavra.charAt(i)) == 'F'){
							        	textArea.append("urnunculus");	
							        	furnunculusCheck = false;
				//================================================================================			    			        
							        }else if (geminioCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("eminio");	
							        	geminioCheck = false;
							        }else if (godricCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("odric");	
							        	godricCheck = false;
							        }else if (guiCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("ui Weasley");	
							        	guiCheck = false;
							        }else if (gryffindorCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("ryffindor");	
							        	gryffindorCheck = false;
							        }else if (glaciusCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("lacius");	
							        	glaciusCheck = false;
							        }else if (glisseoCheck == true && (palavra.charAt(i)) == 'G') {
							        	textArea.append("lisseo");	
							        	glisseoCheck = false;
				//================================================================================	

							        }else if (horcruxCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("orcrux");	
							        	horcruxCheck = false;
							        }else if (harryCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("arry");	
							        	harryCheck = false;
							        }else if (homenumCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("omenum");	
							        	homenumCheck = false;
							        }else if (hypnusCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("ypnus");	
							        	hypnusCheck = false;
							        }else if (herbivicusCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("erbivicus");	
							        	herbivicusCheck = false;
							        }else if (homorfoCheck == true && (palavra.charAt(i)) == 'H') {
							        	textArea.append("omorfo");	
							        	homorfoCheck = false;
						        
				//================================================================================		        

							        }else if (imperiusCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("mperius");	
							        	imperiusCheck = false;
							        }else if (incarcerousCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("ncarcerous");	
							        	incarcerousCheck = false;
							        }else if (incendioCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("ncendio");	
							        	incendioCheck = false;
							        }else if (impedimentaCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("mpedimenta");	
							        	impedimentaCheck = false;
							        }else if (immobilusCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("mmobilus");	
							        	immobilusCheck = false;
							        }else if (imperviusCheck == true && (palavra.charAt(i)) == 'I') {
							        	textArea.append("mpervius");	
							        	imperviusCheck = false;
						        
				//================================================================================	

							        }else if (jamesPotterCheck == true && (palavra.charAt(i)) == 'J') {
							        	textArea.append("ames Potter");	
							        	jamesPotterCheck = false;
							        }else if (jorgeWeasleyCheck == true && (palavra.charAt(i)) == 'J') {
							        	textArea.append("orge Weasley");	
							        	jorgeWeasleyCheck = false;
							        }else if (jamesSiriusCheck == true && (palavra.charAt(i)) == 'J') {
							        	textArea.append("ames Sirius Potter");	
							        	jamesSiriusCheck = false;
						        
				//================================================================================	

							        }else if (kreacherCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("reacher");	
							        	kreacherCheck = false;
							        }else if (karkaroffCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("arkaroff");	
							        	karkaroffCheck = false;
							        }else if (knightbusCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("night-Bus");	
							        	knightbusCheck = false;
							        }else if (kelpieCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("elpie");	
							        	kelpieCheck = false;
							        }else if (krumCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("rum");	
							        	krumCheck = false;
							        }else if (knarlCheck == true && (palavra.charAt(i)) == 'K') {
							        	textArea.append("narl");	
							        	knarlCheck = false;
						        
				//================================================================================	

							        }else if (lumusCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("umus");	
							        	lumusCheck = false;
							        }else if (legilimencyCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("egilimency");	
							        	legilimencyCheck = false;
							        }else if (levicorpusCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("evicorpus");	
							        	levicorpusCheck = false;
							        }else if (locomotorCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("ocomotor");	
							        	locomotorCheck = false;
							        }else if (loremCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("orem");	
							        	loremCheck = false;
							        }else if (laguzCheck == true && (palavra.charAt(i)) == 'L') {
							        	textArea.append("laguz");	
							        	laguzCheck = false;
						        
				//================================================================================	

							        }else if (morsmordreCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("orsmordre");	
							        	morsmordreCheck = false;
							        }else if (mannazCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("annaz");	
							        	mannazCheck = false;
							        }else if (mobilicorpusCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("obilicorpus");	
							        	mobilicorpusCheck = false;
							        }else if (mobiliarbusCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("obiliarbus");	
							        	mobiliarbusCheck = false;
							        }else if (mandrakeCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("andrake");	
							        	mandrakeCheck = false;
							        }else if (maraudersmapCheck == true && (palavra.charAt(i)) == 'M') {
							        	textArea.append("arauder's Map");	
							        	maraudersmapCheck = false;
						        
				//================================================================================	

							        }else if (noxCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("ox");	
							        	noxCheck = false;
							        }else if (nigelCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("igel");	
							        	nigelCheck = false;
							        }else if (narcisaCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("arcisa");	
							        	narcisaCheck = false;
							        }else if (nauthizCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("authiz");	
							        	nauthizCheck = false;
							        }else if (nargleCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("argle");	
							        	nargleCheck = false;
							        }else if (nataliaCheck == true && (palavra.charAt(i)) == 'N') {
							        	textArea.append("atalia McDonald");
							        	nataliaCheck = false;
						        
				//================================================================================	

							        }else if (obliviateCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("bliviate");	
							        	obliviateCheck = false;
							        
							        }else if (orchideousCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("rchideous");	
							        	orchideousCheck = false;
							        }else if (ofidioglotaCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("fidioglota");	
							        	ofidioglotaCheck = false;
							        }else if (ollivandersCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("llivander's");	
							        	ollivandersCheck = false;
							        }else if (odinCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("din");	
							        	odinCheck = false;
							        }else if (othilaCheck == true && (palavra.charAt(i)) == 'O') {
							        	textArea.append("thila");	
							        	othilaCheck = false;
						        
				//================================================================================	

							        }else if (petrificusCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("etrificus");	
							        	petrificusCheck = false;
							        }else if (patronoCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("atrono");	
							        	patronoCheck = false;
							        }else if (pericullumCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("ericullum");	
							        	pericullumCheck = false;
							        }else if (peterCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("eter Pettigrew");
							        	peterCheck = false;
							        }else if (petuniaCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("etunia");	
							        	petuniaCheck = false;
							        }else if (perhtCheck == true && (palavra.charAt(i)) == 'P') {
							        	textArea.append("erht");	
							        	perhtCheck = false;
				        
				//================================================================================

							        }else if (quadribolCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uadribol");	
							        	quadribolCheck = false;
							        }else if (quidditchCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uidditch");	
							        	quidditchCheck = false;
							        }else if (quietusCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uietus");	
							        	quietusCheck = false;
							        }else if (quintipedeCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uintipede");	
							        	quintipedeCheck = false;
							        }else if (quirrelCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uirrel");	
							        	quirrelCheck = false;
							        }else if (quirkeCheck == true && (palavra.charAt(i)) == 'Q') {
							        	textArea.append("uirke");	
							        	quirkeCheck = false;
				        
				//================================================================================	

							        }else if (riddikulusCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("iddikulus");	
							        	riddikulusCheck = false;
							        }else if (riddleCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("iddle");	
							        	riddleCheck = false;
							        }else if (revelioCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("evelio");	
							        	revelioCheck = false;
							        }else if (reductoCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("educto");	
							        	reductoCheck = false;
							        }else if (raidoCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("aido");	
							        	raidoCheck = false;
							        }else if (ravenclawCheck == true && (palavra.charAt(i)) == 'R') {
							        	textArea.append("avenclaw");	
							        	ravenclawCheck = false;
				        
				//================================================================================	

							        }else if (sectumsempraCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("ectumsempra");	
							        	sectumsempraCheck = false;
							        }else if (salvioCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("alvio");	
							        	salvioCheck = false;
							        }else if (serpensortiaCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("erpensortia");	
							        	serpensortiaCheck = false;
							        }else if (slytherinCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("lytherin");	
							        	slytherinCheck = false;
							        }else if (soweluCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("owelu");	
							        	soweluCheck = false;
							        }else if (sinistroCheck == true && (palavra.charAt(i)) == 'S') {
							        	textArea.append("inistro");	
							        	sinistroCheck = false;
				        
				//================================================================================	

							        }else if (transfiguracaoCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("ransfiguracao");
							        	transfiguracaoCheck = false;
							        }else if (trasgoCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("rasgo");	
							        	trasgoCheck = false;
							        }else if (travessaCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("ravessa do Tranco");	
							        	travessaCheck = false;
							        }else if (tratoDCMCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("rato das Criaturas M�gicas");	
							        	tratoDCMCheck = false;
							        }else if (thomasCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("homas");	
							        	thomasCheck = false;
							        }else if (toothillCheck == true && (palavra.charAt(i)) == 'T') {
							        	textArea.append("oothill");	
							        	toothillCheck = false;
				        
				//================================================================================	

							        }else if (umfravilleCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("mfraville");	
							        	umfravilleCheck = false;
							        }else if (uruzCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("ruz");	
							        	uruzCheck = false;
							        }else if (unicornioCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("nicornio");
							        	unicornioCheck = false;
							        }else if (uediuosiCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("ediuosi");
							        	uediuosiCheck = false;
							        }else if (umbridgeCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("mbridge");	
							        	umbridgeCheck = false;
							        }else if (umgubularCheck == true && (palavra.charAt(i)) == 'U') {
							        	textArea.append("mgubular");	
							        	umgubularCheck = false;
				        
				//================================================================================	

							        }else if (veravertoCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("era-Verto");	
							        	veravertoCheck = false;
							        }else if (vulneraCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("ulnera");	
							        	vulneraCheck = false;
							        }else if (visgoCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("isgo");	
							        	visgoCheck = false;
							        }else if (venomoustentaculaCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("enomous-Tentacula");	
							        	venomoustentaculaCheck = false;
							        }else if (veelaCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("eela");	
							        	veelaCheck = false;
							        }else if (vagemCheck == true && (palavra.charAt(i)) == 'V') {
							        	textArea.append("agem");	
							        	vagemCheck = false;
				        
				//================================================================================	

							        }else if (wizengamotCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("izengamot");	
							        	wizengamotCheck = false;
							        }else if (wingardiumCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("ingardium");	
							        	wingardiumCheck = false;
							        }else if (weasleyCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("easley");	
							        	weasleyCheck = false;
							        }else if (wandCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("and");	
							        	wandCheck = false;
							        }else if (wunjoCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("unjo");	
							        	wunjoCheck = false;
							        }else if (wilkesCheck == true && (palavra.charAt(i)) == 'W') {
							        	textArea.append("ilkes");	
							        	wilkesCheck = false;
				        
				//================================================================================	

							        }else if (xenophiliusCheck == true && (palavra.charAt(i)) == 'X') {
							        	textArea.append("enophilius");	
							        	xenophiliusCheck = false;
							        }else if (xaropeCheck == true && (palavra.charAt(i)) == 'X') {
							        	textArea.append("arope");	
							        	xaropeCheck = false;
				        
				//================================================================================	

							        }else if (yaxleyCheck == true && (palavra.charAt(i)) == 'Y') {
							        	textArea.append("axley");	
							        	yaxleyCheck = false;
							        }else if (youdleCheck == true && (palavra.charAt(i)) == 'Y') {
							        	textArea.append("oudle");	
							        	youdleCheck = false;
							        }else if (yetiCheck == true && (palavra.charAt(i)) == 'Y') {
							        	textArea.append("eti");	
							        	yetiCheck = false;
							        }else if (yenCheck == true && (palavra.charAt(i)) == 'Y') {
							        	textArea.append("en");	
							        	yenCheck = false;
				        
				//================================================================================	

							        }else if (zabiniCheck == true && (palavra.charAt(i)) == 'Z') {
							        	textArea.append("abini");	
							        	zabiniCheck = false;
							        }else if (zellerCheck == true && (palavra.charAt(i)) == 'Z') {
							        	textArea.append("eller");	
							        	zellerCheck = false;
							        }else if (zamojskiCheck == true && (palavra.charAt(i)) == 'Z') {
							        	textArea.append("amojski");	
							        	zamojskiCheck = false;

					}
		        }
					        textArea.append("\n");
					        textArea.append("\n");
					        textArea.append("===========================");
					        textArea.append("\n");
					        textArea.append("\n");
			
			}
		});
		btnEnter.setBackground(Color.WHITE);
		btnEnter.setBounds(335, 11, 89, 28);
		contentPane.add(btnEnter);
	}
	
	
}
