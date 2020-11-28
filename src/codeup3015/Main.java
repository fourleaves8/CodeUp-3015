package codeup3015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		Collections.sort(students, Collections.reverseOrder());
		
		for (int i = 0; i < m; i++) {
			Student student = students.get(i);
			System.out.println(student.getName());
		}

	}

}
