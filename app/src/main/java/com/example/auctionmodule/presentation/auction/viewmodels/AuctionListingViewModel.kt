package com.example.auctionmodule.presentation.auction.viewmodels

import androidx.annotation.StringRes
import androidx.lifecycle.ViewModel
import com.example.auctionmodule.domain.auction.model.ResponseModel
import com.example.auctionmodule.domain.auction.usecase.GetAuctionListing
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class AuctionListingViewModel @Inject constructor(private val getAuctionListing: GetAuctionListing) :ViewModel() {
    private val _uiState = MutableStateFlow<AuctionUiState>(AuctionUiState.Loading)
    val uiState: StateFlow<AuctionUiState> = _uiState

    sealed class AuctionUiState {
        object Loading : AuctionUiState()
        class Loaded(val itemState: ResponseModel) : AuctionUiState()
        class Error(@StringRes val message: Int) : AuctionUiState()
    }






}