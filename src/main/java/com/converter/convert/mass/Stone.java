package com.converter.convert.mass;

public class Stone {
	public double convert(String valueName, double value) {
		double result = 0;
		if(valueName.equals("kilo2")) result = value * 6.35029;
		else if(valueName.equals("tonn2")) result = value * 0.00635029;
		else if(valueName.equals("gramm2")) result = value * 6350.29;
		else if(valueName.equals("stone2")) result = value * 1;
		else if(valueName.equals("foont2")) result = value * 14;
		return result;
	}
}
