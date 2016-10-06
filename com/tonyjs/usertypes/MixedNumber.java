package com.tonyjs.usertypes;

@SuppressWarnings("serial")
/**
 * This class inherits from Num and is used to create mixed 
 * number representations. Casting it to double yields its 
 * numerical representation needed to compare them in the Num
 * class. Overriding the toString method will print its 
 * conventional representation
 */
public class MixedNumber extends Num
{
    private int wholeNumber, numerator, denominator;

	/**
	 * This creates a mixed number using three given numbers
	 * to create a value consisting of an integer and a proper fraction.
	 * 
	 * This throws an exception if the denominator is not greater than 0.
	 * 
	 * @param wholeNumber 	Becomes the whole number representation
	 * @param numerator 	This is the fraction's numerator
	 * @param denominator	The fraction's nonzero denominator
	 */
    public MixedNumber(int wholeNumber, int numerator, int denominator) throws IllegalArgumentException
    {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator should be greater than 0.");
        }
        
        this.wholeNumber = wholeNumber;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    @Override
    public double doubleValue()
    {
        return (double) wholeNumber + ((double) numerator / (double) denominator);
    }
    
    @Override
    public String toString()
    {
        if (wholeNumber == 0) {
            return numerator + "/" + denominator;
        }
        return wholeNumber + " " + numerator + "/" + denominator;
    }
}
