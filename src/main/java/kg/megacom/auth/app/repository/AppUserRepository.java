package kg.megacom.auth.app.repository;

import kg.megacom.auth.app.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {

}
