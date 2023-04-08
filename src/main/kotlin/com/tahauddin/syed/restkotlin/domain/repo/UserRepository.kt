package com.tahauddin.syed.restkotlin.domain.repo

import com.tahauddin.syed.restkotlin.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}