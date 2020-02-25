package com.inti.formation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Timeout;


@TestInstance(Lifecycle.PER_CLASS)
class TestOpenClassApplicationTests {
	private Calculator c;
	public static  Instant startedAt;
	@BeforeAll
	public  void initStartingTime() {
	
		System.out.println("appel avant tous les tests");
		startedAt = Instant.now();
	}
//	@AfterAll
//	public static void showTestDuration() {
//		System.out.println("appel apres tous les tests");
//		Instant endedAt = Instant.now();
//		long duration = Duration.between(startedAt, endedAt).toMillis();
//		System.out.println(MessageFormat.format("durée des tests : {0} ms", duration));
//	}
	@BeforeEach
	public void initCalculator() {
		 c = new Calculator();
		 System.out.println("appel avant chaque test");
	}

		@Test
		void testAddTwoPositiveNumbers() {
			// Arrange
			int a = 2;
			int b = 3;
			
			// Act
			int somme = c.add(a, b);

			// Assert
			
			assertThat(somme).isEqualTo(5);
		}
		@Test
		 void muli(){
			int a = 4;
			int b = 5;
			
				
			int m = c.multiple(a, b);
			
			assertThat(m).isEqualTo(20);
			
		}
		@Test
		@Timeout(3)
		public void longCalcul() {
			c.longCalculation();
		}
		

	


}
