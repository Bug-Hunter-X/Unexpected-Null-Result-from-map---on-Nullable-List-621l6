fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) //Output: []

    val nullableList: List<Int?>? = null
    val nullableResult = nullableList?.map { it * 2 } ?: emptyList()
    println(nullableResult) // Output: []

    val nullableList2: List<Int?>? = null
    val nullableResult2 = nullableList2?.map { it * 2 }.orEmpty()
    println(nullableResult2) // Output: []
} 