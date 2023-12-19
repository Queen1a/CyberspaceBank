package com.internetbank.controller;


import com.internetbank.pojo.Result;
import com.internetbank.pojo.User;
import com.internetbank.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        System.out.println("user:------" + user);
        if(userService.getByTelephone(user.getTelephone()) != null){
            System.out.println("yyyyyyyyyyyyyyy");
            return Result.success(user);
        }
        else {
            System.out.println("nnnnnnnnnnnnnnnnn");
            return Result.error("登录失败");
        }
    }

    @PostMapping("/register")
    public Result Register(@RequestBody User user){
        if(userService.getByTelephone(user.getTelephone()) != null){
            return Result.error("注册失败 ！");
        }
        else {
            userService.insert(user);
            return Result.success(user);
        }
    }

    /**
     * 根据 telephone 查询 User
     * @param telephone
     * @return
     */
    @GetMapping("/get")
    public Result getByTelephone(@RequestParam String telephone){
        System.out.println(telephone + "==================");
        User user = userService.getByTelephone(telephone);
        return Result.success(user);
    }

    /**
     * 根据 id 查询 user
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable String id){
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
    public Result delete(@PathVariable String id){
        userService.delete(id);
        return Result.success();
    }
}
