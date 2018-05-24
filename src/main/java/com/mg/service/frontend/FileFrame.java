package com.mg.service.frontend;

import com.mg.service.backend.model.Memory;
import org.testng.collections.Lists;

import javax.swing.*;
import java.awt.*;

public class FileFrame extends JFrame {

	private com.mg.service.frontend.FilePanel filePanel;

	public FileFrame(com.mg.service.frontend.FilePanel filePanel) {
		this.filePanel = filePanel;
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Liste des Mémoires");
		setBackground(new Color(255, 255, 255));
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGap(0, 599, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addGap(0, 523, Short.MAX_VALUE)
		);
		this.getContentPane().add(filePanel);
		pack();

	}

	public static void main(String args[]) {
		/* Create and display the form */
		EventQueue.invokeLater(() -> {
			new FileFrame(new FilePanel(Lists.newArrayList(new Memory()))).setVisible(true);
		});
	}

}
