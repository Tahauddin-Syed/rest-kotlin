package com.tahauddin.syed.restkotlin.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "USERS_TABLE")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long?,
        var firstName: String,
        var lastName: String,
        var email: String,
)