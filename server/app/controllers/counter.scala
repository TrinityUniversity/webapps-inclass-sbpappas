package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import java.lang.ProcessBuilder.Redirect
import models.CountingModel
import java.util.concurrent.atomic.AtomicInteger


@Singleton
class Counter @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def form = Action {
    Ok(views.html.test1())
  } 
  
  def counter = Action {
    Ok(views.html.counter())
  }
  
  def increment() = Action{
    Ok(CountingModel.add().toString())
  }

}