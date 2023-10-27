package com.example.stockmarket.domain.repository

import com.example.stockmarket.common.util.Resource
import com.example.stockmarket.domain.model.CompanyListing
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:Boolean,
        query:String
    ): Flow<Resource<List<CompanyListing>>>
}