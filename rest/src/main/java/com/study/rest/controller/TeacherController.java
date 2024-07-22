package com.study.rest.controller;

import com.study.rest.dto.ReqTeacherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TeacherController {

    @CrossOrigin
    @PostMapping("/basic/teacher")
    public ResponseEntity<?> teacherPost(@RequestBody ReqTeacherDto reqTeacherDto) {
        log.info("Teacher : {}", reqTeacherDto);
        return ResponseEntity.ok().body("응답데이터");
    }
}
