package com.internetbank.controller;


import com.internetbank.pojo.Deposit;
import com.internetbank.pojo.Result;
import com.internetbank.service.DepositService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/deposit")

public class DepositController {
    @Resource
    private DepositService depositService;

    @PostMapping("/getByUserId")
    public Result getByUserId(@RequestBody String id){
        System.out.println(id + "==========");
        id = id.substring(11, 29);
        System.out.println(id + "==========");
        Deposit deposit = depositService.getById(id);
        return Result.success();
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Deposit deposit){
        Deposit deposit1 = depositService.insert(deposit);
        return Result.success(deposit1);
    }
}
