package com.example.bigdata.controller;

import com.example.bigdata.entity.User;
import com.example.bigdata.service.RedisService;
import com.example.bigdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("user")

public class UserController {
        @Autowired
        private UserService userService;
//        @Autowired
//        private RedisService redisService;


        @GetMapping("/")
        public String index(){
                return "欢迎访问";
        }

        /*
        查询
         */

        @GetMapping("/queryById")
        public String queryById(int id){
                //从redis获取key为Id User
//                String userStr=redisService.get(id+"");
                //判断是否存在
//                if (userStr==null){
                        //查询  设置redis
//                        redisService.set(id+"",userService.queryById(id).toString());
                        return userService.queryById(id).toString();
                }

//                return userStr;
//        }

        /**
         * 增  改
         * @param
         * @param
         * @return
         */


        @PostMapping("/saveOrUpdate")
        public User saveOrUpdate(User user) {
                return userService.save(user);
        }

        /**
         * 删除
         * @param id
         * @return
         */
        @DeleteMapping("/delete")
        public Boolean deleteUser(int id){
                userService.deletUserById(id);
                return true;
        }


}
