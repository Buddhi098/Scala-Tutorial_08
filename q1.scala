
object Q1 {
    def main(args: Array[String]): Unit={
        print("Enter the deposit amount: ")
        val deposit = scala.io.StdIn.readDouble()

        println("Interest for deposit: " + calculateInterest(deposit))
        }
    def Interest(deposit:  Double):Double= deposit match{
        case i if i<=20000 => 0.02
        case i if i<=200000 => 0.04
        case i if i<=2000000 => 0.035
        case i if i>2000000 => 0.065
        }

    val calculateInterest = (deposit: Double) => deposit * Interest(deposit)

}