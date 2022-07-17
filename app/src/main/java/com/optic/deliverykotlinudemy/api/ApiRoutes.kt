package com.optic.deliverykotlinudemy.api

import com.optic.deliverykotlinudemy.routes.CategoriesRoutes
import com.optic.deliverykotlinudemy.routes.ProductsRoutes
import com.optic.deliverykotlinudemy.routes.UsersRoutes
import retrofit2.Retrofit

class ApiRoutes {

    val API_URL = "http://192.168.1.12:3000/api/"
    val retrofit = RetrofitClient()

    fun getUsersRoutes(): UsersRoutes {
        return retrofit.getClient(API_URL).create(UsersRoutes::class.java)
    }

    fun getUsersRoutesWithToken(token: String): UsersRoutes {
        return retrofit.getClientWithToken(API_URL, token).create(UsersRoutes::class.java)
    }

    fun getCategoriesRoutes(token: String): CategoriesRoutes {
        return retrofit.getClientWithToken(API_URL, token).create(CategoriesRoutes::class.java)
    }

    fun getProductsRoutes(token: String): ProductsRoutes {
        return retrofit.getClientWithToken(API_URL, token).create(ProductsRoutes::class.java)
    }

}