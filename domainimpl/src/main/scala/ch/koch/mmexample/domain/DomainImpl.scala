package ch.koch.mmexample.domain

import scala.concurrent.Future

class DomainImpl extends Domain:
  override def doThis(request: Request): Future[Response] =
    ???
