package com.codegym.model.user;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String username;
  private String password;
  private String dateOfBirth;
  private String email;
  private String phoneNumber;
  private String wall;
  private Boolean gender;
  private String address;
  private String avatar = "https://phongreviews.com/wp-content/uploads/2022/11/avatar-facebook-mac-dinh-15.jpg";
  @ManyToMany(fetch = FetchType.EAGER)
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public Integer getId() {
    return id;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public User(String name, String username, String password, String email) {
    this.name = name;
    this.username = username;
    this.password = password;
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getWall() {
    return wall;
  }

  public void setWall(String wall) {
    this.wall = wall;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getGender() {
    return gender;
  }

  public void setGender(Boolean gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}
