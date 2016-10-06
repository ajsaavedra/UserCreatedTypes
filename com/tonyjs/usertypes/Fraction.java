package com.tonyjs.usertypes;

@SuppressWarnings("serial")
/**
 * This class inherits from MixedNumber and is used to create fraction
 * representations by using the MixedNumber constructor. In order to compare 
 * fractions, we take their native double representations.
 * Using an overridden toString method, a fraction is printed as its
 * conventional representation, without its implicit 0 whole number.
 */
public class Fraction extends MixedNumber
{
	/**
	 * Calls the parent class' constructor to create a
	 * MixedNumber using zero as its implicit whole number
	 * 
	 * @param n This becomes the numerator.
	 * @param d This becomes the denominator
	 * 			which must be greater than 0
	 */
    public Fraction(int n, int d)
    {
        super(0, n, d);
    }
}