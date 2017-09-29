package org.reversestr.client

import org.scalatest.concurrent.PatienceConfiguration.Timeout
import org.scalatest.{FunSpecLike, Matchers}
import org.scalatest.concurrent.ScalaFutures
import scala.concurrent.duration._

class RClientIntegrationSpec extends FunSpecLike with Matchers with ScalaFutures {
  val client:RClient = new RClient("127.0.0.1:2552")
  describe("reverse str Scala Client") {
    describe("set method") {
      it("should set a value") {
        whenReady(client.setStr("123"), Timeout(1 second)) {
          r => r shouldBe "321"
        }
      }
    }
    
    
  }
}