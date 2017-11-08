package windowBuilder.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class oversamplingKeyPad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	public String oversampling;

	/**
	 * Create the dialog.
	 */	
	public String returnOverSampling() {
		return oversampling; 
	}
	public oversamplingKeyPad() {

		setBounds(300, 112, 225, 225);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(105, 105, 105));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JFormattedTextField oversamplingField = new JFormattedTextField();
		JLabel lbloversampling = new JLabel("Oversampling:");
		lbloversampling.setForeground(new Color(255, 250, 250));
		lbloversampling.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("1");
				else
					oversamplingField.setText(oversamplingField.getText() + "1");
			}
		});
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("2");
				else
					oversamplingField.setText(oversamplingField.getText() + "2");
			}
		});
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("3");
				else
					oversamplingField.setText(oversamplingField.getText() + "3");
			}
		});
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("4");
				else
					oversamplingField.setText(oversamplingField.getText() + "4");
			}
		});
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("5");
				else
					oversamplingField.setText(oversamplingField.getText() + "5");
			}
		});
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("6");
				else
					oversamplingField.setText(oversamplingField.getText() + "6");
			}
		});
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("7");
				else
					oversamplingField.setText(oversamplingField.getText() + "7");
			}
		});
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("8");
				else
					oversamplingField.setText(oversamplingField.getText() + "8");
			}
		});
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setValue("9");
				else
					oversamplingField.setText(oversamplingField.getText() + "9");
			}
		});
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText("0");
				else
					oversamplingField.setText(oversamplingField.getText() + "0");
			}
		});
		JButton numPeriod = new JButton(".");
		numPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oversamplingField.getText() == null)
					oversamplingField.setText(".");
				else
					oversamplingField.setText(oversamplingField.getText() + ".");
			}
		});
		
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(oversamplingField.getText() != null) {
					String pastField = oversamplingField.getText();
					String newField = pastField.substring(0, pastField.length() - 1);
					oversamplingField.setText(newField);					
				}
			}
		});
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addGap(6)
								.addComponent(lbloversampling)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(oversamplingField))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(num1)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num3)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num0)))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(num7)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num8)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num9)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnBack))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(num4)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num5)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num6)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(numPeriod, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbloversampling)
						.addComponent(oversamplingField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num1)
						.addComponent(num0)
						.addComponent(num2)
						.addComponent(num3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num4)
						.addComponent(numPeriod, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(num5)
						.addComponent(num6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(num7)
						.addComponent(num8)
						.addComponent(num9)
						.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(105, 105, 105));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						oversampling = oversamplingField.getText();
						dispose();
						
					}
				});
				
				JButton btnClear = new JButton("Clear");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						oversamplingField.setText("");
					}
				});
				buttonPane.add(btnClear);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	} 
}