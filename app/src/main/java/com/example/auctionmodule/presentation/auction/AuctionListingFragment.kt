package com.example.auctionmodule.presentation.auction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.auctionmodule.R
import com.example.auctionmodule.databinding.FragmentAuctionListingBinding
import com.example.auctionmodule.presentation.base.BaseFragment


class AuctionListingFragment : BaseFragment<FragmentAuctionListingBinding>() {



    override fun constructViewBinding(): ViewBinding = FragmentAuctionListingBinding.inflate(layoutInflater)

    override fun init(viewBinding: ViewBinding) {
        TODO("Not yet implemented")
    }


}