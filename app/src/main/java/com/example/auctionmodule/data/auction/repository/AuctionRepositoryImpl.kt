package com.example.auctionmodule.data.auction.repository

import com.example.auctionmodule.data.auction.factory.AuctionFactory
import com.example.auctionmodule.domain.auction.model.RequestModel
import com.example.auctionmodule.domain.auction.model.ResponseModel
import com.example.auctionmodule.domain.auction.repository.AuctionRepository
import com.example.auctionmodule.util.Source
import javax.inject.Inject

class AuctionRepositoryImpl @Inject constructor(private val auctionFactory: AuctionFactory): AuctionRepository {
    override suspend fun getAuctionYears(requestModel: RequestModel): List<ResponseModel> {
        return auctionFactory.create(Source.NETWORK).getAuctionYear(requestModel)
    }

    override suspend fun getAuctionList(requestModel: RequestModel): List<ResponseModel> {
        return auctionFactory.create(Source.NETWORK).getAuctionList(requestModel)
    }
}