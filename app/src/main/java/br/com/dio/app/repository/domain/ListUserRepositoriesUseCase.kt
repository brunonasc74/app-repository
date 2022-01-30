package br.com.dio.app.repository.domain

import br.com.dio.app.repository.core.UseCase
import br.com.dio.app.repository.data.model.Repo
import br.com.dio.app.repository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}