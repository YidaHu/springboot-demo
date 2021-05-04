package com.example.springbootjpa.repository;

import com.example.springbootjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.concurrent.Future;

/**
 * @program: springboot-proj
 * @description: 用户
 * @author: huyida
 * @create: 2021-04-23 00:20
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据 name 来查找 User
     *
     * @param name
     * @return
     */
    @Query("select u from User u where u.name = :name")
    Optional<User> findByNameCustomeQuery(@Param("name") String name);

    /**
     * User 部分属性查询
     *
     * @param id
     * @return
     */
    @Query("select u.name from User u where u.id = :id")
    String findUserNameById(@Param("id") Long id);

    /**
     * 根据 id 更新User name
     *
     * @param name
     * @param id
     */
    @Modifying
    @Query("update User u set u.name = ?1 where u.id = ?2")
    void updateUserNameById(String name, Long id);

    @Async
    Future<User> findByName(String name);

}
