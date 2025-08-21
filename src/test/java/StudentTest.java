import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

	@Test
	void testConstructorAndGetters() {
		Student student = new Student("Eve", 22, "S12345");
		assertEquals("Eve", student.getName());
		assertEquals(22, student.getAge());
		assertEquals("S12345", student.getStudentId());
	}

	@Test
	void testSetters() {
		Student student = new Student("Frank", 20, "S54321");
		student.setName("George");
		student.setAge(21);
		student.setStudentId("S98765");

		assertEquals("George", student.getName());
		assertEquals(21, student.getAge());
		assertEquals("S98765", student.getStudentId());
	}

	@Test
	void testToString() {
		Student student = new Student("Helen", 19, "S55555");
		String result = student.toString();

		assertTrue(result.contains("Helen"));
		assertTrue(result.contains("19"));
		assertTrue(result.contains("S55555"));
	}
}
