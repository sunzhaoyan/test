package com.test.interfaces;

public class InterfaceInnerInterfaceTest implements InterfaceInnerInterface{

	@Override
	public void print() {
		
	}
	
	static class Test implements InterfaceInnerInterface.InnerInterface {

		@Override
		public void print() {
			
		}
		
	}

}
