package com.bl.measurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bridgelabz.measurement.Feet;
import com.bridgelabz.measurement.Inch;
import com.bridgelabz.measurement.Yard;

public class MeasurementTest {
	@Test
	public void given0Feetand0Feet_shouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assertions.assertEquals(feet1, feet2, "Assert Equal test failed! ");
	}
	
	@Test
	public void given0Feetand0Feet_shouldReturnNotEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assertions.assertNotEquals(feet1, feet2, "Assert Not Equal test failed! ");
	}
	
	@Test
	public void given0Inchand0Inch_shouldReturnEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assertions.assertEquals(inch1, inch2, "Assert Equal test failed!");
	}
	
	@Test
	public void given0Inchand0Inch_shouldReturnNotEqual() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(1.0);
		Assertions.assertNotEquals(inch1, inch2, "Assert Not Equal test failed!");
	}
	
	@Test
	public void given0Yardand0Yard_shouldReturnEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = new Yard(0.0);
		Assertions.assertEquals(yard1, yard2, "Assert Equal test failed!");
	}
	
	@Test
	public void given0Yardand0Yard_shouldReturnNotEqual() {
		Yard yard1 = new Yard(0.0);
		Yard yard2 = new Yard(1.0);
		Assertions.assertNotEquals(yard1, yard2, "Assert Not Equal test failed!");
	}
}
