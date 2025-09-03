package lesson_16

private val supportInfo = ""

class HitchhikerGuide {

    var title = ""
    private var numberOfPages = 999

    fun getNumberOfPages() = numberOfPages

    fun setNumberOfPages(number: Int) : Int{
        if(number >= 0) numberOfPages = number
        return numberOfPages
    }

    fun chooseArticle() {
        println("Open catalog")
    }

}

class Support {
    fun printInfo(){
        println(HitchhikerGuide::class.simpleName)
        println(HitchhikerGuide().title)
        println(supportInfo)
    }
}