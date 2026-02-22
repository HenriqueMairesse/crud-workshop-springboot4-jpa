package com.midev.coursespringbootjpa.repositories;

import com.midev.coursespringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
