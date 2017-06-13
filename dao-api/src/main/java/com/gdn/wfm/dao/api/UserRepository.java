package com.gdn.wfm.dao.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdn.wfm.model.entity.User;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by ojha on 26/05/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

  @Query(value="")
  List<User> getAllUsersInJob();
}

