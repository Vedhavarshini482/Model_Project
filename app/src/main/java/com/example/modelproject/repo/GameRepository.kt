package com.example.modelproject.repo

import com.example.modelproject.data.remote.GameService
import com.example.modelproject.domain.items.GameItem
import com.example.modelproject.domain.items.SpecificGameItem
import com.example.modelproject.domain.items.toGameItem
import com.example.modelproject.domain.items.toSpecificGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }

    }

    suspend fun getGameById(id: Int): SpecificGameItem {

        return gameService.getGameById(id).toSpecificGameItem()

    }

}