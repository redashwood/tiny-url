package com.redashwood.tinyuserservice.controller;

import com.redashwood.tinyuserservice.dto.TinyUserDTO;
import com.redashwood.tinyuserservice.service.TinyUserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class TinyUserController {

    private final TinyUserService tinyUserService;

    public TinyUserController(TinyUserService tinyUserService) {
        this.tinyUserService = tinyUserService;
    }

    @PostMapping(value = "/v1/tiny/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TinyUserDTO registerUser(@RequestBody TinyUserDTO tinyUserDTO) {
       return tinyUserService.registerUser(tinyUserDTO);
    }

    @PutMapping(value = "/v1/tiny/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TinyUserDTO updateUser(@RequestBody TinyUserDTO tinyUserDTO) {
        return tinyUserService.updateUser(tinyUserDTO);
    }

    @DeleteMapping(value = "/v1/tiny/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TinyUserDTO deleteUserByUsername(@PathVariable("username") String username) {
        return tinyUserService.deleteUserByUsername(username);
    }

    @GetMapping(value = "/v1/tiny/user/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TinyUserDTO getUserByUsername(@PathVariable("username") String username) {
        return tinyUserService.getUserByUsername(username);
    }


}
