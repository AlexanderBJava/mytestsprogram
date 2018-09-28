package ru.alexanderB.Secure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexanderB.Secure.domain.User;

public interface UserDetailsReposit extends JpaRepository<User, String> {
}
