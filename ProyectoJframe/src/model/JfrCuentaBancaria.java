package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CuentaBancaria;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;

public class JfrCuentaBancaria extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtNumeroDeCuenta;
	private JTextField txtSaldo;
	private boolean isSecondNumber = false;
	ButtonGroup bg = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JfrCuentaBancaria frame = new JfrCuentaBancaria();
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
	public JfrCuentaBancaria() {
		setTitle("Cuenta Bancaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreTitular = new JLabel("Nombre del Titular");
		lblNombreTitular.setFont(new Font("Serif", Font.BOLD, 13));
		lblNombreTitular.setBounds(26, 45, 106, 24);
		contentPane.add(lblNombreTitular);
		
		JLabel lblApellidoTitular = new JLabel("Apellidos Titular");
		lblApellidoTitular.setFont(new Font("Serif", Font.BOLD, 13));
		lblApellidoTitular.setBounds(177, 45, 106, 24);
		contentPane.add(lblApellidoTitular);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(26, 69, 106, 24);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(177, 69, 106, 24);
		contentPane.add(txtApellidos);
		
		JLabel lblNumeroDeCuenta = new JLabel("Numero de Cuenta");
		lblNumeroDeCuenta.setFont(new Font("Serif", Font.BOLD, 13));
		lblNumeroDeCuenta.setBounds(26, 116, 106, 24);
		contentPane.add(lblNumeroDeCuenta);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Serif", Font.BOLD, 13));
		lblSaldo.setBounds(209, 116, 106, 24);
		contentPane.add(lblSaldo);
		
		txtNumeroDeCuenta = new JTextField();
		txtNumeroDeCuenta.setColumns(10);
		txtNumeroDeCuenta.setBounds(26, 140, 106, 24);
		contentPane.add(txtNumeroDeCuenta);
		
		txtSaldo = new JTextField();
		txtSaldo.setColumns(10);
		txtSaldo.setBounds(177, 140, 106, 24);
		contentPane.add(txtSaldo);
		
		JComboBox cbTipoDeCuenta = new JComboBox();
		cbTipoDeCuenta.setFont(new Font("Serif", Font.BOLD, 13));
		cbTipoDeCuenta.setModel(new DefaultComboBoxModel(new String[] {"AHORROS", "CORRIENTE"}));
		cbTipoDeCuenta.setBounds(323, 68, 94, 24);
		contentPane.add(cbTipoDeCuenta);
		
//		bg.add(RD);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				CuentaBancaria cuentaBancaria = new CuentaBancaria(txtNombres.getText(), 
				txtApellidos.getText(), Integer.parseInt(txtNumeroDeCuenta.getText()), Float.parseFloat(txtSaldo.getText()));
				
				List<CuentaBancaria> Cuenta = new ArrayList<CuentaBancaria>();
				Cuenta.add(cuentaBancaria);
				
				  String TipoCuenta =  "" + cbTipoDeCuenta.getSelectedItem();
					
				
				for (CuentaBancaria User : Cuenta) {
				
				System.out.println("Cuenta Bamcaria: " + User.getNombreTitular() + " " + User.getApellidoTitular()
					   + " "+ User.getNumeroCuenta() + " "  + User.getSaldo()  + " Su tipo de cuenta es " + TipoCuenta );
					
				}
			}
		});
		btnGuardar.setFont(new Font("Serif", Font.BOLD, 13));
		btnGuardar.setBounds(26, 189, 391, 24);
		contentPane.add(btnGuardar);
		
		JButton btnLimpiarCampos = new JButton("Limpiar ");
		btnLimpiarCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnLimpiarCampos.setFont(new Font("Serif", Font.BOLD, 13));
		btnLimpiarCampos.setBounds(325, 139, 92, 24);
		contentPane.add(btnLimpiarCampos);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(26, 235, 391, 26);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(26, 224, 391, 26);
		contentPane.add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(0, 0, 0));
		separator_1_1.setBounds(26, 11, 391, 26);
		contentPane.add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(26, 25, 391, 26);
		contentPane.add(separator_1_2);
		btnLimpiarCampos.addActionListener(e -> clearFields());
	}

	private void clearFields() {
		txtNombres.setText("");
		txtApellidos.setText("");
		txtNumeroDeCuenta.setText("");
		txtSaldo.setText("");
		
		isSecondNumber = false;
	}

}
