package com.example.coinconverter.domain

import com.example.coinconverter.core.UseCase
import com.example.coinconverter.data.model.ExchangeResponseValue
import com.example.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}