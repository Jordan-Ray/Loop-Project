package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

public class LoopPanel extends JPanel
{
	private JButton submitButton;
	private JScrollPane textPane;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	
	private LoopController baseController;
	
	
	public LoopPanel (LoopController baseController)
	{
		this.baseController = baseController;
		loopArea = new JTextArea(20, 20);
		textPane = new JScrollPane(loopArea);
		baseLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(textPane);
		
		this.setBackground(Color.CYAN);
		
		loopArea.setEditable(false);
		loopArea.setLineWrap(true);
		loopArea.setWrapStyleWord(true);
		
		submitButton = new JButton("CLICK ME!!");
		
		this.add(submitButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 108, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 75, SpringLayout.EAST, textPane);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopArea.append(baseController.getLoopResults());
			}
			
		});
	}
	
}
