package com.mukesh.main;

import java.util.Scanner;

import com.mukesh.addnumbers.AddNumbers;
import com.mukesh.chain.Chain;
import com.mukesh.dividenumbers.DivideNumbers;
import com.mukesh.multnumbers.MultNumbers;
import com.mukesh.numbers.Numbers;
import com.mukesh.subtractnumbers.SubtractNumbers;

public class App {
public static void main(String[] args) {
	Chain chainCalc1=new AddNumbers();
	Chain chainCalc2=new SubtractNumbers();
	Chain chainCalc3=new MultNumbers();
	Chain chainCalc4=new DivideNumbers();
	chainCalc1.setNextChain(chainCalc2);
	chainCalc2.setNextChain(chainCalc3);
	chainCalc3.setNextChain(chainCalc4);
	
	
	Numbers request= new Numbers(56,6,"mult");
	chainCalc1.calculate(request);
}
}
