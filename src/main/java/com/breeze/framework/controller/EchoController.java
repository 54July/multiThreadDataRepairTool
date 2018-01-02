package com.breeze.framework.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.breeze.framework.service.IEchoService;
/**
 * @author JuanChensh
 *
 */
@RestController
@RequestMapping(value="/framework")
public class EchoController {
	
	@Autowired
    public IEchoService echoService;

    @ResponseBody
    @RequestMapping(value="/echo")
    public Map<String,String> echoController(){
        return echoService.selectAll();
    }
    
    @ResponseBody
    @RequestMapping(value="/echotest")
    public Map<String,String> echoControllerTest(){
        return echoService.selectAllTest();
    }
}
