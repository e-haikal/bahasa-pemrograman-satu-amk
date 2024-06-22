/*
package lab.pertemuansembilan

open class Persegi {
    var p = 0.0
    var l = 0.0

    open fun hasil(): Double {
        return p*l
    }
}

class Balok:Persegi() {
    var t = 0.0
    fun input(p: Double, lb: Double, t: Double) {
        this.p = p
        l = lb
        this.t = t
    }
    override fun hasil(): Double {
        return super.hasil()*t
    }
}

class Limas : Persegi() {
    var t = 0.0

    fun input(p: Double, l: Double, t: Double) {
        this.p = p
        this.l = l
        this.t = t
    }

    override fun hasil(): Double {
        return (1.0/3.0) * super.hasil() * t
    }
}

fun main() {
    var b = Balok()
    b.input(10.0, 5.5, 7.5)
    println("Volume balok = " + b.hasil())

    val c = Limas()
    c.input(10.0, 5.5, 7.5)
    println("Volume limas = " + c.hasil())
}*/
