package com.example.sqlroom.data

class UserRepository (private val userDao: UserDao) {
    val selectUsers = userDao.selectUsers()

    fun addUser(usario: Usuario){
        userDao.addUser(usario)
    }
}