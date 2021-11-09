package org.example.hello.impl

import org.example.hello.api.HelloService
import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import scala.concurrent.{ExecutionContext, Future}

class HelloServiceImpl extends HelloService {

  override def hello(id: String): ServiceCall[NotUsed, String] = ServiceCall {
    _ =>
      Future.successful(id)
  }

}
