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
@CrossOrigin
@RequestMapping("/blog/api/v1")
public class BloggerController {

    @Autowired
    IBloggerService iBloggerService;

    @GetMapping("")
    public ResponseEntity<List<Blogger>> listBlogger() {
        List<Blogger> bloggerList = iBloggerService.findAll();
        if (bloggerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bloggerList, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity addBlogger(@RequestBody Blogger blogger) {
        iBloggerService.create(blogger);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Blogger> updateBlogger(@PathVariable int id, @RequestBody Blogger blogger) {
        Blogger blogger1 = iBloggerService.findById(id);
        if (blogger1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogger1.setName(blogger.getName());
        blogger1.setContent(blogger.getContent());
        blogger1.setStatus(blogger.getStatus());
        blogger1.setDayStart(blogger.getDayStart());
        blogger1.setCategory(blogger.getCategory());

        iBloggerService.edit(blogger1);
        return new ResponseEntity<>(blogger1,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBlogger(@PathVariable int id){
        iBloggerService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Blogger>> searchByName(@RequestParam("name") String name ){
        List<Blogger> bloggerList = iBloggerService.search(name);
        if (bloggerList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(bloggerList, HttpStatus.OK);
    }
}
