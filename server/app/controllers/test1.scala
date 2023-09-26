
package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._

@Singleton
class Test1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def form = Action {
    Ok(views.html.test1())
  }

  

}