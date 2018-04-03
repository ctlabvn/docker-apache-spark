name := "scala-spark-app-chapter09"
version := "1.1.1"
scalaVersion := "2.11.8"
val sparkVersion = "2.3.0"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % sparkVersion
//libraryDependencies +=  "org.scalanlp" %% "breeze" % "0.12"
//libraryDependencies +=  "org.scalanlp" %% "breeze-natives" % "0.12"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % sparkVersion
libraryDependencies +="org.jfree" % "jfreechart" % "1.0.14"
libraryDependencies += "com.github.wookietreiber" % "scala-chart_2.11" % "0.5.0"


resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"