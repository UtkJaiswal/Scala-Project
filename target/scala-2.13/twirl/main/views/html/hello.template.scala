
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*2.1*/("""<!-- This is the hello page with name given like http://localhost:9000/hello?name=Guru this will display "Hello Guru" -->
<!-- In the first line we are accepting a parameter name which is of type string and an assetFinder -->
<!-- In the line below with main("Hello....") we are sending two varibles to main.scala.html with title as "Hello" and another html body -->
"""),_display_(/*5.2*/main("Hello")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<section id="top">
        <div class="wrapper">
            <h1>Hello """),_display_(/*8.24*/name),format.raw/*8.28*/("""</h1>
        </div>
    </section>
""")))}))
      }
    }
  }

  def render(name:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(name)(assetsFinder)

  def f:((String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (name) => (assetsFinder) => apply(name)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/hello.scala.html
                  HASH: bd6a138c1276c6e374b0ee32a750c72d62e587c5
                  MATRIX: 920->1|1066->52|1094->54|1490->425|1511->438|1550->440|1582->446|1682->520|1706->524
                  LINES: 27->1|32->1|33->2|36->5|36->5|36->5|37->6|39->8|39->8
                  -- GENERATED --
              */
          