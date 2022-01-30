package br.com.dio.app.repository.data.repositories

import br.com.dio.app.repository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories (user: String): Flow<List<Repo>>
}