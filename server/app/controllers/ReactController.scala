package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import java.lang.ProcessBuilder.Redirect
import models.CountingModel
import java.util.concurrent.atomic.AtomicInteger


@Singleton
class ReactController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
    def load = Action {
    Ok(views.html.reactpractice())
  } 
}