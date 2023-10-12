
package controllers

import javax.inject._

import shared.SharedMessages
import play.api.mvc._
import java.lang.ProcessBuilder.Redirect
import models.MemoryModelStudent

@Singleton
class Test1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def form = Action {
    Ok(views.html.test1())
  } 
  
  def submit = Action { request => 
    val body = request.body.asFormUrlEncoded
    body.map{args => 
    var username = args("username").head
    var data = MemoryModelStudent.readData()
    var studentUsername = ""
    for (s <- data){
      if (s.username == username) 
        studentUsername = s.username
    }
    if (studentUsername == ""){
      Redirect(routes.Test1.form)
    }
    
    var color = args("color").head
    Ok(views.html.confirm(username, color))
    }.getOrElse(Redirect(routes.Test1.form))
  }
  

}