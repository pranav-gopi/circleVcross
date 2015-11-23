package com.pranav.game.model;

import com.pranav.game.util.StateUtil;

public class State {
	
	private int id;
	
	private byte cell0;
	private byte cell1;
	private byte cell2;
	private byte cell3;
	private byte cell4;
	private byte cell5;
	private byte cell6;
	private byte cell7;
	private byte cell8;
	
	private int weight;
	
	private int length;
	
	private long wins;
	
	private long losses;

	public State() {
		super();
	}
	
	public State(int id, int length) {
		super();
		this.id = id;
		this.length = length;
		byte[] boardStates = StateUtil.getBoardState(id, CellState.size(), length);
		cell0=boardStates[0];
		cell1=boardStates[1];
		cell2=boardStates[2];
		cell3=boardStates[3];
		cell4=boardStates[4];
		cell5=boardStates[5];
		cell6=boardStates[6];
		cell7=boardStates[7];
		cell8=boardStates[8];
 		this.weight = StateUtil.getWeight(boardStates);
	}

	public byte[] getCellStates(){
		byte[] cellStates = new byte[length];
		cellStates[0]=cell0;
		cellStates[1]=cell1;
		cellStates[2]=cell2;
		cellStates[3]=cell3;
		cellStates[4]=cell4;
		cellStates[5]=cell5;
		cellStates[6]=cell6;
		cellStates[7]=cell7;
		cellStates[8]=cell8;
		return cellStates;
	}
	
	public int getId() {
		return id;
	}

	public int getLength() {
		return length;
	}

	public long getLosses() {
		return losses;
	}

	public int getWeight() {
		return weight;
	}

	public long getWins() {
		return wins;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setLosses(long losses) {
		this.losses = losses;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setWins(long wins) {
		this.wins = wins;
	}

	public byte getCell1() {
		return cell1;
	}

	public void setCell1(byte cell1) {
		this.cell1 = cell1;
	}

	public byte getCell2() {
		return cell2;
	}

	public void setCell2(byte cell2) {
		this.cell2 = cell2;
	}

	public byte getCell3() {
		return cell3;
	}

	public void setCell3(byte cell3) {
		this.cell3 = cell3;
	}

	public byte getCell4() {
		return cell4;
	}

	public void setCell4(byte cell4) {
		this.cell4 = cell4;
	}

	public byte getCell5() {
		return cell5;
	}

	public void setCell5(byte cell5) {
		this.cell5 = cell5;
	}

	public byte getCell6() {
		return cell6;
	}

	public void setCell6(byte cell6) {
		this.cell6 = cell6;
	}

	public byte getCell7() {
		return cell7;
	}

	public void setCell7(byte cell7) {
		this.cell7 = cell7;
	}

	public byte getCell8() {
		return cell8;
	}

	public void setCell8(byte cell8) {
		this.cell8 = cell8;
	}

	public byte getCell0() {
		return cell0;
	}

	public void setCell0(byte cell0) {
		this.cell0 = cell0;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", cell0=" + cell0 + ", cell1=" + cell1 + ", cell2=" + cell2 + ", cell3=" + cell3 + ", cell4=" + cell4
				+ ", cell5=" + cell5 + ", cell6=" + cell6 + ", cell7=" + cell7 + ", cell8=" + cell8 
				+ ", weight=" + weight + ", length=" + length + ", wins=" + wins + ", losses=" + losses + "]";
	}

	
	
	
}
