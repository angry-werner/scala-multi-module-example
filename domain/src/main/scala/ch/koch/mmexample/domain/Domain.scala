package ch.koch.mmexample.domain

import scala.concurrent.Future

trait Domain:
  def doThis(request: Request): Future[Response]