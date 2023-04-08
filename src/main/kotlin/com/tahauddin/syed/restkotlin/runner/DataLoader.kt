package com.tahauddin.syed.restkotlin.runner

import com.tahauddin.syed.restkotlin.domain.entity.User
import com.tahauddin.syed.restkotlin.domain.repo.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(val userRepository: UserRepository): CommandLineRunner {

    override fun run(vararg args: String?) {
        val user1 = User(null, "James", "Bond", "James.Bond@007.com")
        val user2 = User(null, "Tom", "Cruise", "Tom.Cruise@mi.com")
        val user3 = User(null, "Tom", "Hardy", "Tom.Hardy@batman.com")
        val user4 = User(null, "Harvey", "Spector", "Harvey.Spector@suits.com")
        userRepository.saveAll(listOf(user1, user2, user3, user4))
        println("Users Saved into DB :: ${userRepository.count()}")
    }
}