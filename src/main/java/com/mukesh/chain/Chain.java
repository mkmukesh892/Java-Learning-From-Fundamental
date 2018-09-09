package com.mukesh.chain;

import com.mukesh.numbers.Numbers;

public interface Chain {
public void setNextChain(Chain nextChain);
public void calculate(Numbers request);
}
