package com.tahauddin.syed.restkotlin.service

import com.tahauddin.syed.restkotlin.domain.entity.User

interface UserService {

    fun getUserById(id:Long): User

    fun getAllUsers(): List<User>

    fun saveUser(user: User): User

    fun deleteUserById(id: Long)
}