
// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/lab7b/conf/routes
// @DATE:Fri Dec 08 15:45:53 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
