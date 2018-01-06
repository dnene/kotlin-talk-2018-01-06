package tech.dnene.talkref.examples

import java.io.File

data class CountryData(val name: String, val visitors: List<Int>)
data class Result(val tourists2015: Int, val pctGrowth: Int, val maxCountry: String)

fun main(args: Array<String>) {
//  Open file
  File("data/tourists-to-india.csv")
      // Read all lines
      .readLines(Charsets.US_ASCII)
      // Drop the first line (column headers)
      .drop(1)
      // Drop the last line (file totals)
      .dropLast(1)
      // For each remaining row in the file
      .map { row ->
        // split into cells using a comma as the delimiter
        row.split(",")
            // for the array of cells in each row
            .let { array ->
              // create a pair. The first value is the continent name (array[1])
              // The second value is the CountryData ie.
              //    list of tourists from that country each year starting 2011
              array[1] to CountryData(array[0], array.drop(2).map { it.toInt() })
            }
      }
      // collate all country data for each continent into a list of countrydata
      // for that continent
      .groupBy({it.first}, { it.second })
      // for each continent
      .map { (continent, countriesData) ->
        // compute tourists from across the continent in 2001
        val tourists2001 = countriesData.sumBy { it.visitors[0] }
        // compute tourists from across the continent in 2015
        val tourists2015 = countriesData.sumBy { it.visitors[14] }
        // compute percentage growth
        val pctGrowth = (tourists2015 - tourists2001) * 100 / tourists2001
        // now we want to find out which country in that continent sent
        // the maximum number of tourists
        val maxCountry = countriesData
            // sort data based on 14th element in the list ie. visitors for 2015
            .sortedByDescending { it.visitors[14] }
            // take the first country data and specifically its name attribute
            .first().name
        // construct a pair of continent to result
        continent to Result(tourists2015, pctGrowth, maxCountry)
      }
      // sort the continent result pairs based on the percentage growth
      .sortedByDescending { it.second.pctGrowth }
      // display the results
      .forEach { println(it) }
}