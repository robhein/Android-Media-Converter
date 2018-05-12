package com.github.khangnt.mcp.ui.jobmaker.selectoutput

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * Created by Simon Pham on 5/12/18.
 * Email: simonpham.dn@gmail.com
 */

class Step4ViewModel: ViewModel() {

    private val listOutputFileLiveData = MutableLiveData<List<OutputFile>>()

    fun getListOutputFile(): LiveData<List<OutputFile>> = listOutputFileLiveData

    fun setListOutputFile(outputs: List<OutputFile>) {
        listOutputFileLiveData.value = outputs
    }
}