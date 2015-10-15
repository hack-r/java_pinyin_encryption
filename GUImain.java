package pinyincrypto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import pinyincrypto.*;
import javax.swing.JScrollPane;

public class GUImain extends JFrame {

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
					GUImain frame = new GUImain();
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
	public GUImain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPinyinEncryptionTool = new JLabel("Pinyin Encryption Tool v0.2");
		lblPinyinEncryptionTool.setBounds(86, 5, 237, 30);
		lblPinyinEncryptionTool.setFont(new Font("Chiller", Font.BOLD, 25));
		contentPane.add(lblPinyinEncryptionTool);
		
		textField = new JTextField();
		textField.setBounds(10, 83, 401, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPlainTextTo = new JLabel("Plain Text");
		lblPlainTextTo.setBounds(177, 67, 62, 14);
		contentPane.add(lblPlainTextTo);
		
		JLabel lblPsuedopinyinEncryptedText = new JLabel(" Encrypted Text");
		lblPsuedopinyinEncryptedText.setBounds(166, 171, 77, 14);
		contentPane.add(lblPsuedopinyinEncryptedText);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 186, 401, 54);
		contentPane.add(textField_1);
		
		JButton btnConvert = new JButton("Encrypt!");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		           String plainsecret = textField.getText();
		           String secret = Encrypt2Pinyin.e2p(plainsecret);
		           textField_1.setText(secret);
			}
		});
		btnConvert.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnConvert.setBounds(36, 137, 144, 23);
		contentPane.add(btnConvert);
		
		JButton button = new JButton("Decrypt!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pinyinsecret = textField_1.getText();
				String plaintext = DecryptPinyin.p2t(pinyinsecret);
				textField.setText(plaintext);
			}
		});
		button.setFont(new Font("Segoe UI", Font.BOLD, 14));
		button.setBounds(250, 137, 144, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 224, 4, 4);
		contentPane.add(scrollPane);
	}
}
