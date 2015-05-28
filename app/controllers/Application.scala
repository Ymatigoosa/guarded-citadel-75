package controllers

import play.api._
import play.api.mvc._
import play.twirl.api.Html

class Application extends Controller {

  def index(uri: String) = Action {
    Ok(views.html.index(Html("Your new application is ready.")))
  }

}
