package ru.yandex.ivan_vaysman.share_price_api.service;

import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.User;

public interface UserService {
    User save(User user);
    boolean existsUserByEmail(String email);
    void prepareUser(DefaultOidcUser defaultOidcUser);
}
