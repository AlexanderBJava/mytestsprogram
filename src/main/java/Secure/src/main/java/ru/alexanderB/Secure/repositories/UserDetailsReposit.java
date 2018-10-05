package ru.alexanderB.Secure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alexanderB.Secure.domain.UserG;

public interface UserDetailsReposit extends JpaRepository<UserG, String> {
}
