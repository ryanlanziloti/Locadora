package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.AtorController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroAtor extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroAtor frame = new TelaCadastroAtor();
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
	public TelaCadastroAtor() {
		setTitle("Video Locadora Hora Da Pipoca");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 800, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro De Ator");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroAtor.class.getResource("/view/imagem/icon.png")));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel.setBounds(216, 30, 415, 48);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 99, 766, 221);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 24));
		lblNewLabel_1.setBounds(36, 38, 72, 35);
		panel.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setToolTipText("Nome do Ator");
		textFieldNome.setFont(new Font("Calibri", Font.PLAIN, 18));
		textFieldNome.setBounds(118, 41, 616, 28);
		panel.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel jLabelNacionalidade = new JLabel("Nacionalidade:");
		jLabelNacionalidade.setForeground(Color.WHITE);
		jLabelNacionalidade.setFont(new Font("Calibri", Font.BOLD, 24));
		jLabelNacionalidade.setBounds(36, 94, 162, 35);
		panel.add(jLabelNacionalidade);
		
		JComboBox comboBoxNacionalidade = new JComboBox();
		comboBoxNacionalidade.setFont(new Font("Calibri", Font.PLAIN, 18));
		comboBoxNacionalidade.setToolTipText("Selecione uma Nacionalidade");
		comboBoxNacionalidade.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Nacionalidade", "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué"}));
		comboBoxNacionalidade.setBounds(193, 97, 250, 29);
		panel.add(comboBoxNacionalidade);
		
		JButton jButtonSalvar = new JButton("Salvar");
		jButtonSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textFieldNome.getText();
				String nacionalidade = comboBoxNacionalidade.getSelectedItem().toString();
				AtorController atorController = new AtorController();
				atorController.cadastrarAtor(nome, nacionalidade);		
			}
		});
		jButtonSalvar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jButtonSalvar.setBounds(118, 172, 93, 35);
		panel.add(jButtonSalvar);
		
		JButton jButtonLimpar = new JButton("Limpar");
		jButtonLimpar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jButtonLimpar.setBounds(265, 172, 93, 35);
		panel.add(jButtonLimpar);
		
		JButton jButtonCancelar = new JButton("Cancelar");
		jButtonCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButtonCancelar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jButtonCancelar.setBounds(419, 172, 107, 35);
		panel.add(jButtonCancelar);
		
		JButton jButtonConsultar = new JButton("Consultar");
		jButtonConsultar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jButtonConsultar.setBounds(594, 172, 107, 35);
		panel.add(jButtonConsultar);
	}
}
