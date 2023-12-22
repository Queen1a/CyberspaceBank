package com.internetbank.controller;


import com.internetbank.pojo.Deposit;
import com.internetbank.pojo.Result;
import com.internetbank.service.DepositService;
import com.sun.tools.jconsole.JConsoleContext;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/deposit")

public class DepositController {
    @Resource
    private DepositService depositService;

    @PostMapping("/getByUserId")
    public Result getByUserId(@RequestBody String id){
        id = id.substring(11, 29);
        List<Deposit> deposits = depositService.getById(id);
        return Result.success(deposits);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody Deposit deposit){
        System.out.println(deposit + "=============");
        depositService.insert(deposit);
        return Result.success();
    }
}
