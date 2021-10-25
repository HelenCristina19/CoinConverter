package com.example.coinconverter.domain

import com.example.coinconverter.core.UseCase
import com.example.coinconverter.data.model.ExchangeResponseValue
import com.example.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>(){

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }
}