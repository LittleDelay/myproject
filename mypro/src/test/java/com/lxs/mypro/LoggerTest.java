package com.lxs.mypro;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Slf4j注解，不用手动写代码每个类去创建log类，方便开发
 * Created by lxs.
 * 2018/8/4 上午10:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1() {
        String name = "mypro";
        String pwd = "123456";

        /*默认输出级别，高于info，打印参数的方法：可以用大括号的方式来写*/
        log.error("error-------------");
        log.info("name:" + name + ", pwd:" + pwd);
        log.info("name: {}, pwd: {}", name, pwd);

        log.debug("debug--------------");
    }

}
