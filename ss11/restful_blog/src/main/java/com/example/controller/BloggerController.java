package com.example.controller;

import com.example.dto.BloggerDto;
import com.example.model.Blogger;
import com.example.service.IBloggerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog/api/v1")
public class BloggerController {

    @Autowired
    IBloggerService iBloggerService;

    @GetMapping("")
    public ResponseEntity<List<Blogger>> listBlogger(){
        List<Blogger> bloggerList = iBloggerService.findAll();
        if (bloggerList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bloggerList,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity addBlogger(@RequestBody Blogger blogger){
        iBloggerService.create(blogger);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
