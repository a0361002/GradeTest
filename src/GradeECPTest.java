import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeECPTest {
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
	void validTestA() {
		for(int score = 100; score >= 90; score--) {
			Assert.assertEquals('A', grade.letterGrade(score));
		}
	}
	@Test
	void validTestB() {
		for(int score = 89; score >= 80; score--) {
			Assert.assertEquals('B', grade.letterGrade(score));
		}
	}
	@Test
	void validTestC() {
		for(int score = 79; score >= 70; score--) {
			Assert.assertEquals('C', grade.letterGrade(score));
		}
	}
	@Test
	void validTestD() {
		for(int score = 69; score >= 60; score--) {
			Assert.assertEquals('D', grade.letterGrade(score));
		}
	}
	@Test
	void validTestF() {
		for(int score = 59; score >= 0; score--) {
			Assert.assertEquals('F', grade.letterGrade(score));
		}
	}
	@Test
	void invalidNegativeScoreTest() {
		Assert.assertEquals('X', grade.letterGrade(-1));
	}
	@Test
	void invalidPositiveScoreTest() {
		Assert.assertEquals('X', grade.letterGrade(101));
	}
}
