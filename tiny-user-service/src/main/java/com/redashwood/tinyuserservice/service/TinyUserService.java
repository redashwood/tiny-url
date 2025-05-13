package com.redashwood.tinyuserservice.service;

import com.redashwood.tinyuserservice.dto.TinyUserDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


public interface TinyUserService {

        public TinyUserDTO registerUser(TinyUserDTO tinyUserDTO);

        public TinyUserDTO getUserByUsername(String username);

        public TinyUserDTO updateUser(TinyUserDTO tinyUserDTO);

        public TinyUserDTO deleteUserByUsername(String username);
}
