package com.converter.convert.mass;

public class Foont {
	public double convert(String valueName, double value) {
		double result = 0;
		if(valueName.equals("kilo2")) result = value * 0.453592;
		else if(valueName.equals("tonn2")) result = value * 0.000453592;
		else if(valueName.equals("gramm2")) result = value * 453.592;
		else if(valueName.equals("stone2")) result = value * 0.0714286;
		else if(valueName.equals("foont2")) result = value * 1;
		return result;
	}
}
