package com.bl.Measurement;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.Measurement.Feet;

public class MeasurementTest {
	@Test
	public void given0Feetand0Feet_shouldReturnEqual() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}
}
