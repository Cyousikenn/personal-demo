package com.contorller;

import com.common.base.ResultMsg;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public ResultMsg getUserById(@PathParam("userId") String userId) {
        return ResultMsg.createSuccessResultMsg(userService.getById(userId));
    }
}
