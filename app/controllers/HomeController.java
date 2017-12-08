package controllers;

import play.*;
import play.mvc.*;
import views.html.*;


public class HomeController extends Controller {

    public Result index() {
        return ok(index.render());
    }

    public Result about(){
        return ok(about.render());
    }

}
