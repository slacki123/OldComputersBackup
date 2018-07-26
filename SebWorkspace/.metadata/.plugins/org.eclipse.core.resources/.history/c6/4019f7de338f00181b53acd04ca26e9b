package mineSweeper;

import java.util.Random;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MineSweeperGrid {

	private GridPane bombLayout;
	private int size;
	private int numberOfBombs;
	public MineSweeperGrid(int size,int noOfBombs)
	{
		this.size = size;
		this.numberOfBombs = noOfBombs;
		this.bombLayout = new GridPane();
		this.setupGrid();
	}
	
	private void setupGrid()
	{
		for(int i = 0;i<size;i++)
		{
			for (int j = 0;j<size;j++)
			{
				MineSweeperButton square = new MineSweeperButton();
				square.setMaxSize(40, 40);
				square.setMinSize(40,40);
				square.setText(square.getDisplay());
				square.setOnAction(e->handleButtonAction(square));
				bombLayout.add(square, j, i);
			}
		}
		int counter = 0;
		Random randomGenerator = new Random();
		while(counter<this.numberOfBombs)
		{
			int position = randomGenerator.nextInt(this.size*this.size);
			if(!((MineSweeperButton)this.bombLayout.getChildren().get(position-1)).isBomb())
			{
				((MineSweeperButton)this.bombLayout.getChildren().get(position-1)).setBomb(true);
				counter++;
			}
		}
		this.calculateNeighbours();
		
		
	}
	
	public void handleButtonAction(MineSweeperButton msb) {
		msb.setSelected(true);
		msb.setText(msb.getDisplay());
		if(msb.isBomb())
		{
			for(Node n:this.bombLayout.getChildren())
			{
				n.setDisable(true);
			}
		}
	}

	public GridPane getBombLayout() {
		return bombLayout;
	}
	
	public void calculateNeighbours()
	{
		for(Node b:this.bombLayout.getChildren())
		{
			int buttonPos = this.bombLayout.getChildren().indexOf(b);
			int bombs = 0;
			
			if(buttonPos-size-1>0)
				if(buttonPos%size!=0)
				{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos-size-1)).isBomb())
				{
					bombs++;
				}
				}
			
			
			if(buttonPos-size>0)
			{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos-size)).isBomb())
				{
					bombs++;
				}
			}
			
			if(buttonPos-size+1>0)
			{
				if((buttonPos+1)%size!=0)
				{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos-size+1)).isBomb())
				{
					bombs++;
				}
				}
			}
			
			if(buttonPos%size!=0)
			{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos-1)).isBomb())
				{
					bombs++;
				}
			}
			if((buttonPos+1)%size!=0)
			{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos+1)).isBomb())
				{
					bombs++;
				}
			}
			if(buttonPos+size-1<(size*size))
			{
				if(buttonPos%size!=0)
				{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos+size-1)).isBomb())
				{
					bombs++;
				}
				}
			}
			if(buttonPos+size<(size*size))
			{
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos+size)).isBomb())
				{
					bombs++;
				}
			}
			if(buttonPos+size+1<(size*size))
			{
				if((buttonPos+1)%size!=0)
				{
					
				
				if(((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos+size+1)).isBomb())
				{
					bombs++;
				}
			}
			}
			((MineSweeperButton)this.bombLayout.getChildren().get(buttonPos)).setNeighbours(bombs);
		}
	}
	
	
	
}
