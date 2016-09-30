package com.tonyjs.usertypes;

@SuppressWarnings("serial")
/*
 * This abstract class consists of overridden methods in attempt to have
 * user-created data types. In implementing Comparable, the class
 * allows for user-created types to create Fractions and Mixed Numbers,
 * which extend this class and are compared via the overridden methods.
 */
public abstract class Num extends Number implements Comparable<Num>
{
	@Override
	public float floatValue()
	{
		return (float) Math.floor(this.doubleValue());
	}

	@Override
	public long longValue()
	{
		return (long) Math.floor(this.doubleValue());
	}

	@Override
	public int intValue()
	{
		return (int) Math.floor(this.doubleValue());
	}

	@Override
	public int compareTo(Num x)
	{
		if (this.doubleValue() < x.doubleValue()) {
			return -1;
		} else if (this.doubleValue() > x.doubleValue()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object c)
	{
		if (this instanceof Number) {
			return this.doubleValue() == ((Number) c).doubleValue();
		}
		return false;
	}
}
