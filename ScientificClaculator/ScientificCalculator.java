package com.src.java.scientific.calc;

import java.util.Scanner;

public class ScientificCalculator extends BaseClass {

	
	public static void main(String args[])
	{
		
		System.out.println(" Scientific Calculator");
		System.out.println("---------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation that you want to perfom");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			SumClass sum=new SumClass();
			sum.additionOperation();
			break;
			
		case 2:
			SubtractionClass sub=new SubtractionClass();
			sub.subtractionMethod();
			break;
			
		case 3:
			MultiplicationClass mc=new MultiplicationClass();
			mc.multiplicationMethod();
			break;
			
		case 4:
			DivisionClass dm=new DivisionClass();
			dm.divisionMethod();
			break;
			
		case 5:
			SquareRootClass srt=new SquareRootClass();
			srt.squareRootMethod();
			break;
			
		case 6:
			CubeRootClass crc=new CubeRootClass();
			crc.cubeRootMethod();
			break;
			
		case 7:
			SinClass sin=new SinClass();
			sin.sinMethod();
			break;
			
		case 8:
			CosClass cc=new CosClass();
			cc.cosMethod();
			break;
			
		case 9:
			TanClass tc=new TanClass();
			tc.tanMethod();
			break;
			
        default:
          System.out.println("Input no corresponding operation, please re-enter");
       }
		
	}
}
