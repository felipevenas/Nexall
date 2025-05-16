package com.unijorge.nexall.services;

import com.unijorge.nexall.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UserRepository userRepository;

    public Long createUser ()

}
