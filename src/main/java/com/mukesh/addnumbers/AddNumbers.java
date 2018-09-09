package com.mukesh.addnumbers;

import com.mukesh.chain.Chain;
import com.mukesh.numbers.Numbers;

public class AddNumbers implements Chain {
	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}

	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted()=="add") {
			System.out.println(request.getNumber1()+" + " +request.getNumber2()+" = "+(request.getNumber1()+request.getNumber2()));
		}
		else {
			nextInChain.calculate(request);
		}
	}

}
