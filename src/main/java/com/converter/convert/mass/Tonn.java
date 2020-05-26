package com.converter.convert.mass;

public class Tonn {
	public double convert(String valueName, double value) {
		double result = 0;
		if(valueName.equals("kilo2")) result = value * 1000;
		else if(valueName.equals("tonn2")) result = value * 1;
		else if(valueName.equals("gramm2")) result = value * 0.000001;
		else if(valueName.equals("stone2")) result = value * 157.473;
		else if(valueName.equals("foont2")) result = value * 2204.62199992473;
		return result;
	}
}
