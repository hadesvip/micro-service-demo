package com.provider.dao;

import com.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by wangyong on 2017/8/20.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
