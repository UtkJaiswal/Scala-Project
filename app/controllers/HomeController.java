package controllers;

import play.mvc.*;

import views.html.*;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final AssetsFinder assetsFinder;

    @Inject
    public HomeController(AssetsFinder assetsFinder) {
        this.assetsFinder = assetsFinder;
    }

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    //index page http://localhost:9000/
    
    public Result index() {
        return ok(
            index.render(
                "Scala",
                assetsFinder
            ));
    }

    // hello page syntax which takes a string argument to display the name like Guru and renders hello.scala.html from views folder
    public Result hello(String name) {
        return ok(views.html.hello.render(name,assetsFinder));
    }

    //about page
    public Result about() {
        return ok(views.html.about.render(assetsFinder));
    }

}
