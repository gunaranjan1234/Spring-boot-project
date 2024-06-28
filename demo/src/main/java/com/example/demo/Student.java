package com.example.demo;

import java.util.Objects;

public class Student{
    private String name;
    private Integer id;
    private String address;
    private Long PhoneNo;

    public Student(){};

    public Student(String name, Integer id, String address, Long PhoneNo) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.PhoneNo = PhoneNo;
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

    public Long getPhoneNo() {
        return PhoneNo;
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

    public void setPhoneNo(Long phoneNo) {
        this.PhoneNo = phoneNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(address, student.address) && Objects.equals(PhoneNo, student.PhoneNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, address, PhoneNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + id +
                ", address='" + address + '\'' +
                ", phoneNo=" + PhoneNo +
                '}';
    }
}