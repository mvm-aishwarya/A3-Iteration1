package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

import java.sql.ResultSet;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result commonlayout(){
        return ok(views.html.commonlayout.render());
    }

    public static Result signup(){
        return ok(views.html.signup.render());
    }

    public static Result signin(){
        return ok(views.html.signin.render());
    }
}

