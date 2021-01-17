package model;

import java.util.ArrayList;

public abstract class Piece {

	protected String colour;
	protected String type;

	public Piece(String colour) {
		setColour(colour);
	}

	private void setColour(String colour) {
		if (colour != null && (colour == "Black" || colour == "White"))
			this.colour = colour;
		else
			System.out.println("invalid colour given");
	}

	public String getColour() {
		return colour;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Coordinate> getPossibleMoves(int currentRow, int currentColumn) {
		return null;
	}

}
