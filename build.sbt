name := "hello"

version := "0.1"

scalaVersion := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka"    %% "akka-actor"           % "2.3.5"

// For Akka 2.2.x
libraryDependencies += "com.typesafe.akka" % "akka-quartz-scheduler_akka-2.0.x_2.9.1" % "1.0.0"
