name := """string-reverse-client"""

version := "1.0"

scalaVersion := "2.11.5"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.reversestr"   %% "reverse-str" % "0.0.1-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.4"