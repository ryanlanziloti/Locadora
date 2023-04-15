package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 96, 766, 457);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(67, 45, 84, 30);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(142, 45, 484, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(67, 116, 212, 30);
		panel.add(lblNewLabel_1_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setToolTipText("");
		formattedTextField.setFont(new Font("Calibri", Font.PLAIN, 20));
		formattedTextField.setBounds(289, 116, 114, 24);
		panel.add(formattedTextField);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(67, 183, 49, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JFormattedTextField formattedTextFieldCPF = new JFormattedTextField();
		formattedTextFieldCPF.setFont(new Font("Calibri", Font.PLAIN, 20));
		formattedTextFieldCPF.setBounds(115, 183, 162, 24);
		panel.add(formattedTextFieldCPF);
		
		JLabel lblNewLabel = new JLabel("Cadastro Cliente");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/view/imagem/icon.png")));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 32));
		lblNewLabel.setBounds(227, 10, 472, 104);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_2.setBounds(67, 234, 84, 30);
		panel.add(lblNewLabel_1_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(142, 234, 484, 24);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Endereço:");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel_1_3.setBounds(67, 292, 99, 30);
		panel.add(lblNewLabel_1_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(176, 295, 450, 24);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnNewButton.setBounds(55, 377, 117, 39);
		panel.add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnLimpar.setBounds(227, 377, 117, 39);
		panel.add(btnLimpar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnCancelar.setBounds(399, 377, 117, 39);
		panel.add(btnCancelar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Calibri", Font.PLAIN, 24));
		btnConsultar.setBounds(571, 377, 137, 39);
		panel.add(btnConsultar);
		
		
		try {
			formattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
			
			
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		formattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	formattedTextFieldActionPerformed(evt);
            }
        });
		try {
			formattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));	
			
			
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
		formattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	formattedTextFieldActionPerformed(evt);
            }
        });
		
	}
	
	private void formattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }  
}
