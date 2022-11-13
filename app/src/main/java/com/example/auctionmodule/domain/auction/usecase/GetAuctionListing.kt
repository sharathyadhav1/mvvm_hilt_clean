package com.example.auctionmodule.domain.auction.usecase

import com.example.auctionmodule.domain.auction.model.RequestModel
import com.example.auctionmodule.domain.auction.model.ResponseModel
import com.example.auctionmodule.domain.auction.repository.AuctionRepository
import javax.inject.Inject

class GetAuctionListing @Inject constructor(
    private val auctionListingRepository: AuctionRepository
) {

    suspend fun getYears(request: RequestModel): List<ResponseModel> {
        return auctionListingRepository.getAuctionYears(request)
    }
    suspend fun getAuctionList(request: RequestModel): List<ResponseModel> {
        return auctionListingRepository.getAuctionList(request)

    }
}