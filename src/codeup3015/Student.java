package codeup3015;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	private int id;

	public Student(String name, int score, int id) {
		this.name = name;
		this.score = score;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", id=" + id + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Student student) {
		return this.score == student.score ? 0 : this.score > student.score ? 1 : -1;
	}

}
