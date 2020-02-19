package com.qa.excersizes;

public class chickensAndRabbits {
	public void chickAndRabbits(int heads, int legs) {
//		int rabbit = (legs/2) - heads;
//		System.out.println(rabbit);
//		int chick = heads - rabbit;
//		System.out.println(chick);
		
		
		boolean solution = false;
		for(int i = 0; i<=heads;i++) {
			int r = heads -i;
			int c = i;
			if((r*4 + c*2)==legs) {
				System.out.println("rabbits:"+r);
				System.out.println("Chickens:"+c);
				solution=true;
			}
		}
	if(!solution) {
		System.out.println("No solution avaliable");
	}
	}

}
