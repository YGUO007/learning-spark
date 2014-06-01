/**
 * Saves a sequence file of people and how many pandas they have seen.
 */
package com.oreilly.learningsparkexamples.scala

import com.oreilly.learningsparkexamples.proto.Places

import org.apache.spark._
import org.apache.spark.SparkContext._

object BasicSaveProtoBuf {
    def main(args: Array[String]) {
      val master = args(0)
      val outputFile = args(1)
      val sc = new SparkContext(master, "BasicSaveProtoBuf", System.getenv("SPARK_HOME"))
      val dnaLounge = Places.Venue.newBuilder()
      dnaLounge.setId(1);
      dnaLounge.setName("DNA Lounge")
      dnaLounge.setType(Places.Venue.VenueType.CLUB)
      val data = sc.parallelize(List(dnaLounge))
    }
}
