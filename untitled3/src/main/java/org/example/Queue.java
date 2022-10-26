package org.example;

import java.util.*;
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
    public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue = new
                PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.time < o2.time)
                    return -1;
                else if (o1.time > o2.time)
                    return 1;
                else if (o1.time == o2.time)
                    if (o1.distance < o2.distance) {
                        return 1;
                    } else if (o1.distance > o2.distance) {
                        return -1;
                    }
                return 0;
            }
        });

        Student student1 = new Student("Vlad", "Anerov", "Zelenograd", 3.2, 10);
        Student student2 = new Student("Alexander", "Spronov", "Moscow", 4.0, 11);
        Student student3 = new Student("Dmitriy", "Svistov", "Rostov", 3.8, 12);
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);

        System.out.println("Список клиентов: ");

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll().getName());
        }
    }
    }