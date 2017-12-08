
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(pageID: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.33*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en" id = """"),_display_(/*10.24*/pageID),format.raw/*10.30*/("""">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>Core Design - """),_display_(/*13.31*/pageID),format.raw/*13.37*/("""</title>
      
        <link href =""""),_display_(/*15.23*/routes/*15.29*/.Assets.versioned("stylesheets/Style.css")),format.raw/*15.71*/("""" rel = "stylesheet" type = "text/css"/>
        <link href =""""),_display_(/*16.23*/routes/*16.29*/.Assets.versioned("stylesheets/Form.css")),format.raw/*16.70*/("""" rel="stylesheet" type ="text/css"/>
      
    </head>
    <body>
        <div id ="Container">
            <div id = "Logo">
                <h1>Core Design</h1>
                <h3>
                    <em>Website Design and Development Services</em>
                </h3>
            </div>
            <div id ="Navigation">
                <ul>
                    <li><a href=""""),_display_(/*29.35*/routes/*29.41*/.HomeController.index()),format.raw/*29.64*/("""" class = "home">Home </a></li>
                    <li><a href=""""),_display_(/*30.35*/routes/*30.41*/.HomeController.about()),format.raw/*30.64*/("""" class = "about">About Us</a></li>
                    <li><a href="services" class = "services">Services </a></li>
                    <li><a href="clients" class = "clients">Clients </a></li>
                    <li><a href="contact" class = "contact">Contact Us</a></li>
                </ul>
            </div>
            <div id ="Content">
                """),_display_(/*37.18*/content),format.raw/*37.25*/("""
            """),format.raw/*38.13*/("""</div>
            <div id ="Footer">
                <h6>
                    <em>Copyright &copy; 2015 Core Design</em>
                </h6>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(pageID:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pageID)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pageID) => (content) => apply(pageID)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 15:54:28 GMT 2017
                  SOURCE: /media/sf_student/lab7b/app/views/main.scala.html
                  HASH: 34bfc42caa58b7efc479e74ae39a75e3047e0beb
                  MATRIX: 1206->260|1332->291|1360->293|1426->332|1453->338|1503->413|1539->422|1588->444|1615->450|1680->488|1695->494|1758->536|1848->599|1863->605|1925->646|2338->1032|2353->1038|2397->1061|2490->1127|2505->1133|2549->1156|2941->1521|2969->1528|3010->1541
                  LINES: 33->7|38->7|40->9|41->10|41->10|43->12|44->13|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|60->29|60->29|60->29|61->30|61->30|61->30|68->37|68->37|69->38
                  -- GENERATED --
              */
          