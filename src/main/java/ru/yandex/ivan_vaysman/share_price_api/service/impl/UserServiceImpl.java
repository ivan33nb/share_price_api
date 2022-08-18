package ru.yandex.ivan_vaysman.share_price_api.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.stereotype.Service;
import ru.yandex.ivan_vaysman.share_price_api.domain.model.User;
import ru.yandex.ivan_vaysman.share_price_api.repository.UserRepository;
import ru.yandex.ivan_vaysman.share_price_api.service.UserService;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public boolean existsUserByEmail(String email){
        return repository.findByEmail(email) != null;
    }

    @Override
    public void prepareUser(DefaultOidcUser defaultOidcUser){
        String email = defaultOidcUser.getEmail();

        if(!existsUserByEmail(email)){
            User user = new User();
            user.setEmail(email);
            user.setName(defaultOidcUser.getFamilyName() + " " + defaultOidcUser.getGivenName());
            user.setEmail_verified(defaultOidcUser.getEmailVerified());
            user.setLocale(defaultOidcUser.getLocale());

            repository.save(user);
        }
    }
}
