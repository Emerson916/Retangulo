package br.com.empresa.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.empresa.model.Retangulo;

public class FrameRetangulo {

	public void criarTela() {
		
		
		// construir a tela 
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com Ret�ngulos");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// construir um Jlabel - Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(10, 10, 60, 30);
		
		// construir TextFild - Altura
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70,10,50,30);
		
		
		// Construir Jlabel - Base
		JLabel labelBase = new JLabel();
		labelBase.setText("Base:");
		labelBase.setBounds(10,50,60,30);
		
		// Construir TextFild - Base 
		JTextField textBase = new JTextField();
		textBase.setBounds(70,50,50,30);
		
		//Construir bot�o - Calcular
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(10, 100, 110, 30);
		
		//Construir bot�o - Limpar
		
		JButton btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(10, 140, 110, 30);
		
		//Construir JLabels - Resultados 
		
		JLabel labelArea = new JLabel();
		labelArea.setText("�rea:");
		labelArea.setBounds(150, 10, 140, 30);
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Per�metro:");
		labelPerimetro.setBounds(150, 50, 140, 30);
		
		
		
		
		
		// Painel de Conteudo
		
			//Base**
				
		tela.getContentPane().add(textBase);		
		tela.getContentPane().add(labelBase);	
		
			//Altura**
				
		tela.getContentPane().add(textAltura);
		tela.getContentPane().add(labelAltura);
		
			//Bot�es - Calcular e Limpar
		
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		
			//Labels - Resultados (�rea e Per�metro) 
		
		tela.getContentPane().add(labelArea);
		tela.getContentPane().add(labelPerimetro);
		
		
		tela.setVisible(true); //Sempre vai ser a ultima coisa a ser chamado
		
		// Ouvintes de A��es/Eventos
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText("�rea: " + String.valueOf(r1.calcularArea()));
				labelPerimetro.setText("Per�metro: " + String.valueOf(r1.calcularPerimetro()));
				
			}
		});
		
		
		
		
		
	}
	
}
