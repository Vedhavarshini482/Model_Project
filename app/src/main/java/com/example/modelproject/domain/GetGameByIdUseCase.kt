package com.example.modelproject.domain

import com.example.modelproject.domain.items.SpecificGameItem
import com.example.modelproject.repo.GameRepository
import javax.inject.Inject

class GetGameByIdUseCase @Inject constructor(private val gameRepository: GameRepository) {

    suspend operator fun invoke(id: Int): SpecificGameItem {

        return gameRepository.getGameById(id)

    }

}