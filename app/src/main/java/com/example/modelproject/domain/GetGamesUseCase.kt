package com.example.modelproject.domain

import com.example.modelproject.domain.items.GameItem
import com.example.modelproject.repo.GameRepository
import javax.inject.Inject

class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository){
    suspend operator fun invoke():List<GameItem>{
        return gameRepository.getGames().shuffled()
    }
}