package com.lambton;

import com.lambton.faculty.Faculty;
import com.lambton.person.Person;
import com.lambton.student.Student;

public class MyMain {
    public static void main(String[] args) {
        Person p1;
        Student s1 = new Student(1,"Nikita","Female","MADT", "Lambton",75);

        Faculty f1 = new Faculty(1,"Pritesh","Male","Professor",10000);

        PartTimeStudent ps1 = new PartTimeStudent(1,"Nikita","Female","MADT","Lambton",
                75, 100);

        p1 = s1;
        p1.display();

        p1=ps1;
        p1.display();

        System.gc();
    }
}
