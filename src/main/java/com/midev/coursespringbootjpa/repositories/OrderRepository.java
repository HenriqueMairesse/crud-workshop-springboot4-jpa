package com.midev.coursespringbootjpa.repositories;

import com.midev.coursespringbootjpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
