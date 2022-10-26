package org.example;

import java.util.*;

public class Queue {
    public static void main(String[] args){
        PriorityQueue<Student> priorityQueue = new
                PriorityQueue<Student>(5, new StudentComparator());

        Student student1 = new Student("Nandini", "Anerov", "Zelenograd", 3.2, 10);
        Student student2 = new Student("Anmol", "Spronov", "Moscow", 4.0, 15);
        Student student3 = new Student("Palak", "Svistov", "Rostov", 3.8, 17);
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);

        System.out.println("Список клиентов: ");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().getName());
        }
    }
}

class StudentComparator implements Comparator<Student>{

    public int compare(Student s1, Student s2) {
        if (s1.time < s2.time)
            return -1;
            else if (s1.time > s2.time)
            return 1;
        else if (s1.time == s2.time)
            if (s1.distance < s2.distance) {
                return 1;
            }
            else if (s1.distance > s2.distance) {
                return -1;
            }
        return 0;
    }
}

class Student {
    public String name;
    public String surname;
    public String city;
    public double distance;
    public double time;

    public Student(String name, String surname, String city, double distance, double time) {

        this.name = name;
        this.surname = surname;
        this.city = city;
        this.distance = distance;
        this.time = time;
    }

    public String getName() {
        return name + " " + city;
    }
}