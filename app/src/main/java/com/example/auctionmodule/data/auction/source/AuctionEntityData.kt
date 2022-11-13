package com.example.auctionmodule.data.auction.source

import com.example.auctionmodule.domain.auction.model.RequestModel
import com.example.auctionmodule.domain.auction.model.ResponseModel

interface AuctionEntityData {

    suspend fun getAuctionYear(requestModel: RequestModel): List<ResponseModel>

    suspend fun getAuctionList(requestModel: RequestModel): List<ResponseModel>

   // suspend fun addPraySchedules(praySchedules: List<ResponseModel>)
}