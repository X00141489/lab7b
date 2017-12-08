
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
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
  """),format.raw/*4.54*/("""
 
  """),format.raw/*6.3*/("""<h3>
    Core Design is a profession web design and online 
    application development company based in Dublin, Ireland
  </h3>
  <h4>
    We specialise in the following areas:
    </h4>
    <ul>
      <li>Web Design</li>
      <li>Content Management</li>
      <li>Web application development</li>
      <li>Eccomerce and payment</li>
      <li>Security</li>
      <li>Search Engine Optimisation</li>
    </ul>


    <p>
      Please <a href ="ContactUs.html">contact us</a>
      to discuss your requirements 
    </p>
  """)))}),format.raw/*27.4*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 15:41:24 GMT 2017
                  SOURCE: /media/sf_student/lab7b/app/views/index.scala.html
                  HASH: 72a331e3fb6c15dde11d4bfa94d0887a5ea24435
                  MATRIX: 1030->3|1050->15|1089->17|1119->71|1150->76|1705->601
                  LINES: 33->3|33->3|33->3|34->4|36->6|57->27
                  -- GENERATED --
              */
          