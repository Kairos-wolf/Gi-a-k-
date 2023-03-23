package com.example.thigk.Repository

import androidx.lifecycle.LiveData
import com.example.thigk.Data.UserDao
import com.example.thigk.Model.User
import kotlinx.coroutines.flow.Flow

class UserRepository(private val userDao: UserDao) {


    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }
    suspend fun updateUser(user: User){
        userDao.updateUser(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers(){
        userDao.deleteAllUsers()
    }


}