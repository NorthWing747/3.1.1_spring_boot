package org.example.usercrudapp.repository;

import org.example.usercrudapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA автоматически предоставит базовые CRUD-методы
}