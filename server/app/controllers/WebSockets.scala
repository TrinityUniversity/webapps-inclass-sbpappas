package controllers

import play.api.mvc._
import play.api.i18n._
import models.CountingModel
import play.api.libs.json._
/*
@Singleton 
class WebSockets @Inject() (cc: ControllerComponents) extends AbstractController(cc){
    def index = Action {implicit request =>
        Ok(views.html.countingSocket())
    }
}*/