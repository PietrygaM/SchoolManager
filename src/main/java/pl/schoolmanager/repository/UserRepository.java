package pl.schoolmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.schoolmanager.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);

    User findOneByEmail(String username);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);

}
