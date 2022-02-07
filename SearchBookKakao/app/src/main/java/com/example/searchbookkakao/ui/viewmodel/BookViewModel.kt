package com.example.searchbookkakao.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.searchbookkakao.data.Book
import com.example.searchbookkakao.network.NetWorkModule
import kotlinx.coroutines.launch

class BookViewModel :ViewModel(){

    val searchText = MutableLiveData<String>()

    private val _books = MutableLiveData<ArrayList<Book>>()
    val books:LiveData<ArrayList<Book>> = _books

    private val _booksDB = MutableLiveData<ArrayList<Book>>()
    val booksDB:LiveData<ArrayList<Book>> = _booksDB

    init {
        _books.value = arrayListOf(
            Book("머니(Money)", arrayListOf("롭 무어"), "17000",
                "빚더미를 안고 파산한 다음 바닥부터 시작해 불과 3년만에 백만장자로 거듭나면서, 부를 당기는 메커니즘을 경험Z빚더미를 안고 파산한 다음 바닥부터 시작해 불과 3년만에 백만장자로 거듭나면서, 부를 당기는 메커니즘을 경험Z빚더미를 안고 파산한 다음 바닥부터 시작해 불과 3년만에 백만장자로 거듭나면서, 부를 당기는 메커니즘을 경험Z빚더미를 안고 파산한 다음 바닥부터 시작해 불과 3년만에 백만장자로 거듭나면서, 부를 당기는 메커니즘을 경험Z.",
                "https://search1.kakaocdn.net/thumb/R120x174.q85/?fname=http%3A%2F%2Ft1.daumcdn.net%2Flbook%2Fimage%2F1535669%3Ftimestamp%3D20220122164430")
        )
    }

    fun buttonClick(){
        viewModelScope.launch {
            val result = NetWorkModule.service.searchBook(searchText.value!!,1,10)
            Log.e("ccs", "${result}")
            Log.e("ccs", "${result.documentList}")
            Log.e("ccs", "${result.meta}")

            _books.value = (result.documentList)
        }
    }
}