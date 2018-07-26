package mineSweeper;

import javafx.scene.control.Button;

public class MineSweeperButton extends Button{

	private boolean isSelected = false;
	private boolean isBomb = false;
	private int neighbours = 0;
	public boolean isSelected() {
		return isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	public boolean isBomb() {
		return isBomb;
	}
	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}
	public int getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(int neighbours) {
		this.neighbours = neighbours;
	}
	
	public String getDisplay()
	{
		if(!this.isSelected)
		{
			return "";
		}
		else if(this.isBomb)
		{
			return "B";
		}
		else
		{
			return ((Integer)this.neighbours).toString();
		}
	}
	
	
}
