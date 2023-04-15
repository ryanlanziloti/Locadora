package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.FilmeController;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroFilme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFilme frame = new TelaCadastroFilme();
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
	public TelaCadastroFilme() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 800, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 110, 766, 564);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Título:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(81, 51, 70, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(159, 51, 518, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gênero:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(81, 108, 79, 30);
		panel.add(lblNewLabel_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o Gênero", "Ação", "Animação", "Aventura", "Cinema de arte", "Chanchada", "Comédia", "Comédia romântica", "Comédia dramática", "Comédia de ação", "Dança", "Documentário", "Docuficção", "Drama", "Espionagem", "Faroeste", "Fantasia científica", "Ficção científica", "Filmes de guerra", "Filme policial", "Musical", "Romance", "Seriado", "Suspense", "Terror"}));
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox.setBounds(170, 109, 206, 28);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Sinopse:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(81, 160, 92, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.PLAIN, 20));
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setTabSize(1);
		textArea.setBounds(170, 168, 507, 151);
		panel.add(textArea);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Duração:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(81, 359, 92, 30);
		panel.add(lblNewLabel_1_1_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(0), null, null, Integer.valueOf(1)));
		spinner.setFont(new Font("Calibri", Font.PLAIN, 20));
		spinner.setBounds(179, 359, 52, 30);
		panel.add(spinner);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int duracao = Integer.parseInt(spinner.getValue().toString());
				String genero = comboBox.getSelectedItem().toString();
				boolean sucesso;
				
				}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnNewButton.setBounds(64, 451, 117, 39);
		panel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnLimpar.setBounds(227, 451, 117, 39);
		panel.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnCancelar.setBounds(390, 451, 117, 39);
		panel.add(btnCancelar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnConsultar.setBounds(553, 451, 137, 39);
		panel.add(btnConsultar);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Filme");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroFilme.class.getResource("/view/imagem/icon.png")));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel.setBounds(246, 34, 336, 65);
		contentPane.add(lblNewLabel);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
