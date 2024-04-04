package org.main;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[7];

        double[] grades = new double[]{3.8, 1.6, 5.0, 4.1, 3.3, 2.8, 4.7};
        String[] names = new String[]{"Alex", "Matt", "Vasya", "Artyom", "Vlad", "Vanya", "Nikita"};

        for (int x = 0; x < grades.length; ++x) {
            students[x] = new Student(grades[x], names[x]);
        }


        for (int i = 0; i < grades.length; ++i) {
            for (int j = 1; j < grades.length; ++j) {
                if (students[j].AverageScore < students[j-1].AverageScore) {
                    Student tmp = students[j];

                    students[j] = students[j-1];
                    students[j-1] = tmp;
                }
            }

        }


        for (Student n: students) {
            System.out.println(n.AverageScore + ", " + n.name);
        }
    }
}