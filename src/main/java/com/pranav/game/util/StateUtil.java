package com.pranav.game.util;

import com.pranav.game.model.CellState;
import com.pranav.game.model.State;

public class StateUtil {

	public static int getWeight(byte[] cellValues) {
		int nonEmptyCells = 0;
		for(byte byte1:cellValues){
			if(CellState.valueOf(byte1) != CellState._){
				nonEmptyCells++;
			}
		}
		return nonEmptyCells;
	}
	
	public static long generateId(byte[] boardState, int radix){
		long val = 0;
		for(byte byte1:boardState){
			int cellValue = CellState.valueOf(byte1).getVal();
			val *= radix;
			val += cellValue;
		}
		return val;
	}
	
	public static byte[] getBoardState(long id, int radix, int length){
		int i=length;
		byte[] boardState = new byte[length];
		while(id>0 && i>=0){
			byte byte1 =(byte) (id%radix); 
			boardState[--i] = byte1;
			id/=radix;
		}
		
		for(--i;i>=0;--i){
			boardState[i]=0;
		}
		return boardState;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			State state = new State(i, 9);
			System.out.println(state);
		}
	}

	
}
