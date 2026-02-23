package com.midev.coursespringbootjpa.repositories;

import com.midev.coursespringbootjpa.entities.OrderItem;
import com.midev.coursespringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
