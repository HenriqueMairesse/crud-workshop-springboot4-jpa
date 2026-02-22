package com.midev.coursespringbootjpa.repositories;

import com.midev.coursespringbootjpa.entities.Category;
import com.midev.coursespringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
