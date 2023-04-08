package com.tahauddin.syed.restkotlin.service.impl

import com.tahauddin.syed.restkotlin.domain.entity.User
import com.tahauddin.syed.restkotlin.domain.repo.UserRepository
import com.tahauddin.syed.restkotlin.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userRepository: UserRepository) : UserService {

    override fun getUserById(id: Long): User {
        return userRepository.findById(id).get()
    }

    override fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun saveUser(user: User): User {
        return userRepository.save(user)
    }

    override fun deleteUserById(id: Long) {
        userRepository.deleteById(id)
    }
}