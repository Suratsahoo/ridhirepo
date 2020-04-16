package home.prac.usingnew;

import home.prac.inherit.OldCalculator;

public class NewCalculator extends OldCalculator {
	public double power(double num)
	{
		return Math.pow(num, 2);
	}

}
