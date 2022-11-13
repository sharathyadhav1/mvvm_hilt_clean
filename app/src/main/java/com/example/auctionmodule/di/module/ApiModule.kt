package com.example.auctionmodule.di.module

import com.example.auctionmodule.data.auction.source.api.AuctionApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    fun providePrayApi(retrofit: Retrofit): AuctionApi = retrofit.create(AuctionApi::class.java)

}