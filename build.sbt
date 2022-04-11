ThisBuild / organization := "ch.koch"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.2"

lazy val domain = (project in file("domain"))
  .settings(
    // other settings
  )

lazy val domainimpl = (project in file("domainimpl"))
  .settings(
    // other settings
  ).dependsOn(domain)
