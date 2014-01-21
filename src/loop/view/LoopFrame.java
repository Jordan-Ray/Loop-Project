package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

public class LoopFrame extends JFrame
{
	private LoopController baseController;
	private LoopPanel basePanel;
	
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new LoopPanel(baseController);
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	
}
