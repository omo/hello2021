val scala3Version = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,

    Compile / mainClass := Some("hello"),

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )