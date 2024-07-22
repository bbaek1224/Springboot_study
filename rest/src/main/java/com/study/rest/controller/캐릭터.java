package com.study.rest.controller;

import com.study.rest.di.무기;
import com.study.rest.di.방패;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.TypedValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 캐릭터 {

    private 무기 weapon;

    @Autowired
    @Qualifier("총")
    private 무기 c;
    @Autowired
    @Qualifier("칼")
    private 무기 k;
    @Autowired
    @Qualifier("물리공격방패")
    private 방패 shield;

    @ResponseBody
    @GetMapping("/maple/attack")
    public Object mapleAttack() {
        if(weapon.equals("총")) {
            weapon = c;
        } else {
            weapon = k;
        }
        weapon.공격();
        return null;
    }

    @ResponseBody
    @GetMapping("/maple/defence")
    public Object mapleDefence() {
        shield.방어();
        return null;
    }

    @Autowired
    private TypedValue typedValue;
}