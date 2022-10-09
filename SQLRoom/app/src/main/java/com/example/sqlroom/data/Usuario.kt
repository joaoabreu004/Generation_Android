package com.example.sqlroom.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_user")
class Usuario (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var nome: String,
    var sobrenome: String,
    var idade: Int
){

}