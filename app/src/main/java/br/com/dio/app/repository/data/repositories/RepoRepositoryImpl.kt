package br.com.dio.app.repository.data.repositories

import br.com.dio.app.repository.core.RemoteException
import br.com.dio.app.repository.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service : GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "It was not possible to search at the moment!")
        }
    }
}