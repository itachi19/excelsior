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

  @Column(name = "job_id", nullable = false)
  private long jobId;


  protected User() {}

  public User(String userName, long jobId) {
    this.userName = userName;
    this.jobId = jobId;
  }



  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("id=").append(id);
    sb.append(", userName='").append(userName).append('\'');
    sb.append(", jobId='").append(jobId).append('\'');
    sb.append('}');
    return sb.toString();
  }


}
