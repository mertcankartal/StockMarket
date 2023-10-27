package com.example.stockmarket.presentation

sealed class Screen(val route: String) {
    object CompanyScreen : Screen("company_screen")
}
