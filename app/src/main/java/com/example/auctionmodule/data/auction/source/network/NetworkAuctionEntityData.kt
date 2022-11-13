package com.example.auctionmodule.data.auction.source.network

import com.example.auctionmodule.data.auction.mapper.AuctionReponseMapper.toYearListResponse
import com.example.auctionmodule.data.auction.mapper.AuctionReponseMapper.toYearResponse
import com.example.auctionmodule.data.auction.source.AuctionEntityData
import com.example.auctionmodule.data.auction.source.api.AuctionApi
import com.example.auctionmodule.domain.auction.model.RequestModel
import com.example.auctionmodule.domain.auction.model.ResponseModel
import javax.inject.Inject

class NetworkAuctionEntityData @Inject constructor(
    private val auctionApi: AuctionApi
) : AuctionEntityData {

    override suspend fun getAuctionYear(requestModel: RequestModel): List<ResponseModel> {

        return auctionApi.getAuctionApi(requestModel.city).toYearResponse()

    }

    override suspend fun getAuctionList(requestModel: RequestModel): List<ResponseModel> {

        return auctionApi.getAuctionApi(requestModel.city).toYearListResponse()

    }

  /*  override suspend fun addPraySchedules(praySchedules: List<ResponseModel>) {
        //no op
    }*/
}