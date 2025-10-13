package operator

//+a a.unaryPlus()
//-a a.unaryMinus()
//!a a.not()

//++a / a++ a.inc()
//--a / a-- a.dec()

//a + b a.plus(b)
//a - b a.minus(b)
//a * b a.times(b)
//a / b a.div(b)
//a % b a.rem(b)
//a..b a.rangeTo(b)

//a == b ------ a?.equals(b) ?: (b === null)
//a != b ------ !(a?.equals(b) ?: (b === null))
//a > b ------ a.compareTo(b) > 0
//a < b ------ a.compareTo(b) < 0
//a >= b ------ a.compareTo(b) >= 0
//a <= b ------ a.compareTo(b) <= 0

//a += b  -------  a.plusAssign(b)
//a -= b  -------  a.minusAssign(b)
//a *= b  -------  a.timesAssign(b)
//a /= b  -------  a.divAssign(b)
//a %= b  -------  a.remAssign(b)

//a in b  -------  b.contains(a)
//a !in b  --------  !b.contains(a)

//a[i]  ----------  a.get(i)
//a[i, j]  ----------  a.get(i, j)
//a[i_1, ..., i_n]  ----------  a.get(i_1, ..., i_n)
//a[i] = b  ----------  a.set(i, b)
//a[i, j] = b  ----------  a.set(i, j, b)
//a[i_1, ..., i_n] = b  ----------  a.set(i_1, ..., i_n, b)

//a()  ---------  a.invoke()
//a(i)  ---------  a.invoke(i)
//a(i, j)  ---------  a.invoke(i, j)
//a(i_1, ..., i_n)  ---------  a.invoke(i_1, ..., i_n)


fun main () {
    val counter1 = Counter(5)
    val counter2 = Counter(7)

    val counter1IsBigger = counter1 > counter2
    val result = counter1 + counter2

    println(counter1IsBigger)
    println(result.value)

    val jetBrains = Company(arrayOf(Person("Tom"), Person("Bob"), Person("Sam")))

    // получаем пользователей
    val firstPerson: Person? = jetBrains[0]
    println(firstPerson?.name) // Tom

    val fifthPerson: Person? = jetBrains[5]
    println(fifthPerson?.name) // null

    // устанавливаем пользователей
    jetBrains[0] = Person("Mike")
    println(jetBrains[0]?.name) // Mike

    val message1=Message("Hello")
    val message2 = message1("World")
    val message3 = message2("!!!")
    println(message3.text)  // Hello World !!!
}

class Counter (var value: Int) {
    operator fun compareTo(counter: Counter): Int{
        return this.value - counter.value
    }

    operator fun plus(counter: Counter): Counter {
        return Counter(this.value + counter.value)
    }

    override operator fun equals(other: Any?): Boolean{
        if(other is Counter) return this.value == other.value
        return false
    }

    operator fun plusAssign(counter: Counter){
        this.value += counter.value
    }
}

class Person(val name:String)
class Company(private val personal: Array<Person>){
    operator fun set(index: Int, person: Person){
        // если индекс есть в массиве personal
        if(index in personal.indices)
            personal[index] = person    // то переустанавливаем значение в массиве
    }
    operator fun get(index: Int): Person?{
        // если индекс есть в массиве personal
        if(index in personal.indices)
            return personal[index] // то возвращаем значение из массива
        return null // иначе возвращаем null
    }
}


class Message(val text: String){
    operator fun invoke(addition: String) : Message {
        return Message("$text $addition")
    }
}

//class Counter(val value: Int)
//
//operator fun Counter.compareTo(counter: Counter): Int {
//    return this.value - counter.value
//}
//
//operator fun Counter.plus(counter: Counter): Counter {
//    return Counter(this.value + counter.value)
//}