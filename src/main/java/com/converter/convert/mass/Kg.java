package com.converter.convert.mass;

public class Kg {
	public double convert(String valueName, double value) {
		double result = 0;
		if(valueName.equals("kilo2")) result = value * 1;
		else if(valueName.equals("tonn2")) result = value * 1000;
		else if(valueName.equals("gramm2")) result = value * 0.001;
		else if(valueName.equals("stone2")) result = value * 0.157473;
		else if(valueName.equals("foont2")) result = value * 2.20462;
		return result;
	}
}
