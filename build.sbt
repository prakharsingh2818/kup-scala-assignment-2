ThisBuild / name := "KUPAssignment2"

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "ch.timo-schmid" %% "slf4s-api" % "1.7.30.2"
//libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.32"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.32"
//libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.32" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % Test
