package com.rentalHotel.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rentalHotel.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
