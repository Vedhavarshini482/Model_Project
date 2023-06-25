package com.example.modelproject.data.remote


import com.example.modelproject.data.remote.models.GameModel
import com.example.modelproject.data.remote.models.SpecificGameModel
import com.example.modelproject.util.Constants.Companion.GAMES_ENDPOINT
import com.example.modelproject.util.Constants.Companion.GAME_ID_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GameApi {

    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

    @GET(GAME_ID_ENDPOINT)
    suspend fun getGameById(@Query(value = "id") id: Int): Response<SpecificGameModel>

}