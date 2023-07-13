package com.jadenzhang.springboottest;

import com.jadenzhang.springboottest.test.redisLock.config.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.HashMap;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringboottestApplication {

    private Logger logger = LoggerFactory.getLogger(SpringboottestApplication.class);

//    @Resource(name="test1DataSource")
//    private DataSource test1DataSource;

//    @Resource(name="test2DataSource")
//    private DataSource test2DataSource;

    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }

    //@Override
//    public void run(String... args) throws Exception {
//       try {
//           Connection conn = test1DataSource.getConnection();
//           logger.info("[run][获得连接：{}]", conn);
//       }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//        try {
//            new HashMap<>();
//            Connection conn = test2DataSource.getConnection();
//            logger.info("[run][获得连接：{}]", conn);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//    }

    private void test(){
        System.out.println("git测试");
    }
}
