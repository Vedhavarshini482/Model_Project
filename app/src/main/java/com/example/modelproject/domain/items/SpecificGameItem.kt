package com.example.modelproject.domain.items

import com.example.modelproject.data.remote.models.SpecificGameModel

data class SpecificGameItem(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val description: String
)
fun SpecificGameModel.toSpecificGameItem()=SpecificGameItem(id,title,thumbnail,description)