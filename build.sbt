val scala3Version = "3.3.3"

enablePlugins(JlinkPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    name := "thin-scala-container",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.typelevel" %% "cats-core" % "2.10.0",
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    jlinkIgnoreMissingDependency := JlinkIgnore.everything, // you should specify more preciously in production
    jlinkOptions += "--compress=2"
  )
