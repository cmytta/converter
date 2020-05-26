package com.converter.convert;

import java.math.*;

import com.converter.convert.frequency.*;

public class Frequency {
	public double convert(String valueName1 , String valueName2, double value) {
		Hz hz = new Hz();
		Khz khz = new Khz();
		Mghz mghz = new Mghz();
		Gigahz gigahz = new Gigahz();
		double preResult = 0;
		if (valueName1.equals("hz1")) preResult = hz.convert(valueName2, value);
		else if (valueName1.equals("khz1"))	preResult = khz.convert(valueName2, value);
		else if (valueName1.equals("mghz1")) preResult = mghz.convert(valueName2, value);
		else if (valueName1.equals("gigahz1")) preResult = gigahz.convert(valueName2, value);
		double result = new BigDecimal(preResult).setScale(3, RoundingMode.UP).doubleValue();
		return result;
	}
}
