package org.ougen.groovydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: OuGen
 * Discription:
 * Date: 20:35 2019/7/31
 */
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String toDemo(){
        return "this is a demo";
    }
}
