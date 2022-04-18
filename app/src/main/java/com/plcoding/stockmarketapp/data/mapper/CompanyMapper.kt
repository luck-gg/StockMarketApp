package com.plcoding.stockmarketapp.data.mapper

import androidx.room.PrimaryKey
import com.plcoding.stockmarketapp.data.local.CompanyListingEntity
import com.plcoding.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing():CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity():CompanyListingEntity{
    return CompanyListingEntity(
        //Id generated automatically
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}