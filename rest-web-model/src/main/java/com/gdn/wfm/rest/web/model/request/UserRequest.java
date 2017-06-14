package com.gdn.wfm.rest.web.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * Created by ojha on 28/05/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRequest implements Serializable {
  // TODO: Create a base request class for common parameters.

  private static final long serialVersionUID = 1;

  private String userName;
  private long jobId;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public long getJobId() {
    return jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }

  /**
   * default constructor.
   */
  public UserRequest() {}

  public UserRequest(String userName, long jobId) {
    this.userName = userName;
    this.jobId = jobId;
  }


}
