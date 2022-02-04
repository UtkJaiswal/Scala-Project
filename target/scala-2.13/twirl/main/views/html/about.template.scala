
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

"""),_display_(/*3.2*/main("Hello")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="/"><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAZsAAAB6CAMAAABeKQ5ZAAAA+VBMVEX///8wMDD0XBz0VADzTgAlJSUaGhrzSgAoKCgAAAD0Vwz0WRXzUQD95N0ODg7+XxqFhYXKysry8vL82dD3lHb7y74dHR31cEH+8e34pYz5rpn70sj5s59eXl73jm4UFBT1dkomLzAeLjFxcXFNRUIJLDGmpqb2flfr6+t5eXk2NjYVLTHd3d396OL6vKvvWx2NjY1LS0tVVVWenp72g178//Z+PyrYVSBMNS7lWB7EUCOysrJDQ0O/v7/f399paWn1aDNvPCyGQSqVRChAMy+qSSZbOC2gRye9TiRzPSv4noTQUyE3MTD6wrJAS0y2TCVVHwNVNy7zOgA1/SMTAAAN6klEQVR4nO1caUPiyBbNShISoqIiaiuNjogb4jLTPYML3T1Lj9POvOn//2Ne3cp2U7lZQBCmu84HhaRShDo5VafurUJRJCQkJCQkJCQkJCQkJCQkJKbFoLHoO5Cg0T42rO1F34QEhWejrmneWEpn6cBEowFca2fRtyKRBhdNAG98sei7kUC4NbQEUjpLhE2vrqXgbUnpLAduLU2Ea71Z9F1JMNHo9Qw12srnH5QfF31n3z32s6LR3MsPRz8okpzFYrdOieaXbldl3Cg/SnYWhw1KNNqfR6rKuZHSWRjW6zolGrWrxtxI6SwGG5ZLiOYnEE3CjdIeLPQmv0usu5Ro/gpEk3DzbBhv24u90+8OT5Ro3I+haCJueJDNtaR0XhHrGimaLwdqiptBGGQzjqV0XguUaLQVJBrOTfttHGSrG8+LvufvA41LSjTvfj3A1HT/frbw1EdK5zWwTYrmU0o06sGv77x0CSmduaMx9ghmBNGoR59WsqWM20Xf/LcNWjR/ZERDUMOk420u+v6/XVyQovn5fQXRBLCkdOaEnZeIRkpnjrjYIkXzb2XRhNLZX/QX+fbwhhTNb2fdlGjeF4kmlI4upTNTtGnR/H6WFs0fpcxI6cwatGj+qSKalcvspfX67qK/0bcCFHzBbV5FNCuXHw5+IY5L6cwGA1o0B4Jofqao+cxKHf2kZSvQpXRejmgtbQru5YeUaLqkaKJSXZWUzsaiv9p/HWgtrSCHCqLpRqVo6bjri/52/2XQogkWa5SMNOlSXfWvbBlXSmd60KL5JZZDgC+kaMRSRx+zhTRdk9KZCqRoNFcQDdPE7xlykiUdqOM7eEfURkinsTnYCTBju9CGOidcqA2XLGNyg0xvauKEk5FzJnRq0TqoVKGDf4ja6uK66cGxYXh6gFlvgmtYrM4JhcruxRD8fn81Qu88OTo66eFCvZMR/7cn4LAPh+9PVhMEJTmaoyGr9aH8tvp0siZjn1Vh2kmJRj3685JK6QjZ0CfLQwTqs+aG9QPGhNywTr2elnbTNyO0/Lu18GjPMf1hUmjomw7jauTYAkyVnb13TAynF1/VglqdvX7Zbd0rEBCgRpzLTL/GhhM3bFW0DirhjnTRuhBZ2/TSye7l5Gatg7+ZfxIcvbZV9TQpxN7Ze4pyYmYeUoe1+2r6sH3Nr2metqID/ppSDP4Y0IMO67QOhM88+MKb39U+EqL5SFjozFCzHSzgrXuWUb8EuMvJTS313VqP/OgJY8NPCvmsgQ+ZmnyxKeyakuGmFfCr2ojBkn5tL/j3LG580nIogG4rvQ4qZI3M6OiXQis98Yegbu1vzmvVxwy5MR3H8X3+nNf4M3zDmtuPu6IHpi3zhr0YqqcMvJzJX17BEMW56TgRrptwDdeY3fF9TtypUgi1Gb7YJ4M24hoBNtx3P3/KMJYTMsiM8wOuGuN2jstxZseNyUeI/og/6vwZH7H2r63hMi00xIcyigDc1IQxpe9wET4o/SGIrXNfeFtOfPUutVQQMp5dUSLiAfUsa7A1as9hm1Mz391us+MmZuHKDlsdRqGEjR5jqoNMHGt3czV5C9y0hA+CS+ygcxvV0lQScNCA9ESSk7XTomgO/qEyOnqWgmPoOI357uGdAzdNMAYwzvTZw27GRg0a328m11Tg5tBOLjmFtiu6q76DZNX8H2WBKTuNQRvnlXfvMx/WANnUj4vu5+WYAzfK0AwVAs/6Y3R0jzV0B11TgRswemb4Gnhyiu5qzUGTqaZ/9htJDmGn4w6ONM6u++nIznzYBsjGmvPSz3lww9/BQ3ylogEcvv4VuqYCN0BnLXzN7F1rr+iu7h00l2Kj2Rm9FoCw06FoKOMcLGjPcgMerf6UdysXuwzofYO9TbXxxfouB/xeC/zHoxm8D0gXuNmNa1kX6lsPq1Im4CZlov147AhQgRsQYFzt8PSxqRSg10G1g9PoHn1aIVqbnNHkGOcwZJDhZh24sXJDXTuW51no/b7lGeP4XWPDMwwPYAG7UBaNW+2v7H0wx01zs80Kfg1CZbesvi1U/9jwosRsGTc96NPgHTbRsYWOUIEbPqW9y2sBAUMsqyafRB18ISL9lJ2mjTMbnoLgdIabNzpk4nJvZYedNtB71gO6cVtuJKELHkjw0l4DDKBHcAPH3bfB6/16/JJjy40JKeMGhm0HnnFsogULXYkbCCWorVXxKI1DE81/muEEl0ySZew0bZwTW5fhBoab/C6tkJv9IOTnAnSooiI3jI9YqdNzM2xFIZfzTmIGHqF/Qxa6EjcjbvluxMMkrmwUg4i4gfklqQhkp3OMM1rLluHmLSPcy9/dVsDNLjd4hn45BlTXDRhDPXoapuWmeQIxAj/ws634uR/yyAG+huCmpojYg4AADpjmo4UdejMJDJ19KLbTR+R5ZpyTfi/DzRi4SUb73aftAE9BoxZwc8yu1G/xSFWNG7jOi8pMzI2qHjJc+dAPmWHXfwPkmObhoQltXEtlDAhu7KvDAIm+eJQBj/K58NVOElZA3KjdPDv94ajIOKM+L8MNn3gmP4o3sMIMjhFEdgq4gVEjPS2qxA3ILRHqFNxAvD/4MqfRE3xnByf43/SoTnATVGHbZhJ+abb4mFPonjnYRLeTBAaaqYDq2b/UeAJ2usA4F3GjC9xEUQi9jBsweF46PVqJGyZUdxyXmYKbGLX4uW+qcXjZtNMWmOQmBDINfU6seVronxU+ttWSwECam3w7Tfm4bK4tww0UQzOPgQcjexVunr3MlLUKN8/sFcqAvoQbGz3mj04gGkecnRRx4yDT0LzjwWi1hJz7mtpK+symmIg4+JW005SaPgurOghutty4AXnTjbcY3ArcgPnGMx+lGjes6jrKNE/OTavDEOQIWmj0Pt/jSbVzRQDFTSdAbZQquQd12iUZgl4Lxe6y3OTN+zPMUPHQDDe3rAl0IdB5YVTgBs7o6euKuXFvb49vIbDqoUsm5iboh5r3p3GOAJ2sZZOWBDedHG2cgJU2i8ecoYnDDgQ3eXY6TY2wCSSHm22Yewp72hpz4SaYCLH/Y2TZp5/fXNvpcH51bjLzmwjcgXdGeacBhzbuSilucu10wsy792QSIcPNJkwghb5pTtzE8JKN2y+IC/AJTt7JGJNwo5xAt9bJPa2IixNobvLsdADBOBdxwzNrXnod2Jy40Q1YZMV74ziT9wJu4hwBdTLGRNzwhF2rSDhm6oHI4SbXTmtZ41zEDTcDyNQC5sONPmhcXOy+GXMJRVbtBdzEcWjqZIwq3KytRtbr3E/bvwyAjCQwkMsNt9OUaKhFavncDLyMcObDTeTUd3X0NCwDN/eO6UdFIBdU0Kn1+YKC2IHkc0PbacI4F3Kj8IilgWcqiBuYi+JZTCE3Qtg0Nw7tJcJ5gmtQFYgbLe22lUyOoKXiOfr03Byi3BpPaWcqiQFhVfShRdxk7fTKzx8KFxIQ3Ay4h8JpAsQNWAU8+y/kBqb8qJ48bvi0NfTtUAvOHiFutlyxr83JEVAnY1TgBufmHotz0vd8hhWLtZgbIYpGG+dibpS3dd4TJoEbxA1EZnDUrJAbCP6jGEMuN0ri2zlNSGuIG8hepAMPOTkC4mSCCtxAbi40ALzPKkiz9XjIOw4MlHCDo895xrmEmzb3Tq61ET2/aO6pcBuXrGgr5AZCBZobqyCfGxhlxsFHQf1WMtohbmAgTAdTcY5glfcu9+RJjAo5gnM+wENVfdCiWZDIAW+IAgOl3ERZGzDOxaLJ4SYkR6tb4403g+fnTWjjiBuIG2je+Llx0QbsF3HDG5pxvBuUBUJobraTa/lebuN4M6wfccPdfd3dWW9E4uExm1NY/7/Hl2DaeNFGdW7sPWEfwRXPENyxWqGJnIKQ2mhC3aiBnS4wzmXcxL9h4NZ1SP7D4x9xE6wsdD0jAGMqnxvliVdTjwpredzAtWHkZj1dv4vM2QaPietevBA1iHXC+v8gSVDDrVidG9UW9hE8OEHb8Fr9XqaOBHwJaLLAtwo3sEqAWtZRlRtYsyEsUYx3EqyL+xkKuFH2xeX1pdwoz+Ky4sQ4j4N7isN96Ti0aabWzgqWOkJRHDoesO6d+IhfvG4gtd6qGjfUmtuJuFHaO66h15NmSnZ5tI8tfKKQG+a5DR23dTk3SmOcrh9Nap4sj52JuXlImtA2HSFLCSeJPQCqnVLCTWqbSLSPQDlXa1w0Lb8wmsZ9Q3Ec+gXI5QYa6c3+WLdCfEXm6QKfsKzAJm9/ZYWIWna3jzUjLvs15AYKo/EmfW1j5xbXjyY17QH75K/xYzKK1v93rm4ym5h6jkN0R+dqmsRHB+M67hVHey3Hv7opy609+LjjfD1uJCogNf2R3CwVhrXM2kHJzZJAWKsuuVkmYL/RdMpbvDoKchcSlZDy2Fe18iavCr94T5ZEOdJOrufY5a1eBTYxN5N4GfqzkY5fvLNEYjrMQDp2yf5fiWnxYul09qRo5oabl0jHLosTSbwID3etchKkaBaEm+mmOlI0r4GppNO5lqJ5FUwsHbswjycxSzycTiSd2nXpj7VJzA7D6tKxqWyTxBxxXlU6tSspmldHJenYTrUd8xKzRQXptO4q/GirxDywWiIdKZoF4lw185mRolkw8qXjVPr5D4k5Yo2WTus0s5Nb4vVBSUeKZkmwZgvSMaVolgcnqTVSTsWfaJN4FayZyQ/tqGW/pi/xyoikI0WzhODSMW0pmqXEoe9X+dU8iUXgXq5wkpCQkJCQkJCQkJCQkJCQkJgx/g9ihHCURqHcZQAAAABJRU5ErkJggg==" style="height: 2em;"></a>
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
    
        <div  class="container">
            <h1>About Gurukul-Bytes</h1>
            <p>
                Gurukul Bytes aims to bridge the gap between college academia and software industry expectations by providing various online and offline courses and workshops with focus on problem solving in coding.</p>
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
                  HASH: a56533cd3748094f5ee3d4aa09055cf15f7d8266
                  MATRIX: 913->1|1047->40|1077->45|1098->58|1137->60|1169->66
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          