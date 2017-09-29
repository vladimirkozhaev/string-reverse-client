package org.reversestr.client

import akka.actor.ActorSystem
import akka.pattern.ask
import akka.util.Timeout
import scala.concurrent.Future
import scala.concurrent.duration._;

class RClient(remoteAddress: String) {
  private implicit val timeout = Timeout(2 seconds)
  private implicit val system = ActorSystem("LocalSystem")
  private val remoteDb = system.actorSelection(s"akka.tcp://reverse@$remoteAddress/user/reverse-str")

  def setStr(value: String): Future[String] = {
    (remoteDb ? value).mapTo[String]
  }
  
}
