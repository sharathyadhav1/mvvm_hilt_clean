package com.example.auctionmodule.domain.auction.repository

import com.example.auctionmodule.domain.auction.model.RequestModel
import com.example.auctionmodule.domain.auction.model.ResponseModel

interface AuctionRepository {

    suspend fun getAuctionYears(requestModel: RequestModel): List<ResponseModel>
    suspend fun getAuctionList(requestModel: RequestModel): List<ResponseModel>
}