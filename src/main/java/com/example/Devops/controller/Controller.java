package com.example.Devops.controller;

import com.example.Devops.Student.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class Controller {

    Student s=new Student();

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public ResponseEntity<?> world(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
    @RequestMapping(value = "/java", method = RequestMethod.GET)
    public ResponseEntity<?> java(){
        return new ResponseEntity<>("Hello java!", HttpStatus.OK);
    }
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<?> student(){
        return new ResponseEntity<>("name:"+s.getName(), HttpStatus.OK);
    }

}
