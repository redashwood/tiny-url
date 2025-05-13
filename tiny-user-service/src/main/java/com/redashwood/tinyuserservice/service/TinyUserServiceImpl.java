package com.redashwood.tinyuserservice.service;

import com.redashwood.tinyuserservice.dto.TinyUserDTO;
import com.redashwood.tinyuserservice.mapper.TInyUserDocumentMapper;
import com.redashwood.tinyuserservice.mapper.TinyUserDTOMapper;
import com.redashwood.tinyuserservice.repository.TinyUserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
public class TinyUserServiceImpl implements TinyUserService {

    private final TinyUserRepository tinyUserRepository;

    public TinyUserServiceImpl(TinyUserRepository tinyUserRepository) {
        this.tinyUserRepository = tinyUserRepository;
    }

    @Override
    public TinyUserDTO registerUser(TinyUserDTO tinyUserDTO) {

        var tinyUserDocument = TInyUserDocumentMapper.toTinyUserDocument(tinyUserDTO);
        tinyUserDocument.setUserId(UUID.randomUUID());

        tinyUserRepository.save(tinyUserDocument);
        log.info("The user with username: {} is registered with id:{} successfully.", tinyUserDTO.getUserName(),
                tinyUserDocument.getUserId());
        return tinyUserDTO;
    }

    @Override
    public TinyUserDTO getUserByUsername(String username) {

        var tinyUserDocument = tinyUserRepository.findByCredentialsUsername(username);
        log.info("The user with username: {} is found.", username);
        if (tinyUserDocument == null) {
            //TODO: throw data not found exception
        }

        var tinyUserDTO = TinyUserDTOMapper.toTinyUserDTO(tinyUserDocument);
        return tinyUserDTO;
    }

    @Override
    public TinyUserDTO updateUser(TinyUserDTO tinyUserDTO) {
        return null;
    }

    @Override
    public TinyUserDTO deleteUserByUsername(String username) {
        return null;
    }
}
