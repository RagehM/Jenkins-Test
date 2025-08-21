import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

	@Test
	void testConstructorAndGetters() {
		Person person = new Person("Alice", 25);
		assertEquals("Alice", person.getName());
		assertEquals(25, person.getAge());
	}

	@Test
	void testSetters() {
		Person person = new Person("Bob", 30);
		person.setName("Charlie");
		person.setAge(35);

		assertEquals("Charlie", person.getName());
		assertEquals(35, person.getAge());
	}

	@Test
	void testToString() {
		Person person = new Person("Diana", 40);
		String result = person.toString();

		assertTrue(result.contains("Diana"));
		assertTrue(result.contains("40"));
	}
}
