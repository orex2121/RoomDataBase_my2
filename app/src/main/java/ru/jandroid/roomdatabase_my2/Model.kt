package ru.jandroid.roomdatabase_my2

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user")
data class Users(@PrimaryKey(autoGenerate = true)var userId: Int? = null,
                 val userName: String, var location: String, val email: String):Serializable {

}

@Entity(tableName = "guide")
data class Guide(@PrimaryKey(autoGenerate = true)var commandId: Int? = null,
                 val commandName: String,
                 var commandDesc: String,
                 val commandExample: String,
                 val commandResult: String,
                 val commandfavorites: Int,
                 val commandHistory: Int
):Serializable {
}