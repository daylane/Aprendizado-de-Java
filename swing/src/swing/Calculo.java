package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;

public class Calculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtv1;
	private JTextField txtv2;
	private JTextField txtResultado;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculo frame = new Calculo();
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
	public Calculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 309);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setBounds(65, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 2");
		lblNewLabel_1.setBounds(65, 104, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(65, 187, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		
		
		txtv1 = new JTextField();
		txtv1.setBounds(46, 57, 86, 20);
		contentPane.add(txtv1);
		txtv1.setColumns(10);
		
		txtv2 = new JTextField();
		txtv2.setBounds(46, 129, 86, 20);
		contentPane.add(txtv2);
		txtv2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(46, 215, 86, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		comboBox = new JComboBox();
		preenchercombobox(comboBox);
		comboBox.setBounds(152, 56, 83, 23);
		contentPane.add(comboBox);
		
		JButton btnSoma = new JButton("Soma");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double v1,v2;
				v1 = Double.parseDouble(txtv1.getText());
				v2 = Double.parseDouble(txtv2.getText());
				
				
				
				if(comboBox.getSelectedIndex()==1) {
					txtResultado.setText(String.valueOf(somar(Double.parseDouble(txtv1.getText()), Double.parseDouble( txtv2.getText()))));
				}
				if(comboBox.getSelectedIndex()==2) {
					txtResultado.setText(String.valueOf(subtrair(Double.parseDouble(txtv1.getText()), Double.parseDouble( txtv2.getText()))));
				}
				if(comboBox.getSelectedIndex()==3) {
					txtResultado.setText(String.valueOf(multiplicar(Double.parseDouble(txtv1.getText()), Double.parseDouble( txtv2.getText()))));
				}
				if(comboBox.getSelectedIndex()==4) {
					txtResultado.setText(String.valueOf(dividir(Double.parseDouble(txtv1.getText()), Double.parseDouble( txtv2.getText()))));
				}
											
			}
		});
		btnSoma.setBounds(146, 128, 89, 23);
		contentPane.add(btnSoma);
		
		
	}
	
	private double somar(double v1, double v2)
	{
		return(v1+v2);
		
	}
	private double subtrair(double v1, double v2)
	{
		return(v1-v2);
		
	}
	private double multiplicar(double v1, double v2)
	{
		return(v1*v2);
		
	}
	private double dividir(double v1, double v2)
	{
		return(v1/v2);
		
	}
	
	private void preenchercombobox(JComboBox comboBox) 
	{
		comboBox.addItem("");
		comboBox.addItem("Somar");
		comboBox.addItem("Subtrair");
		comboBox.addItem("Multiplicar");
		comboBox.addItem("Dividir");
	}
}
