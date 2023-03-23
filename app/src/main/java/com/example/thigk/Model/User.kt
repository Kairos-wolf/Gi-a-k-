package com.example.thigk.Model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize //Update
@Entity(tableName = "user_Table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val email: String,
    val tenDangKy: String,
    val matKhau: String
): Parcelable