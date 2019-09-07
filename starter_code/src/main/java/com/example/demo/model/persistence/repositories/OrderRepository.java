package com.example.demo.model.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.persistence.UserEntity;
import com.example.demo.model.persistence.UserOrder;

/**
 * @author Nishant
 *
 */
public interface OrderRepository extends JpaRepository<UserOrder, Long> {
	List<UserOrder> findByUser(UserEntity user);
}
