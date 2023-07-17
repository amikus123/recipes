package com.amikus123.recipes.repository;
import com.amikus123.recipes.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom repository methods if needed
}
