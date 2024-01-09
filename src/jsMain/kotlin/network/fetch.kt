package network

import kotlinx.browser.window
import kotlinx.coroutines.await
import org.w3c.fetch.CORS
import org.w3c.fetch.RequestInit
import org.w3c.fetch.RequestMode
import org.w3c.fetch.Response
import kotlin.js.json

class FetchError(message: String, status: Number, response: dynamic) : Error(message)

suspend fun makeError(res: Response): FetchError {
    try {
        val errorResponse: dynamic = res.json().await()
        return FetchError("Request failed", res.status, errorResponse)
    } catch (e: Exception) {
        val errorResponse = res.text().await()
        return FetchError("Request failed", res.status, errorResponse)
    }
}

suspend fun <T> request(url: String, method: String = "GET", body: dynamic = null): T {
    val res = window.fetch(url, object : RequestInit {
        override var method: String? = method
        override var body: dynamic = body
        override var mode: RequestMode? = RequestMode.CORS
        override var headers: dynamic = json(
            "Accept" to "application/json",
            "Content-Type" to "application/json",
            "Access-Control-Allow-Origin" to "*"
        )
    }).await()


    return if (res.ok) res.text().await() as T else throw makeError(res)
}