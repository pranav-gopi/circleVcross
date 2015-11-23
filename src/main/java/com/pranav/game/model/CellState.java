package com.pranav.game.model;

public enum CellState {
	_(0), O(1), X(2);
	
	private int val;
	
	CellState(int val){
		this.val = val;
	}
	
	public int getVal(){
		return this.val;
	}
	
	public static CellState valueOf(char ch){
		String str = String.valueOf(ch);
		return CellState.valueOf(str);
	}
	
	public static CellState valueOf(byte byte1){
		switch(byte1){
			case 0:return _;
			case 1: return O;
			case 2: return X;
			default: return _;
		}
	}
	
	public static int size(){
		return 3;
	}
}
