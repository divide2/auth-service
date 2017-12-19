package com.divide2.auth.controller;

import com.divide2.auth.model.po.Role;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/role")
public class RoleController {

    @PostMapping
    public void add(Role role) {

    }

    @PutMapping
    public void update(Role role) {

    }

    @GetMapping("/{id}")
    public Role get(@PathVariable int id) {
        return new Role();
    }

    @GetMapping("/pages")
    public Page<Role> list() {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<String> delete() {
        return ResponseEntity.ok("删除成功");
    }

}
