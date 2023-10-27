package com.example.stockmarket.presentation.company_list

import com.example.stockmarket.domain.model.CompanyListing

data class CompanyListingsState(
    val isLoading:Boolean = false,
    val isRefreshing:Boolean = false,
    val companyList: List<CompanyListing> = emptyList(),
    val searchQuery: String = ""
)
