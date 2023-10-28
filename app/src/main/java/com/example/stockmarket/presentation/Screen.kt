package com.example.stockmarket.presentation

sealed class Screen(val route: String) {
    object CompanyScreen : Screen("company_screen")
    object CompanyInfoScreen : Screen("companyInfo_screen")
}
