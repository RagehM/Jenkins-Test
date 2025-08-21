public class Student extends Person {
		private String studentId;

		public Student(String name, int age, String studentId) {
				super(name, age);
				this.studentId = studentId;
		}

		public String getStudentId() {
				return studentId;
		}

		public void setStudentId(String studentId) {
				this.studentId = studentId;
		}

		@Override
		public String toString() {
				return "Student{" +
								"name='" + getName() + '\'' +
								", age=" + getAge() +
								", studentId='" + studentId + '\'' +
								'}';
		}
}
