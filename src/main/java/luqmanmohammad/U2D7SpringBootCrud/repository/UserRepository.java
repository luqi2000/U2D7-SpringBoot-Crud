package luqmanmohammad.U2D7SpringBootCrud.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import luqmanmohammad.U2D7SpringBootCrud.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID>{
}
