import java.util.*

internal var pcomp = PeopleHeightComparator()
        .thenComparing(PeopleAgeComparator())
        .thenComparing(PersonComparator())
internal var people = TreeSet(pcomp)

fun main() {
/*
    treeSet.add("Павлодар")
    treeSet.add("Кемерово")
    treeSet.add("Москва")
    treeSet.add("Ухань")
    treeSet.add("Ачинск")
    treeSet.add("Тюмень")
    treeSet.add("Якутия")*/

    println("Коронавирус обнаружен:")

    people.add(People("Иван", 25, 180))
    people.add(People("Степан", 16, 18))
    people.add(People("Степан", 20, 200))
    people.add(People("Степан", 20, 150))
    people.add(People("Алексей", 23, 100))

    for (p in people)
        println(p)

    }



