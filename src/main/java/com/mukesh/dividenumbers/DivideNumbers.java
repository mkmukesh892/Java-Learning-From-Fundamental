package com.mukesh.dividenumbers;

import com.mukesh.chain.Chain;
import com.mukesh.numbers.Numbers;

public class DivideNumbers implements Chain {

	private Chain nextInChain;
	public void setNextChain(Chain nextChain) {
		this.nextInChain=nextChain;
		
	}

	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted()=="div") {
			System.out.println(request.getNumber1()+" / " +request.getNumber2()+" = "+(request.getNumber1()/request.getNumber2()));
		}
		else {
			System.out.println("this is working for only add,subtract,mult and divide");
		}
	}

}
