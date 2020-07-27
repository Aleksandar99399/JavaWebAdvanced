package com.tabula.users;

import com.tabula.users.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private static final Logger LOGGER= LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    public UserEntity getOrCreateUser(String email){

        Objects.requireNonNull(email);

        Optional<UserEntity> opt= userRepository.findByEmail(email);



        return opt.orElseGet(()->createUser(email));
    }

    private UserEntity createUser(String email){
        LOGGER.info("Creating a new user with email [GDPR].");
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);

        RoleEntity userRole=new RoleEntity();
        userRole.setRole("ROLE_USER");
        userEntity.setRoles(List.of(userRole));

        return this.userRepository.save(userEntity);
    }
}
