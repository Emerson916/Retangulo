package br.com.empresa.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {

	public void criarTela() {
		
		
		// construir a tela 
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com Retângulos");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// construir um Jlabel
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 10, 60, 30);
		
		// construir TextFild
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70,10,60,30);
		
		
		tela.getContentPane().add(textAltura);
		
		
		
		
		
		
		
		
		tela.getContentPane().add(labelAltura);
		
		tela.setVisible(true); //Sempre vai ser a ultima coisa a ser chamado
	}
	
}
