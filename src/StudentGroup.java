import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try {
			if (students == null)
				throw new IllegalArgumentException();
			for (int i = 0; i < students.length-1; i++)
				this.students[i] = students[i];
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException();
			return students[index];
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try {
			if (student == null && (index < 0 || index >= students.length))
				throw new IllegalArgumentException();
			students[index] = student;
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		try {
			if (student == null)
				throw new IllegalArgumentException();
			for (int i = students.length-1; i > 0; i--)
				students[i+1] = students[i];
			students[0] = student;
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try {
			if (student == null)
					throw new IllegalArgumentException();
			students[students.length] = student;
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try {
			if (student == null && (index < 0 || index >= students.length))
				throw new IllegalArgumentException();
			students[index] = student;
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		/*try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException();
			for (int i = index; i < students.length-1; i++) {
				students[i] = students[i + 1];
			}
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}*/
		try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException();
			
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int flag = 0;
		try {
			if (student == null)
				throw new IllegalArgumentException(); 
			for (int i = 0; i < students.length-1; i++) {
			    if (students[i] == student) {
				    remove(i);
			 	    flag = 1;
				    break;
			    }
		    }
			if (flag == 0)
				throw new IllegalArgumentException("Student not exist"); 
	    }
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException(); 
			for (int i = index; i < students.length; i++)
				remove(i);
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int index = 0;
		try {
			if (student == null)
				throw new IllegalArgumentException(); 
			for (int i = 0; i < students.length; i++) {
				if (students[i] == student) {
					index = i + 1;
					break;
				}
			}
			for (int i = index; i < students.length; i++)
				remove(i);
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		try {
			if (index < 0 || index >= students.length)
				throw new IllegalArgumentException(); 
			for (int i = 0; i < index; i++)
				remove(i);
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index = 0;
		try {
			if (student == null)
				throw new IllegalArgumentException(); 
			for (int i = 0; i < students.length; i++) {
				if (students[i] == student) {
					index = i + 1;
					break;
				}
			}
			for (int i = 0; i < index; i++)
				remove(i);
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student temp;
		for (int i = 0; i < students.length; i++) {
			for (int j = i+1; j < students.length; j++) {
				if (students[i].getId() > students[j].getId()) {
					temp = students[i];
					students[i] = students[j];
					students[j] = temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		try {
			if (date == null)
				throw new IllegalArgumentException();
			Student[] arr = new Student[students.length];
			int j = 0;
			for (int i = 0; i < students.length; i++) {
				if (students[i].getBirthDate() == date) {
					arr[j] = students[i];
					j++;
				}
			}	
		}
		catch(IllegalArgumentException e) {
			e.getStackTrace();
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
