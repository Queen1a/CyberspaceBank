package com.internetbank.controller;


import com.internetbank.pojo.Result;
import com.internetbank.pojo.User;
import com.internetbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据 id 查询 user
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        User user = userService.getById(id);
        return Result.success(user);
    }

    /**
     * 新增 user
     * @param user
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody User user){
        userService.insert(user);
        return Result.success();
    }

    /**
     * 根据 id 更新 user
     * @param user
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }

    /**
     * 根据 id 删除 user
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }
}
