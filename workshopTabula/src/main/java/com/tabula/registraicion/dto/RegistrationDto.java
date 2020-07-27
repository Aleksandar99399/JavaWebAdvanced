package com.tabula.registraicion.dto;

import com.tabula.users.RoleEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class RegistrationDto {

    @NotNull
    @Email
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String repeatPassword;


}
