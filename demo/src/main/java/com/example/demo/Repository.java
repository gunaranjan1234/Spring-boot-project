package com.example.demo;

import org.springframework.jdbc.core.simple.JdbcClient;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    private JdbcClient jdbcClient;
    public Repository(JdbcClient jdbcClient)
    {
        this.jdbcClient = jdbcClient;
    }

    public List<Student> getAllStudents() {
        return jdbcClient.sql("SELECT * FROM student").query(
                (rs, rowNum) -> new Student(
                        rs.getString("Student_name"),
                        rs.getInt("Student_id"),
                        rs.getString("Student_address"),
                        rs.getLong("Student_phoneNo")
                        )
        ).list();
    }

    }
