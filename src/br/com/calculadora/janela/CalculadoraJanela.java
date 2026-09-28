package br.com.calculadora.janela;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.pojo.AcaoOperacoes;
import br.com.calculadora.pojo.Operacoes;

public class CalculadoraJanela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResultado;
	private AcaoOperacoes acoes = new AcaoOperacoes();
	private double primeiroNumero;
	private String operador;
	private boolean novoNumero = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraJanela frame = new CalculadoraJanela();
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
	public CalculadoraJanela() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraJanela.class.getResource("/br/com/calculadora/imagens/d.iconimage.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("☯☯☯ Calculadora ☯☯☯");
		setBounds(100, 100, 375, 525);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 91, 340, 2);
		contentPane.add(separator);
        
		JButton btnSomar = new JButton("+");
		btnSomar.setBackground(new Color(255, 204, 255));
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSomar.setBounds(199, 287, 64, 57);
		contentPane.add(btnSomar);
		btnSomar.addActionListener(e -> selecionarOperador("+"));
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setBackground(new Color(255, 204, 255));
		btnSubtrair.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtrair.setBounds(273, 287, 64, 57);
		contentPane.add(btnSubtrair);
		btnSubtrair.addActionListener(e -> selecionarOperador("-"));
		
		JButton btnDividir = new JButton("÷");
		btnDividir.setBackground(new Color(255, 204, 255));
		btnDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDividir.setBounds(199, 358, 64, 57);
		contentPane.add(btnDividir);
		btnDividir.addActionListener(e -> selecionarOperador("/"));
		
		JButton btnMultiplicacar = new JButton("×");
		btnMultiplicacar.setBackground(new Color(255, 204, 255));
		btnMultiplicacar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicacar.setBounds(199, 219, 64, 57);
		contentPane.add(btnMultiplicacar);
		btnMultiplicacar.addActionListener(e -> selecionarOperador("*"));
		
	
		JButton btnNumero1 = new JButton("1");
		btnNumero1.setBackground(new Color(255, 204, 255));
		btnNumero1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero1.setBounds(10, 243, 50, 44);
		contentPane.add(btnNumero1);
		btnNumero1.addActionListener(e -> digitarNumero("1"));
	
		
		JButton btnNumero2 = new JButton("2");
		btnNumero2.setBackground(new Color(255, 204, 255));
		btnNumero2.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero2.setBounds(70, 243, 50, 44);
		contentPane.add(btnNumero2);
		btnNumero2.addActionListener(e -> digitarNumero("2"));
		
		
		
		JButton btnNumero3 = new JButton("3");
		btnNumero3.setBackground(new Color(255, 204, 255));
		btnNumero3.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero3.setBounds(130, 243, 50, 44);
		contentPane.add(btnNumero3);
		btnNumero3.addActionListener(e -> digitarNumero("3"));
		
	
		
		JButton btnNumero4 = new JButton("4");
		btnNumero4.setBackground(new Color(255, 204, 255));
		btnNumero4.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero4.setBounds(10, 300, 50, 44);
		contentPane.add(btnNumero4);
		btnNumero4.addActionListener(e -> digitarNumero("4"));
		
	
		JButton btnNumero5 = new JButton("5");
		btnNumero5.setBackground(new Color(255, 204, 255));
		btnNumero5.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero5.setBounds(70, 300, 50, 44);
		contentPane.add(btnNumero5);
		btnNumero5.addActionListener(e -> digitarNumero("5"));
	
		
		JButton btnNumero6 = new JButton("6");
		btnNumero6.setBackground(new Color(255, 204, 255));
		btnNumero6.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero6.setBounds(130, 300, 50, 44);
		contentPane.add(btnNumero6);
		btnNumero6.addActionListener(e -> digitarNumero("6"));
		
		JButton btnNumero7 = new JButton("7");
		btnNumero7.setBackground(new Color(255, 204, 255));
		btnNumero7.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero7.setBounds(10, 358, 50, 44);
		contentPane.add(btnNumero7);
		btnNumero3.addActionListener(e -> digitarNumero("7"));
		
		
		JButton btnNumero8 = new JButton("8");
		btnNumero8.setBackground(new Color(255, 204, 255));
		btnNumero8.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero8.setBounds(70, 358, 50, 44);
		contentPane.add(btnNumero8);
		btnNumero8.addActionListener(e -> digitarNumero("8"));

		
		JButton btnNumero9 = new JButton("9");
		btnNumero9.setBackground(new Color(255, 204, 255));
		btnNumero9.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero9.setBounds(130, 358, 50, 44);
		contentPane.add(btnNumero9);
		btnNumero9.addActionListener(e -> digitarNumero("9"));
		
		
		JButton btnNumero0 = new JButton("0");
		btnNumero0.setBackground(new Color(255, 204, 255));
		btnNumero0.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNumero0.setBounds(10, 413, 169, 62);
		contentPane.add(btnNumero0);
		btnNumero0.addActionListener(e -> digitarNumero("0"));
	
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(new Color(255, 255, 204));
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnIgual.setBounds(199, 426, 138, 49);
		contentPane.add(btnIgual);
		btnIgual.addActionListener(e -> calcularResultado());
		
		JButton btnRaiz = new JButton("√");
		btnRaiz.setBackground(new Color(255, 204, 255));
		btnRaiz.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRaiz.setBounds(273, 219, 64, 57);
		contentPane.add(btnRaiz);
		btnRaiz.addActionListener(e -> calcularRaiz());
		
		JButton btnClear = new JButton("C");
		btnClear.setBackground(new Color(255, 204, 255));
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(199, 96, 138, 44);
		contentPane.add(btnClear);
		btnClear.addActionListener(e -> limpar());
		
		JButton btnPonto = new JButton(".");
		btnPonto.setBackground(new Color(255, 204, 255));
		btnPonto.setActionCommand(".");
		btnPonto.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPonto.setBounds(199, 151, 64, 57);
		contentPane.add(btnPonto);
		
		JButton btnPotencia = new JButton("x²");
		btnPotencia.setBackground(new Color(255, 204, 255));
		btnPotencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPotencia.setBounds(273, 151, 64, 57);
		contentPane.add(btnPotencia);
		
		JButton btnApagar = new JButton("⌫");
		btnApagar.setBackground(new Color(255, 204, 255));
		btnApagar.setBounds(273, 358, 64, 57);
		contentPane.add(btnApagar);
		btnApagar.addActionListener(e -> apagarDigito());
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CalculadoraJanela.class.getResource("/br/com/calculadora/imagens/presente.iconimage.png")));
		lblNewLabel.setBounds(48, 104, 114, 139);
		contentPane.add(lblNewLabel);
		
		txtResultado = new JTextField();
		txtResultado.setBackground(new Color(255, 204, 255));
		txtResultado.setBounds(10, 11, 339, 69);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);

	}
	
private String segundoNumeroTexto = "";
	
	private void digitarNumero(String numero) {
	    if (operador != null) {
 
	        if (novoNumero) {
	            segundoNumeroTexto = numero;
	            novoNumero = false;
	        } else {
	            segundoNumeroTexto += numero;
	        }
 
	        txtResultado.setText(
	            primeiroNumero + " " + operador
	            + " " + segundoNumeroTexto
	        );
 
	    } else {
	        if (novoNumero) {
	            txtResultado.setText(numero);
	            novoNumero = false;
	        } else {
	            txtResultado.setText(
	                txtResultado.getText() + numero
	            );
	        }
	    }
	}
	private void selecionarOperador(String operador) {
	    primeiroNumero = Double.parseDouble(
	        txtResultado.getText()
	    );
 
	    this.operador = operador;
	    segundoNumeroTexto = "";
	    novoNumero = true;
 
	    txtResultado.setText(
	        primeiroNumero + " " + operador
	    );
	}
	private void calcularRaiz() {
	    double numero = Double.parseDouble(
	        txtResultado.getText()
	    );
 
	    Operacoes operacao = new Operacoes(
	    		numero, 0, "√"
	    		);
 
	    double resultado = acoes.calcular(operacao);
 
	    DecimalFormat formato = new DecimalFormat("0.##########");
	    txtResultado.setText(formato.format(resultado));
 
	    novoNumero = true;
	}
	private void calcularResultado() {
		double segundoNumero = Double.parseDouble(
			    segundoNumeroTexto
	    );
 
	    Operacoes operacao = new Operacoes(
	        primeiroNumero,
	        segundoNumero,
	        operador
	    );
 
	    double resultado = acoes.calcular(operacao);
 
	    DecimalFormat formato = new DecimalFormat("0.##########");
	    txtResultado.setText(formato.format(resultado));
 
	    novoNumero = true;
	}
	
	private void limpar() {
	    txtResultado.setText("0");
 
	    primeiroNumero = 0;
	    operador = null;
	    novoNumero = true;
	}
	
	private void apagarDigito() {
	    String texto = txtResultado.getText();
 
	    if (texto.length() > 1) {
	        txtResultado.setText(
	            texto.substring(0, texto.length() - 1)
	        );
	    } else {
	        txtResultado.setText("0");
	    }
	}
}
