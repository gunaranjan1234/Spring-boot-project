package com.example.demo;

import java.util.Objects;

public class User {
  private long Userid;
  private String email;
  private String password;
  public User(long Userid, String email, String password) {
      this.Userid = Userid;
      this.email = email;
      this.password = password;
  }

    public long getUserid() {
        return Userid;
    }

    public void setUserid(long userid) {
        Userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Userid == user.Userid && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Userid, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "Userid=" + Userid +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
