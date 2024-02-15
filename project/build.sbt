val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("1.7.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % scalaJSVersion)
