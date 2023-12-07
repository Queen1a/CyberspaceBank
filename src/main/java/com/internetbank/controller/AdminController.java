package com.internetbank.controller;

import com.internetbank.pojo.Admin;
import com.internetbank.pojo.Result;
import com.internetbank.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 根据 id 查询 admin
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Admin admin = adminService.getById(id);
        return Result.success(admin);
    }

    /**
     *根据 id 修改 admin
     * @param admin
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody Admin admin){
        adminService.update(admin);
        return Result.success();
    }

    /**
     * 新增 admin
     * @param admin
     * @return
     */
    @PostMapping()
    public Result insert(@RequestBody Admin admin){
        adminService.insert(admin);
        return Result.success();
    }


    /**
     * 根据 id 删除 admin
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        adminService.delete(id);
        return Result.success();
    }
}
