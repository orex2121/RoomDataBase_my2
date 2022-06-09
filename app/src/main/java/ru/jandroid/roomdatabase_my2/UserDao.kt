package ru.jandroid.roomdatabase_my2

import androidx.room.*

@Dao
interface UserDao {

    @Insert
    fun insertUser(users: Users)

    @Query("Select * from user")
    fun gelAllUsers(): List<Users>

    @Update
    fun updateUser(users: Users)

    @Delete
    fun deleteUser(users: Users)

}