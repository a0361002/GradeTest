import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBVATest {
	private Grade grade;
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
		grade = null;
	}

	@Test
	void MinScoreMinusOneTest() {
		Assert.assertEquals('X', grade.letterGrade(-1));
	}
	
	@Test
	void MinScoreTest() {
		Assert.assertEquals('F', grade.letterGrade(0));
	}
	
	@Test
	void MinScorePlusOneTest() {
		Assert.assertEquals('F', grade.letterGrade(1));
	}
	
	@Test
	void MaxScoreMinusOneTest() {
		Assert.assertEquals('A', grade.letterGrade(99));
	}
	
	@Test
	void MaxScoreTest() {
		Assert.assertEquals('A', grade.letterGrade(100));
	}
	
	@Test
	void MaxScorPlusOneTest() {
		Assert.assertEquals('X', grade.letterGrade(101));
	}

	@Test
	void inMaxMinScoreTest() {
		Assert.assertEquals('D', grade.letterGrade(60));
	}

}
