package dessert

import menu.Menu

open class DessertsMenu(override val name: String, override val price: Int, override val description: String) : Menu() {
    override fun displayInfo() {
        println( "----------------------------------------------------------")
        println("1. PineappleCup    | W 3.2 | So Sweet! 파인애플 후룻컵!")
        println("2. Sundae vanilla  | W 2.2 | 향긋한 바닐라 향 때문에 더 맛있다!")
        println("3. Winter Sundae   | W 2.8 | 눈처럼 하얀 선데와 달콤한 기라델리")
        println("0. 뒤로가기")
        val dessertSelect = readln().toInt()
        if (dessertSelect == 0) return
        when (dessertSelect) {
            1 -> Dessert("PinappleCup", 3200,"So Sweet! 파인애플 후룻컵!").displayInfo()
            2 -> Dessert("Sundae vanilla", 2200,"향긋한 바닐라 향 때문에 더 맛있다!").displayInfo()
            3 -> Dessert("Winter Sundae", 2800,"눈처럼 하얀 선데와 달콤한 기라델리").displayInfo()
            else ->  {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}