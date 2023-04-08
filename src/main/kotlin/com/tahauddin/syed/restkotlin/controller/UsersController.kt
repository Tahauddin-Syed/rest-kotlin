package com.tahauddin.syed.restkotlin.controller

import com.tahauddin.syed.restkotlin.domain.entity.User
import com.tahauddin.syed.restkotlin.service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UsersController(val userService: UserService) {


    @GetMapping("/getUserById")
    fun getUserById(@RequestParam id: Long): ResponseEntity<User> {
        return ResponseEntity.ok(userService.getUserById(id))
    }




    @GetMapping("/getAllUsers")
    fun getAllUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getAllUsers())
    }

}