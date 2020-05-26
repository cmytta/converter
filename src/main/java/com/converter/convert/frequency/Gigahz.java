package com.converter.convert.frequency;

public class Gigahz {
	public double convert(String valueName, double value) {
		double result = 0;
		if (valueName.equals("hz2")) result = value * 1000000000;
		else if (valueName.equals("khz2"))	result = value * 0.000001;
		else if (valueName.equals("mghz2")) result = value * 0.001;
		else if (valueName.equals("gigahz2")) result = value * 1;
		return result;
	}
}
