
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 We make basic navbar in this template and call this template by all others so that
 we dont need to write the navbar for each component
 */
  def apply/*9.2*/(title: String)(content: Html)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*10.1*/("""
"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/assetsFinder/*16.66*/.path("stylesheets/main.css")),format.raw/*16.95*/("""">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/assetsFinder/*18.71*/.path("images/favicon.png")),format.raw/*18.98*/("""">
        <script src=""""),_display_(/*19.23*/assetsFinder/*19.35*/.path("javascripts/hello.js")),format.raw/*19.64*/("""" type="text/javascript"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    </head>
    <body>
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="/">Scala</a> 
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/">Home</a>
                  </li>
                  <li class="nav-item">
                    <a class="nav-link" href="/about">About</a>
                  </li>
                  <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                      All Courses
                    </a>
                    
                
              </div>
            </div>
          </nav>
          <!-- Navbar ends -->
        """),format.raw/*50.32*/("""
         """),format.raw/*51.10*/("""<!-- Below content is passed by other templates as html body and rendered here -->
        """),_display_(/*52.10*/content),format.raw/*52.17*/("""
    """),format.raw/*53.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(assetsFinder)

  def f:((String) => (Html) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (assetsFinder) => apply(title)(content)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 63d6ebe83a44025054f02773fe156cfde085d563
                  MATRIX: 1315->397|1477->465|1505->466|1585->571|1621->580|1656->588|1682->593|1771->655|1792->667|1842->696|2149->977|2170->989|2218->1016|2270->1041|2291->1053|2341->1082|4153->2959|4191->2969|4310->3061|4338->3068|4370->3073
                  LINES: 34->9|39->10|40->11|43->14|44->15|44->15|44->15|45->16|45->16|45->16|47->18|47->18|47->18|48->19|48->19|48->19|78->50|79->51|80->52|80->52|81->53
                  -- GENERATED --
              */
          