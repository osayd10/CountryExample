package com.example.countryexample.di

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.countryexample.data.Country
import com.example.countryexample.data.ServerResponse

class CountryViewModel @ViewModelInject constructor(repository: CountryRepository) :
    ViewModel() {

    private val _response: MutableLiveData<ServerResponse<List<Country>, Throwable>> =
        repository.getServiceResponse()

    val response: LiveData<ServerResponse<List<Country>, Throwable>>
        get() = _response
}