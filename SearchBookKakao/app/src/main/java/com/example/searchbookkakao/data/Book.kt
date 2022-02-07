package com.example.searchbookkakao.data

import androidx.room.Entity
import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

@Entity
data class Book (
    @SerializedName("title")
    val title : String,
    @SerializedName("authors")
    val author:ArrayList<String>,
    @SerializedName("price")
    val price:String,
    @SerializedName("contents")
    val contents:String,
    @SerializedName("thumbnail")
    val thumbnail:String
    )

data class BookResponse(
    @SerializedName("documents")
    val documentList: ArrayList<Book>,
    @SerializedName("meta")
    val meta: MetaDataResponse
    )

data class MetaDataResponse(
    @SerializedName("is_end")
    val isEnd: String,
    @SerializedName("pageable_count")
    val pageableCount: String,
    @SerializedName("total_count")
    val totalCount: String
)


@ProvidedTypeConverter
class StringListTypeConverter(private val gson: Gson) {
    @TypeConverter
    fun arrayListToJson(value: ArrayList<String>): String? {
        return gson.toJson(value) }
    @TypeConverter
    fun jsonToArrayList(value: String): List<String> {
        return gson.fromJson(value, Array<String>::class.java).toList()
    }
}


