package com.example.stockmarket.presentation.company_list

sealed class CompanyListingsEvent {
    object Refresh : CompanyListingsEvent()
    data class Search(val searchQuery : String) : CompanyListingsEvent()
}