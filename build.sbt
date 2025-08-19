val scala3Version = "3.7.2"

enablePlugins(JlinkPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    name := "thin-scala-container",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    jlinkIgnoreMissingDependency := JlinkIgnore.everything, // you should specify more preciously in production
    jlinkOptions += "--compress=2"
  )
