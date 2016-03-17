lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.7",

    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.1"
  )

 EclipseKeys.withSource := true
