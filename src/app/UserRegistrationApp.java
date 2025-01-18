package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserRegistrationApp {

	public static void main(String[] args) {
		// janela principal
		JFrame frame = new JFrame("Cadastro de Usuário");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		// rótulos
		JLabel nameLabel = new JLabel("Nome:");
		nameLabel.setBounds(20, 20, 80, 25);
		frame.add(nameLabel);

		JLabel emailLabel = new JLabel("E-mail:");
		emailLabel.setBounds(20, 60, 80, 25);
		frame.add(emailLabel);

		// Campos de texto
		JTextField nameField = new JTextField();
		nameField.setBounds(100, 20, 200, 25);
		frame.add(nameField);

		JTextField emailField = new JTextField();
		emailField.setBounds(100, 60, 200, 25);
		frame.add(emailField);

		// Caixa de seleção
		JCheckBox termsCheckBox = new JCheckBox("Aceito os termos");
		termsCheckBox.setBounds(20, 100, 200, 25);
		frame.add(termsCheckBox);

		// Botão "salvar"
		JButton saveButton = new JButton("Salvar");
		saveButton.setBounds(20, 140, 100, 30);
		frame.add(saveButton);

		// Botão "limpar"
		JButton clearButton = new JButton("Limpar");
		clearButton.setBounds(130, 140, 100, 30);
		frame.add(clearButton);

		// Área de texto
		JTextArea displayArea = new JTextArea();
		displayArea.setBounds(20, 180, 340, 60);
		displayArea.setEditable(false); // somente leitura
		frame.add(displayArea);

		// Ação dos botões

		// salvar
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String email = emailField.getText();

				// Validação do campo nome
				if (!name.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\\\s]+$")) {
					JOptionPane.showMessageDialog(frame, "O campo Nome deve conter apenas letras!", "Erro",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				// Verificar se os termos foram aceitos
				if (!termsCheckBox.isSelected()) {
					JOptionPane.showMessageDialog(frame, "Você deve aceitar os termos!", "Aviso",
							JOptionPane.WARNING_MESSAGE);
					return;
				}

				// Validação do campo E-mail
				if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
					JOptionPane.showMessageDialog(frame, "Insira um e-mail válido no formato teste@teste.com!", "Erro",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				// Exibir os dados no JTextArea
				if (name.isEmpty() || email.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Erro",
							JOptionPane.ERROR_MESSAGE);
				} else {
					displayArea
							.setText("Usuário cadastrado com sucesso!\n" + "Nome: " + name + "\n" + "E-mail: " + email);
				}
				
				// Salvar dados no arquivo
				try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt", true))) {
					writer.write("Nome: " + name + " E-mail: " + email);
					writer.newLine();
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(frame, "Erro ao salvar dados no arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		// limpar
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nameField.setText("");
				emailField.setText("");
				termsCheckBox.setSelected(false);
				displayArea.setText("");
			}
		});

		// Torna a janela visivel
		frame.setVisible(true);

	}

}
