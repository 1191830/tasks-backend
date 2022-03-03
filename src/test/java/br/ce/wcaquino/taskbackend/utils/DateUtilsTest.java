package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class DateUtilsTest {
	
	@Test
	public void shouldReturnTrueForFutureDates() {
		LocalDate future = LocalDate.now();
		future = future.plusYears(10);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(future));		
	}
	
	@Test
	public void shouldReturnFalseForPriorDates() {
		LocalDate past = LocalDate.of(2010, 1, 1);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(past));
	}
	
	@Test
	public void shouldReturnTrueForPresentDate() {
		LocalDate now = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(now));
	}

}
