package com.id.cozy.home.cozymanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author martin
 * Date 05/03/26
 */

@RestController
@RequestMapping("api/test")
public class TestController {
    @GetMapping
    public String test() {
        return "test";
    }
}
