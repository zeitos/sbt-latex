import bintray.Keys._

name := "sbt-latex"

organization := "zeitos"

version := "0.1.2"

scalaVersion := "2.10.4"

description := "SBT plugin to build LaTeX projects."

licenses := Seq("Public domain / ZeoS" -> 
  url("http://creativecommons.org/publicdomain/zero/1.0/"))

homepage := Some(url("https://github.com/zeitos/sbt-latex"))

////////////////////////////////////////////////////////////////////////////////

sbtPlugin := true

scalacOptions := Seq("-deprecation", "-unchecked", "-optimize")

////////////////////////////////////////////////////////////////////////////////
//settings := commonSettings ++ bintrayPublishSettings: _*

publishMavenStyle := false
repository in bintray := "sbt-plugins"
bintrayOrganization in bintray := None

credentials += Credentials(Path.userHome / ".ivy2" / "sbtcredentials")
