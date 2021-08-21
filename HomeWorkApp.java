package ru.geekbrains.j1l5;

public class HomeWorkApp {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];

        employee[0] = new Employee("Ivan Ivanov", "manager", "ivanov@job.com", 89889889898L, 100.50f, 36);
        employee[1] = new Employee("Petr Petrov", "HR", "petrov@job.com", 89887887878L, 120.80f, 41);
        employee[2] = new Employee("Anastasiya Sidorenko", "QA-engineer", "sidorenko@job.com", 89886886868L, 130.20f, 25);
        employee[3] = new Employee("Denis Denisov", "director", "denisovthebigboss@job.com", 89999999999L, 150000.00f, 51);
        employee[4] = new Employee("Vasya Pupkin", "junior javabasicrubycobol-engineer", "justvasya@job.com", 89617523408L, 49.99f, 17);

        for(int i = 0; i < employee.length; i++) {
            if(employee[i].getAge() > 40) {
                employee[i].info();
            }
        }


    }
}
