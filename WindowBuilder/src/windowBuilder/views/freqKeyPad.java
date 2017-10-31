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
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class freqKeyPad extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public String freq;
	/*
	 Launch the application.
	 
	public static void main(String[] args) {
		try {
			freqKeyPad dialog = new freqKeyPad();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String freq;

	/**
	 * Create the dialog.
	 */	
	public String returnFreq() {
		return freq; 
	}
	public freqKeyPad() {
		setType(Type.POPUP);

		setBounds(100, 100, 275, 238);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(105, 105, 105));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JFormattedTextField freqField = new JFormattedTextField();
		JLabel lblFrequency = new JLabel("Frequency:");
		lblFrequency.setForeground(new Color(255, 250, 250));
		lblFrequency.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		JButton num1 = new JButton("1");
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("1");
				else
					freqField.setText(freqField.getText() + "1");
			}
		});
		JButton num2 = new JButton("2");
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("2");
				else
					freqField.setText(freqField.getText() + "2");
			}
		});
		JButton num3 = new JButton("3");
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("3");
				else
					freqField.setText(freqField.getText() + "3");
			}
		});
		JButton num4 = new JButton("4");
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("4");
				else
					freqField.setText(freqField.getText() + "4");
			}
		});
		JButton num5 = new JButton("5");
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("5");
				else
					freqField.setText(freqField.getText() + "5");
			}
		});
		JButton num6 = new JButton("6");
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("6");
				else
					freqField.setText(freqField.getText() + "6");
			}
		});
		JButton num7 = new JButton("7");
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("7");
				else
					freqField.setText(freqField.getText() + "7");
			}
		});
		JButton num8 = new JButton("8");
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("8");
				else
					freqField.setText(freqField.getText() + "8");
			}
		});
		JButton num9 = new JButton("9");
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setValue("9");
				else
					freqField.setText(freqField.getText() + "9");
			}
		});
		JButton num0 = new JButton("0");
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText("0");
				else
					freqField.setText(freqField.getText() + "0");
			}
		});
		JButton numPeriod = new JButton(".");
		numPeriod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(freqField.getText() == null)
					freqField.setText(".");
				else
					freqField.setText(freqField.getText() + ".");
			}
		});
		
		JComboBox prefixSelect = new JComboBox();
		prefixSelect.setModel(new DefaultComboBoxModel(new String[] {"Hz", "KHz", "GHz"}));
		prefixSelect.setMaximumRowCount(3);
		prefixSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String prefix = prefixSelect.getSelectedItem().toString();
				
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
								.addComponent(lblFrequency)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(freqField))
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
								.addComponent(prefixSelect, 0, 0, Short.MAX_VALUE))
							.addGroup(gl_contentPanel.createSequentialGroup()
								.addComponent(num4)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num5)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(num6)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(numPeriod))))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFrequency)
						.addComponent(freqField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(prefixSelect, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
						freq = freqField.getText();
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	} 
	
}
