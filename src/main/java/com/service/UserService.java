package com.service;

import com.entity.User;
import org.springframework.stereotype.Service;

@Service("UserService")
public interface UserService {

    User getById(String userId);
}
