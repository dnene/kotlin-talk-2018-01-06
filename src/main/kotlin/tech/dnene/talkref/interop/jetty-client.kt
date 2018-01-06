package tech.dnene.talkref.interop

import org.eclipse.jetty.client.HttpClient
import org.eclipse.jetty.client.api.Response
import org.eclipse.jetty.client.api.Result
import org.eclipse.jetty.http.HttpMethod
import java.util.concurrent.TimeUnit

object JettyClientDemo {
  @JvmStatic
  fun main(args: Array<String>) {
    val client = HttpClient()
    client.start()
    val req = client
        .newRequest("http://google.com")
        .method(HttpMethod.GET)
        .timeout(5, TimeUnit.SECONDS)
        .apply {
          header("X-Dummy-Header", "Kotlin-talk")
        }
    val response = req.send()

    if (response.status in (200..299)) {
      println("Got a success")
      println("Content was: ${String(response.content).substring(0..200)}")
    } else {
      println("Got an error: ${response.content}")
    }

    req.send(object: Response.CompleteListener {
      override fun onComplete(result: Result?) {
        result?.let {
          if (result.isFailed) {
            println("Request failed")
            println(result.failure)
          } else {
            result.response.let { response ->
              response.headers.forEach {
                println("Received response header: ${it}")
              }

              if (response.status in (200..299)) {
                println("Got a success ${response.status}")
              } else {
                println("Got an error: ${response.status}")
              }
            }
          }
        }
      }
    })
    Thread.sleep(5000)
    client.stop()
  }
}