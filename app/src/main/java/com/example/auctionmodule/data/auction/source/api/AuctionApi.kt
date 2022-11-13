package com.example.auctionmodule.data.auction.source.api

import androidx.viewbinding.BuildConfig
import com.example.auctionmodule.domain.auction.model.ResponseModel
import retrofit2.http.GET
import retrofit2.http.Query

interface AuctionApi {
    @GET("/jakarta/daily.json")
    suspend fun getAuctionApi(
        @Query("city") city: String,
        @Query("key") key: String? = "BuildConfig.API_KEY"
    ): ResponseModel

}