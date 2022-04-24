package com.plcoding.stockmarketapp.domain.repository

import com.plcoding.stockmarketapp.domain.model.CompanyListing
import com.plcoding.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query : String
    ): Flow<Resource<List<CompanyListing>>>


}