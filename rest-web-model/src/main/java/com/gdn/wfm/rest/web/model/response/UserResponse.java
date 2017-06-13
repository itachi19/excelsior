package com.gdn.wfm.rest.web.model.response;

import com.gdn.wfm.rest.web.model.request.UserRequest;

import java.io.Serializable;

/**
 * Created by ojha on 28/05/16.
 */
public class UserResponse implements Serializable {

  private static final long serialVersionUID = 1;

  private boolean success;

  private UserRequest userRequest;

  public UserResponse(boolean success) {
    this.success = success;
  }

  public UserResponse(boolean success, UserRequest userRequest) {
    this.success = success;
    this.userRequest = userRequest;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public UserRequest getUserRequest() {
    return userRequest;
  }

  public void setUserRequest(UserRequest userRequest) {
    this.userRequest = userRequest;
  }
}
