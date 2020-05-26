package com.converter.convert;

import java.math.*;

import com.converter.convert.mass.*;

public class Mass {
	public double convert(String valueName1 , String valueName2, double value)  {
		Kg kg = new Kg();
		Tonn tonn = new Tonn();
		Gramm gramm = new Gramm();
		Stone stone = new Stone();
		Foont foont = new Foont();
		double preResult = 0;
		if(valueName1.equals("kilo1")) preResult = kg.convert(valueName2, value);
		else if(valueName1.equals("tonn1")) preResult = tonn.convert(valueName2, value);
		else if(valueName1.equals("gramm1")) preResult = gramm.convert(valueName2, value);
		else if(valueName1.equals("stone1")) preResult = stone.convert(valueName2, value);
		else if(valueName1.equals("foont1")) preResult = foont.convert(valueName2, value);
		double result = new BigDecimal(preResult).setScale(3, RoundingMode.UP).doubleValue();
		return result;
	}
}
