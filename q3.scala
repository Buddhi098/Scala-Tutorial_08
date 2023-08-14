object FormatString{
    def main(args: Array[String]): Unit={
        var names: List[String] = List("Benny" , "Niroshan" , "Saman" , "Kumara") 
        formatName(names)
    }
    val toUpper = (str: String) => str.toUpperCase()
    val toLower = (str: String) => str.toLowerCase()
    def formatName(names : List[String]): Unit={
        println(toUpper(names(0)))
        println(toUpper(names(1).slice(0,2)) + toLower(names(1).slice(2,names(1).length)))
        println(toLower(names(2)))
        println(names(3).slice(0,5)+toUpper(names(3).slice(5 , 6)))
    }
}