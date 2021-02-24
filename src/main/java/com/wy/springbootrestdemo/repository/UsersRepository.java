package com.wy.springbootrestdemo.repository;

import com.wy.springbootrestdemo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author 来苏
 */
public interface UsersRepository extends JpaRepository<Users,Integer> {
}
