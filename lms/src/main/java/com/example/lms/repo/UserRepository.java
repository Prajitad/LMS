package com.example.lms.repo;

import com.example.lms.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(
            nativeQuery = true,
            value = "select * from users where user_name=?1"
    )
    User getUserByUserName(String userName);
}