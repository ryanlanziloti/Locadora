package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JTree;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar jMenuBarTelaPrincipal = new JMenuBar();
		jMenuBarTelaPrincipal.setBounds(0, 0, 815, 54);
		contentPane.add(jMenuBarTelaPrincipal);
		
		JMenu jMenuLocacao = new JMenu("Locação");
		jMenuLocacao.setForeground(new Color(0, 0, 0));
		jMenuLocacao.setBackground(new Color(255, 255, 255));
		jMenuLocacao.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuLocacao.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/icon.png")));
		jMenuBarTelaPrincipal.add(jMenuLocacao);
		
		JMenuItem jMenuItemAlugar = new JMenuItem("Alugar");
		jMenuItemAlugar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItemAlugar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuLocacao.add(jMenuItemAlugar);
		
		JMenuItem jMenuItemConsultar = new JMenuItem("Consultar");
		jMenuItemConsultar.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItemConsultar.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuLocacao.add(jMenuItemConsultar);
		
		JMenu jMenuCadastro = new JMenu("Cadastro");
		jMenuCadastro.setForeground(new Color(0, 0, 0));
		jMenuCadastro.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuBarTelaPrincipal.add(jMenuCadastro);
		
		JMenuItem jMenuItemAtor = new JMenuItem("Ator");
		jMenuItemAtor.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItemAtor.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuCadastro.add(jMenuItemAtor);
		
		JMenuItem jMenuItemCliente = new JMenuItem("Cliente");
		jMenuItemCliente.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItemCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuCadastro.add(jMenuItemCliente);
		
		JMenuItem jMenuItemFIlme = new JMenuItem("Filme");
		jMenuItemFIlme.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItemFIlme.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuCadastro.add(jMenuItemFIlme);
		
		JMenuItem jMenuItem = new JMenuItem("Item");
		jMenuItem.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuItem.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/seta.png")));
		jMenuCadastro.add(jMenuItem);
		
		JMenu mnNewMenu = new JMenu("Sair");
		mnNewMenu.setForeground(new Color(255, 0, 0));
		mnNewMenu.setFont(new Font("Calibri", Font.PLAIN, 18));
		jMenuBarTelaPrincipal.add(mnNewMenu);
		
		JPanel jPanelTelaPrincipal = new JPanel();
		jPanelTelaPrincipal.setBackground(new Color(128, 128, 128));
		jPanelTelaPrincipal.setForeground(new Color(128, 128, 128));
		jPanelTelaPrincipal.setBounds(23, 64, 753, 489);
		contentPane.add(jPanelTelaPrincipal);
		jPanelTelaPrincipal.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(59, 47, 668, 400);
		jPanelTelaPrincipal.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagem/logo.png")));
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
