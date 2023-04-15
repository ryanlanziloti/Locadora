package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TelaCadastroItem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroItem frame = new TelaCadastroItem();
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
	public TelaCadastroItem() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 800, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 98, 766, 338);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Título:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(24, 51, 75, 25);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(99, 49, 484, 24);
		panel.add(textField);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblTipo.setBounds(24, 127, 75, 25);
		panel.add(lblTipo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione um tipo", "Blu ray Disc", "CD", "DVD"}));
		comboBox.setBounds(99, 122, 182, 34);
		panel.add(comboBox);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setForeground(Color.WHITE);
		lblPreo.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblPreo.setBounds(24, 203, 75, 25);
		panel.add(lblPreo);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(99, 205, 245, 24);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaCadastroItem.class.getResource("/view/imagem/lupa_1.png")));
		btnNewButton.setBounds(633, 36, 51, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnNewButton_1.setBounds(55, 273, 117, 39);
		panel.add(btnNewButton_1);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnLimpar.setBounds(227, 273, 117, 39);
		panel.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnCancelar.setBounds(399, 273, 117, 39);
		panel.add(btnCancelar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnConsultar.setBounds(571, 273, 137, 39);
		panel.add(btnConsultar);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro Item");
		lblNewLabel_1.setIcon(new ImageIcon(TelaCadastroItem.class.getResource("/view/imagem/icon.png")));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel_1.setBounds(258, 26, 244, 56);
		contentPane.add(lblNewLabel_1);
	}
}
