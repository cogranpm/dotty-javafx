val dottyVersion = "0.26.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    libraryDependencies += "org.openjfx" % "javafx-fxml" % "13",

    libraryDependencies += "org.openjfx" % "javafx-controls" % "13.0.2",

    libraryDependencies += "org.openjfx" % "javafx-base" % "13.0.2",

    libraryDependencies += "org.openjfx" % "javafx-graphics" % "13.0.2",

    libraryDependencies += "org.openjfx" % "javafx" % "13.0.2" pomOnly()

  )
