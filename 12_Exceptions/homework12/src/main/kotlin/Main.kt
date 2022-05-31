fun main() {
    repeat(3) {
        val wheel = Wheel()
        try {
            wheel.pumpUp()
        } catch (e: IncorrectPressure) {
            println("Incorrect pressure.")
        } finally {
            println("Work is done.")
        }
        try {
            wheel.checkPressure()
        } catch (e: TooHighPressure) {
            println("The pressure is too high. Operation impossible!")
        } catch (e: TooLowPressure) {
            println("The pressure is too low. Operation impossible!")
        } finally {
            println("Check done.")
        }
        println("---------------------*******---------------------")
    }
}

class TooHighPressure : Throwable(message = "The pressure is too high.")
class TooLowPressure : Throwable(message = "The pressure is too low.")
class IncorrectPressure : Throwable(message = "Incorrect pressure.")

class Wheel() {
    var currentPressure: Double = 0.0
    fun pumpUp() {
        println("What pressure to pump up to?")
        val value = readln().toDouble()
        when {
            (value < 0 || value > 10) -> throw IncorrectPressure()
            else -> {
                print("Pumping")
                repeat(5) {
                    print(" .")
                    Thread.sleep(1000)
                }
                println("")
                currentPressure = value
                println("Wheel inflated up to $currentPressure atm.")
            }
        }
    }

    fun checkPressure() {
        print("Pressure checking")
        repeat(5) {
            print(" .")
            Thread.sleep(1000)
        }
        println("")
        when {
            currentPressure < 1.6 -> throw TooLowPressure()
            currentPressure > 2.5 -> throw TooHighPressure()
            else -> println("Pressure in the wheel - $currentPressure atm. You can go!")
        }
    }
}