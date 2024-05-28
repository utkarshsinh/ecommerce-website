package com.educative.ecommerce.repository;

import com.educative.ecommerce.model.Order;
import com.educative.ecommerce.model.OrderItem;
import com.educative.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {

}