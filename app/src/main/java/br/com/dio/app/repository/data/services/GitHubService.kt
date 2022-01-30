package br.com.dio.app.repository.data.services

import br.com.dio.app.repository.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user")  user: String): List<Repo>
}