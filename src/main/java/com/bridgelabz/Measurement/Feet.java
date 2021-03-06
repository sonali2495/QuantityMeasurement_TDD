package com.bridgelabz.measurement;

public class Feet {
	public double value;
	
	public Feet(double value) {
		this.value = value;
	}

	/**
	 * Purpose : Compare the Lengths in feet
	 * * @param that : Taking Lengths
     * @return : if Matches then returning Values
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feet feet = (Feet) obj;
		return Double.compare(feet.value, value) == 0;
	}
}
