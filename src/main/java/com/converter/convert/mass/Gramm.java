package com.converter.convert.mass;

public class Gramm {
	public double convert(String valueName, double value) {
		double result = 0;
		if(valueName.equals("kilo2")) result = value * 1000;
		else if(valueName.equals("tonn2")) result = value * 1000000;
		else if(valueName.equals("gramm2")) result = value * 1;
		else if(valueName.equals("stone2")) result = value * 0.000157472999994623537833;
		else if(valueName.equals("foont2")) result = value * 0.0022046219999247297465;
		return result;
	}
}
