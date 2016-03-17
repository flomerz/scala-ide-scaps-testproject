lazy val dependencies = Seq(
    "org.scalaz" %% "scalaz-core" % "7.2.1"
)

lazy val root = (project in file(".")).
  settings(
    name := "scala-ide-scaps-testproject",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies ++= dependencies
  )

 EclipseKeys.withSource := true
