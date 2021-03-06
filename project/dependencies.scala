import sbt._

object Dependencies {

  val finagleVersion = "6.41.0"
  val metricsVersion = "3.1.2"

  val finagleCore = "com.twitter"           %% "finagle-core"     % finagleVersion
  val metricsCore = "io.dropwizard.metrics" %  "metrics-core"     % metricsVersion
  val scalatest   = "org.scalatest"         %% "scalatest"        % "3.0.1"
  val junit       = "junit"                 %  "junit"            % "4.12"

  val appDependencies = Seq(
    metricsCore,
    finagleCore % "provided",
    scalatest % "test",
    junit % "test"
  )

  val appDependencyResolvers = Seq(
    "twttr" at "http://maven.twttr.com/"
  )

}
