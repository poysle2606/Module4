package com.example.controller;

import com.example.model.MobilePhone;
import com.example.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/phone/api/v1")
public class PhoneController {

    @Autowired
    IPhoneService iPhoneService;

    @GetMapping("")
    public ResponseEntity<List<MobilePhone>> list() {
        List<MobilePhone> mobilePhones = iPhoneService.findAll();
        if (mobilePhones.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(mobilePhones, HttpStatus.OK);
        }
    }

    @PostMapping("/create")
    public ResponseEntity addPhone(@RequestBody MobilePhone mobilePhone) {
        iPhoneService.save(mobilePhone);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MobilePhone> edit(@PathVariable Integer id, @RequestBody MobilePhone mobilePhone) {
        MobilePhone mobilePhone1 = iPhoneService.findById(id);
        if (mobilePhone1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        mobilePhone1.setModel(mobilePhone.getModel());
        mobilePhone1.setPrice(mobilePhone.getPrice());
        mobilePhone1.setProducer(mobilePhone.getProducer());

        iPhoneService.save(mobilePhone1);
        return new ResponseEntity<>(mobilePhone1,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        iPhoneService.remove(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
