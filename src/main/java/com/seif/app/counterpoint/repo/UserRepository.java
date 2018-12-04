package com.seif.app.counterpoint.repo;

import com.seif.app.counterpoint.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kayvon on 12/3/18.
 *
 */
public interface UserRepository extends CrudRepository<User, Integer> {}