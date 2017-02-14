package com.naver.wysohn2002.mythicmobcreator.main;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

public class PanelItem extends JPanel {
	private JTextField textField;
	
	private Component[] components;

	/**
	 * Create the panel.
	 */
	PanelItem(String key, Component... components) {
		setBackground(Color.LIGHT_GRAY);
		this.components = components;
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setLayout(new BorderLayout(5, 5));
		
		JPanel panelNorth = new JPanel();
		add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new GridLayout(0, 1, 5, 5));
		
		if(key != null){
			textField = new JTextField();
			textField.setDisabledTextColor(Color.WHITE);
			textField.setPreferredSize(new Dimension(30, 20));
			textField.setEditable(false);
			panelNorth.add(textField);
			textField.setColumns(10);
			textField.setText(key);
			textField.setFont(new Font("SansSeif", Font.BOLD, 14));
			textField.setForeground(Color.MAGENTA);
		}
		
		JPanel panelCenter = new JPanel();
		panelCenter.setMaximumSize(new Dimension(600, 32767));
		add(panelCenter, BorderLayout.CENTER);
		panelCenter.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));

		for(Component component : components){
			panelCenter.add(component);
		}
	}

	public Component[] getComponents() {
		return components;
	}

}
