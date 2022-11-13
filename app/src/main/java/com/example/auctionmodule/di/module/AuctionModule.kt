package com.example.auctionmodule.di.module

import com.example.auctionmodule.data.auction.repository.AuctionRepositoryImpl
import com.example.auctionmodule.domain.auction.repository.AuctionRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AuctionModule {

    @Binds
    abstract fun bindScheduleRepository(scheduleRepositoryImpl: AuctionRepositoryImpl): AuctionRepository
}