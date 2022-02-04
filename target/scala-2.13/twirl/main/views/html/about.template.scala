
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<!-- The below line makes sure that we pass "About" as title and html body as content to main.scala.html -->
"""),_display_(/*3.2*/main("About")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    
    
        """),format.raw/*6.9*/("""<div  class="container">
            <h1>About Scala</h1>
            <p>
                Scala is programming language.</p>
        </div>
    
""")))}))
      }
    }
  }

  def render(assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply()(assetsFinder)

  def f:(() => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = () => (assetsFinder) => apply()(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/about.scala.html
                  HASH: 279885cfc34dd47c5af6850fabd78c1f605fd1d2
                  MATRIX: 913->1|1047->40|1075->42|1211->153|1232->166|1271->168|1319->190
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|37->6
                  -- GENERATED --
              */
          