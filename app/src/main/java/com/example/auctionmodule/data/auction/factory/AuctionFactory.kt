package com.example.auctionmodule.data.auction.factory

import com.example.auctionmodule.data.auction.source.AuctionEntityData
import com.example.auctionmodule.data.auction.source.network.NetworkAuctionEntityData
import com.example.auctionmodule.util.Source
import javax.inject.Inject

class AuctionFactory @Inject constructor(private val networkScheduleEntityData: NetworkAuctionEntityData
){

    fun create(source: Source):AuctionEntityData{
        return networkScheduleEntityData
        }


    }
