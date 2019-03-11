package com.mealcord.user

interface UserService {
    fun save(user: User)

    fun oauthSave(user: User)

    fun loadByPhone(phone: String): User?
}