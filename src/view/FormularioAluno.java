package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FormularioAluno extends JFrame{
		
	private JLabel lbTitulo, lbNome, lbDisciplina, lbNota1, lbNota2, lbNota3, lbNota4;
	private JTextField txNome, txDisciplina, txNota1, txNota2, txNota3, txNota4;
	private JButton btExibir, btCalcularMedia, btLimpar;
	
	public FormularioAluno() {
		
		setTitle("Calculadora de Notas");
		setSize(600,400); //largura altura
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		getContentPane().setBackground(new Color(240, 240, 240)); // Cinza claro elegante

		lbTitulo = new JLabel("Cadastro de Notas");
		lbTitulo.setBounds(200, 30, 300, 40);
		lbTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lbTitulo.setForeground(new Color(51, 51, 51)); // Cinza escuro
		add(lbTitulo);

		lbNome = new JLabel("Nome:");
		lbNome.setBounds(50,100,100,30);
		lbNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lbNome.setForeground(new Color(51, 51, 51));
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(120,100,200,30);
		txNome.setFont(new Font("Arial", Font.PLAIN, 14));
		txNome.setBackground(Color.WHITE);
		txNome.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txNome);

		lbDisciplina = new JLabel("Disciplina:");
		lbDisciplina.setBounds(50,150,100,30);
		lbDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
		lbDisciplina.setForeground(new Color(51, 51, 51));
		add(lbDisciplina);
		
		txDisciplina = new JTextField();
		txDisciplina.setBounds(120,150,200,30);
		txDisciplina.setFont(new Font("Arial", Font.PLAIN, 14));
		txDisciplina.setBackground(Color.WHITE);
		txDisciplina.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txDisciplina);

		lbNota1 = new JLabel("Nota 1:");
		lbNota1.setBounds(50,200,100,30);
		lbNota1.setFont(new Font("Arial", Font.PLAIN, 14));
		lbNota1.setForeground(new Color(51, 51, 51));
		add(lbNota1);
		txNota1 = new JTextField();
		txNota1.setBounds(120,200,50,30);
		txNota1.setFont(new Font("Arial", Font.PLAIN, 14));
		txNota1.setBackground(Color.WHITE);
		txNota1.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txNota1);

		lbNota2 = new JLabel("Nota 2:");
		lbNota2.setBounds(190,200,100,30);
		lbNota2.setFont(new Font("Arial", Font.PLAIN, 14));
		lbNota2.setForeground(new Color(51, 51, 51));
		add(lbNota2);
		txNota2 = new JTextField();
		txNota2.setBounds(260,200,50,30);
		txNota2.setFont(new Font("Arial", Font.PLAIN, 14));
		txNota2.setBackground(Color.WHITE);
		txNota2.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txNota2);

		lbNota3 = new JLabel("Nota 3:");
		lbNota3.setBounds(330,200,100,30);
		lbNota3.setFont(new Font("Arial", Font.PLAIN, 14));
		lbNota3.setForeground(new Color(51, 51, 51));
		add(lbNota3);
		txNota3 = new JTextField();
		txNota3.setBounds(400,200,50,30);
		txNota3.setFont(new Font("Arial", Font.PLAIN, 14));
		txNota3.setBackground(Color.WHITE);
		txNota3.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txNota3);

		lbNota4 = new JLabel("Nota 4:");
		lbNota4.setBounds(470,200,100,30);
		lbNota4.setFont(new Font("Arial", Font.PLAIN, 14));
		lbNota4.setForeground(new Color(51, 51, 51));
		add(lbNota4);
		txNota4 = new JTextField();
		txNota4.setBounds(540,200,50,30);
		txNota4.setFont(new Font("Arial", Font.PLAIN, 14));
		txNota4.setBackground(Color.WHITE);
		txNota4.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(2, 5, 2, 5)));
		add(txNota4);

		btExibir = new JButton("Ver Dados");
		btExibir.setBounds(120,250,120,30);
		btExibir.setFont(new Font("Arial", Font.PLAIN, 14));
		btExibir.setForeground(new Color(51, 51, 51));
		btExibir.setBackground(new Color(240, 240, 240));
		btExibir.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(5, 10, 5, 10)));
		btExibir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txNome.getText();
				String disciplina = txDisciplina.getText();
				JOptionPane.showMessageDialog(null,
					"Dados do Aluno\n\n" +
					"Nome: "+ nome + "\n" +
					"Disciplina: " + disciplina,
					"Informações", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btExibir);

		btCalcularMedia = new JButton("Calcular Média");
		btCalcularMedia.setBounds(250,250,120,30);
		btCalcularMedia.setFont(new Font("Arial", Font.PLAIN, 14));
		btCalcularMedia.setForeground(new Color(51, 51, 51));
		btCalcularMedia.setBackground(new Color(240, 240, 240));
		btCalcularMedia.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(5, 10, 5, 10)));
		btCalcularMedia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					double n1 = Double.parseDouble(txNota1.getText());
					double n2 = Double.parseDouble(txNota2.getText());
					double n3 = Double.parseDouble(txNota3.getText());
					double n4 = Double.parseDouble(txNota4.getText());
					double media = (n1 + n2 + n3 + n4) / 4.0;
					
					String mensagem;
					if (media >= 7.0) {
						mensagem = "Aprovado";
					} else if (media >= 5.0) {
						mensagem = "Em Recuperação";
					} else {
						mensagem = "Reprovado";
					}
					
					JOptionPane.showMessageDialog(null,
						"Resultado\n\n" +
						"Nome: " + txNome.getText() + "\n" +
						"Disciplina: " + txDisciplina.getText() + "\n" +
						"Nota 1: " + n1 + "\n" +
						"Nota 2: " + n2 + "\n" +
						"Nota 3: " + n3 + "\n" +
						"Nota 4: " + n4 + "\n" +
						"Média Final: " + String.format("%.1f", media) + "\n" +
						"Situação: " + mensagem,
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
						"Por favor, digite todas as notas corretamente.",
						"Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		add(btCalcularMedia);
		
		btLimpar = new JButton("Limpar");
		btLimpar.setBounds(380,250,100,30);
		btLimpar.setFont(new Font("Arial", Font.PLAIN, 14));
		btLimpar.setForeground(new Color(51, 51, 51));
		btLimpar.setBackground(new Color(240, 240, 240));
		btLimpar.setBorder(BorderFactory.createCompoundBorder(
			BorderFactory.createLineBorder(new Color(180, 180, 180)),
			BorderFactory.createEmptyBorder(5, 10, 5, 10)));
		btLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txNome.setText("");
				txDisciplina.setText("");
				txNota1.setText("");
				txNota2.setText("");
				txNota3.setText("");
				txNota4.setText("");
				JOptionPane.showMessageDialog(null,
					"Todos os campos foram limpos.",
					"Aviso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btLimpar);

		setVisible(true);//ÚLTIMA LINHA DO CONSTRUTOR
	}	
}