package ru.yandex.ivan_vaysman.share_price_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
