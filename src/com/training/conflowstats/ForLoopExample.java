package com.training.conflowstats;

public class ForLoopExample extends Object {
	
	public void hello() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

	public void exampleBreak() {
		for(int i=0;i<5;i++) {
			if(i == 3) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		ForLoopExample fle = new ForLoopExample();
		//fle.hello();
		fle.exampleBreak();
		
	}

}
