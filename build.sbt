name := "graph-testing"

version := "0.1"

scalaVersion := "2.13.4"

val neo4jVersion = "4.2.3"
val scalaTestVersion = "3.2.2"
val neo4jDriverVersion = "4.2.1"

libraryDependencies ++= Seq(
  "org.neo4j" % "neo4j-kernel" % neo4jVersion,
  "org.neo4j" % "neo4j-io" % neo4jVersion,
  "org.neo4j" % "neo4j" % neo4jVersion,
  "org.neo4j.driver" % "neo4j-java-driver" % neo4jDriverVersion,
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
  "org.neo4j.test" % "neo4j-harness" % "4.2.3" % Test

)