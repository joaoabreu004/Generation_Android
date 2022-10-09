package com.example.sqlroom.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UserDao{

    //IGNORAR DUPLICIDADE
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(usuario: Usuario)

    @Query("SELECT * FROM tb_user ORDER BY id ASC")
    fun selectUsers(): LiveData<List<Usuario>>
}