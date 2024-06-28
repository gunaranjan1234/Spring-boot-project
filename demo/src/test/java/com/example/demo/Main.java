package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

 @RestController
public class Main {

    private static List<Student> student;

    static {
        student = new ArrayList<>();
        Student gugan=new Student("gugan",20,"Kovai",12);
        Student pradeesh=new Student("pradeesh",20,"Salem",12);
        student.add(gugan);
        student.add(pradeesh);
    }

    public  static void main(String[] args)
    {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("api/v1/student")
    public List<Student> getStudent() {
        return student;
    }

    static class Student{
        private String name;
        private Integer id;
        private String address;
        private Integer standard;

        public Student(){};

        public Student(String name, Integer id, String address, Integer standard) {
            this.name = name;
            this.id = id;
            this.address = address;
            this.standard = standard;
        }

        public String getName() {
            return name;
        }

        public Integer getId() {
            return id;
        }

        public String getAddress() {
            return address;
        }

        public Integer getStandard() {
            return standard;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setStandard(Integer standard) {
            this.standard = standard;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(address, student.address) && Objects.equals(standard, student.standard);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id, address, standard);
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + id +
                    ", address='" + address + '\'' +
                    ", standard=" + standard +
                    '}';
        }
    }

}

