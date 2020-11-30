package codeup3015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String printInfo = sc.nextLine();
		int n = Integer.parseInt(printInfo.split(" ")[0]);
		int m = Integer.parseInt(printInfo.split(" ")[1]);

		for (int i = 1; i <= n; i++) {
			String studentInfo = sc.nextLine();
			String name = studentInfo.split(" ")[0];
			int score = Integer.parseInt(studentInfo.split(" ")[1]);
			int id = i;

			students.add(new Student(name, score, id));

		}
		sc.close();
		Comparator<Student> compareStudents = new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				if (s1.getScore() == s2.getScore()) {
					return (s1.getId() > s2.getId() ? 1 : -1);
				}
				return (s1.getScore() > s2.getScore() ? 1 : -1) * -1;
			}

		};

		Collections.sort(students, compareStudents);

		for (int i = 0; i < m; i++) {
			Student student = students.get(i);
			System.out.println(student.getName());
		}

	}

}

class Student {
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

}
