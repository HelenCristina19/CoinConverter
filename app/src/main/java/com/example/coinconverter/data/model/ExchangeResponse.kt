package com.example.coinconverter.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

typealias ExchangeResponse = HashMap<String, ExchangeResponseValue>

@Entity(tableName = "tb_exchange")
data class ExchangeResponseValue (
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val code: String,
    val codein: String,
    val name: String,
    val bid: Double
)
