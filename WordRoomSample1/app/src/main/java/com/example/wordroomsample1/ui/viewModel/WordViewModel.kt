package com.example.wordroomsample1.ui.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.wordroomsample1.data.Word
import com.example.wordroomsample1.data.WordDatabase
import com.example.wordroomsample1.data.WordRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class WordViewModel(application: Application):AndroidViewModel(application) {
    val wordText = MutableLiveData<String>()

    private var wordRepo: WordRepository = WordRepository(WordDatabase.getInstance(application).wordDao())

    private val _words = MutableLiveData<List<Word>>(emptyList())
    var words : LiveData<List<Word>> = _words

    // DB Select 할 때 방법은 여러가지가 있다.

    // 1. 아래와 같이 ViewModel class 가 생성될 때 읽어와서 변수에 넣어놓는 방법이 있고
    // 2. 아예 Select하는 메서드를 만들어서 사용할 때 마다 호출하는 방법.
    // 3. 변수로 선언해놓고, fragment에서 observing 하는 방법..

    val selectWord: LiveData<List<Word>> = wordRepo.allWords

    init {
        //        _words.value = wordRepo.allWords.value?.let {
//            it
//        }?:
//                arrayListOf(
//                    Word(word = "1111"),
//                    Word(word = "2222"),
//                    Word(word = "3333"),
//                    Word(word = "4444")
//                ).toList()




//        _words.value = arrayListOf(
//            Word("1111"),
//            Word("2222"),
//            Word("3333"),
//            Word("4444")
//        ).toList()


//        val wordDao:WordDao = WordDatabase.getInstance(application).wordDao()
//        wordRepo = WordRepository(wordDao)
//
//        _words.value = arrayListOf(
//            Word("111")
//        )








        //_words.value = wordRepo.allWords.value?.let {it}

        //wordRepo.allWords.value?.let{_words.value = it}

        //_words.value = wordRepo.allWords.value


//
//        wordRepo.allWords.value?.also {
//            _words.value = it
//        } ?: arrayListOf(
//            Word("1111"),
//            Word("2222"),
//            Word("3333"),
//            Word("4444")
//        ).toList()
//
//        if(wordRepo.allWords.value == null){
//            _words.value =
//                arrayListOf(
//                    Word("1111"),
//                    Word("2222"),
//                    Word("3333"),
//                    Word("4444")
//                ).toList()
//        }else{
//            _words.value = wordRepo.allWords.value
//        }

//        //words = wordRepo.allWords
//        viewModelScope.launch {
//            wordRepo.insert(Word("111"))
//            wordRepo.insert(Word("333"))
//        }
//
//        Log.e("ccs", words.value.toString())
    }

    fun insertWord(){

//        _words.value = arrayListOf(
//            Word(wordText.value.toString())
//        ).toList()

        viewModelScope.launch(Dispatchers.IO) {
            Log.e("ccs","---start2---")
            Log.e("ccs","---start value --- ${wordRepo.insert(Word(word = wordText.value.toString()))}")
            //wordRepo.insert(Word(word = wordText.value!!))

            //Log.e("ccs3","${wordText.value}")
            //Log.e("ccs3","${wordText.value.toString()}")
//            Log.e("ccs3","${wordRepo.allWords}")

//            words = wordRepo.allWords
            //_words.postValue(wordRepo.allWords.value?.let {it}?: arrayListOf())
//            _words.postValue(wordRepo.allWords.value)
                    //Log.e("ccs3","${wordRepo.allWords.value?.toList()}")

//            words = wordRepo.select()
            Log.e("ccs","---end1--- ${wordRepo.select()}")
//            _words.postValue(wordRepo.select())

        }

        /*



         */



////        Log.e("ccs3","${wordRepo.allWords.value}")
////        Log.e("ccs3","${wordRepo.allWords.value?.toList()}")
//        Log.e("ccs","---start1---")
//        viewModelScope.launch(Dispatchers.IO) {
//            Log.e("ccs","---start2---")
//            wordRepo.insert(Word(wordText.value!!))
//            Log.e("ccs3","${wordRepo.allWords.value}")
//            //Log.e("ccs3","${wordRepo.allWords.value?.toList()}")
//            Log.e("ccs","---end1---")
//        }
//        Log.e("ccs","---end2---")


//        viewModelScope.launch(Dispatchers.IO) {
////            val result =
////            //wordRepo.insert(Word(wordText.value))
////           // _words.value = wordRepo.allWords.value
////
////            Log.e("ccs1", "${wordText.value}")
//            wordRepo.insert(Word(wordText.value!!))
//            Log.e("ccs3","${wordText.value}")
//            Log.e("ccs3","${wordRepo.allWords.value}")
//            Log.e("ccs3","${wordRepo.allWords.value?.toList()}")
//
//            //_words.postValue(wordRepo.allWords.value)
//            wordRepo.allWords.value?.let {
//                _words.postValue(it)
//            }
//        }
    }


}


