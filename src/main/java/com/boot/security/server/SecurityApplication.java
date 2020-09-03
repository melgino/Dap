package com.boot.security.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 启动类
 *
 * @author yehaibo  2019/10/10
 */
@SpringBootApplication
public class SecurityApplication {
    private static final Logger log = LoggerFactory.getLogger("SecurityApplication");

    public static void main(String[] args) {

        //有时候，我们可能忘记密码了，可以通过下面这个方式，来重新设置密码，用户在sys_user表中
        String pass = "123";
        BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
        String password = bcryptPasswordEncoder.encode(pass);
        log.info(password);

        //启动的第二个条件是需要同时配置有redis，没有redis，也是启动不起来的

        SpringApplication.run(SecurityApplication.class, args);
    }
}
