package com.rockaport.kotlin.collections

class Samples {
    companion object {
        fun allSample() {
            println("allSample")

            val result = (1..10).all { it > 5 }
            println("${result::class}\n\t$result\n")
        }

        fun anySample() {
            println("anySample")

            val result = (1..10).any { it > 5 }
            println("${result::class}\n\t$result\n")
        }

        fun asReversedSample() {
            println("asReversedSample")

            val result = (1..10).reversed()
            println("${result::class}\n\t$result\n")
        }

        fun associateSample() {
            println("associateSample")

            val result = (1..10).associate { Pair(it, -1 * it) }
            println("${result::class}\n\t$result\n")
        }

        fun associateBySample() {
            println("associateBySample")

            var result = (1..10).associateBy { -1 * it }
            println("${result::class}\n\t$result\n")

            result = (1..10).associateBy({ it }, { -1 * it })
            println("${result::class}\n\t$result\n")
        }

        fun associateByToSample() {
            println("associateByToSample")

            val result = (1..10).associateByTo(HashMap<String, Int>(), { it.toString() })
            println("${result::class}\n\t$result\n")

            val result2 = (1..10).associateByTo(HashMap<String, Long>(), { it.toString() }, { it.toLong() })
            println("${result2::class}\n\t$result2\n")
        }

        fun associateToSample() {
            println("associateToSample")

            val result = (1..10).associateTo(HashMap<String, Int>(), { Pair(it.toString(), it) })
            println("${result::class}\n\t$result\n")
        }

        fun averageSample() {
            println("averageSample")

            val result = (1..10).average()
            println("${result::class}\n\t$result\n")
        }

        fun countSample() {
            println("countSample")

            var result = (1..10).count()
            println("${result::class}\n\t$result\n")

            result = (1..10).count { it > 5 }
            println("${result::class}\n\t$result\n")
        }

        fun filterSample() {
            println("filterSample")

            val result = (1..10).filter { it > 5 }
            println("${result::class}\n\t$result\n")
        }

        fun flatMapSample() {
            println("flatMapSample")

            val result = (1..10).flatMap({
                listOf(it.toString())
            })
            println("${result::class}\n\t$result\n")
        }

        fun flattenSample() {
            println("flattenSample")

            val result = listOf(1..10, 1..10).flatten()
            println("${result::class}\n\t$result\n")
        }

        fun foldSample() {
            println("foldSample")

            val result = (1..10).fold(0, { a, b -> a + b })
            println("${result::class}\n\t$result\n")
        }

        fun groupBySample() {
            println("groupBySample")

            val result = (1..10).groupBy { it < 5 }
            println("${result::class}\n\t$result\n")
        }

        fun intersectSample() {
            println("intersectSample")

            val result = (1..10).intersect(5..15)
            println("${result::class}\n\t$result\n")
        }

        fun mapToSample() {
            println("mapToSample")

            val result = (1..10).mapTo(mutableListOf(), {it.toString() + "c"})
            println("${result::class}\n\t$result\n")
        }
    }
}

fun main(args: Array<String>) {
    Samples.allSample()
    Samples.anySample()
    Samples.asReversedSample()
    Samples.associateSample()
    Samples.associateBySample()
    Samples.associateByToSample()
    Samples.associateToSample()
    Samples.averageSample()
    Samples.countSample()
    Samples.filterSample()
    Samples.flatMapSample()
    Samples.flattenSample()
    Samples.foldSample()
    Samples.groupBySample()
    Samples.intersectSample()
    Samples.mapToSample()
}