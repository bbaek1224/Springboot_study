package com.study.rest.controller;

import com.study.rest.dto.ReqStudentDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// REST API -> 데이터 응답
@Slf4j
@RestController
public class BasicController {

    @CrossOrigin
    @PostMapping("/basic/student")      // PostMapping은 추가
    public ResponseEntity<?> basicPost(@RequestBody ReqStudentDto reqStudentDto) {
        log.info("Student : {}", reqStudentDto);
        return ResponseEntity.ok().body("응답데이터");  // ok -> 상태코드 200
    }
}
