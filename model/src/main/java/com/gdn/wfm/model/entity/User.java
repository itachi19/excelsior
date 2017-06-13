package com.gdn.wfm.model.entity;

import javax.persistence.*;

/**
 * Created by ojha on 26/05/16.
 */
@Entity
@Table(name = User.USER_TABLE)
public class User {

  public static final String USER_TABLE = "users";
  private static final String USER_ID_SEQ = "user_id_seq";

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
  @SequenceGenerator(name = USER_ID_SEQ, sequenceName = "user_id_seq", allocationSize = 1)
  private long id;

  @Column(name = "user_name", nullable = false)
  private String userName;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "email", nullable = false)
  private String email;

  protected User() {}

  public User(String userName, String email) {
    this.userName = userName;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("id=").append(id);
    sb.append(", userName='").append(userName).append('\'');
    sb.append(", firstName='").append(firstName).append('\'');
    sb.append(", lastName='").append(lastName).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append('}');
    return sb.toString();
  }


}
