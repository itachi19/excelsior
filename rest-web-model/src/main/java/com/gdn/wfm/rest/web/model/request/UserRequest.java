package com.gdn.wfm.rest.web.model.request;

import java.io.Serializable;

/**
 * Created by ojha on 28/05/16.
 */
public class UserRequest implements Serializable {
  // TODO: Create a base request class for common parameters.

  private static final long serialVersionUID = 1;

  private String userName;
  private String firstName;
  private String lastName;
  private String email;

  /**
   * default constructor.
   */
  public UserRequest() {}

  public UserRequest(String userName, String email) {
    this.userName = userName;
    this.email = email;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
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

  public void setEmail(String email) {
    this.email = email;
  }
}
