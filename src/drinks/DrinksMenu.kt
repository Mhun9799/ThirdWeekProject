package drinks

import menu.Menu


open class DrinksMenu(override val name: String, override val price: Int, override val description: String) : Menu(){
    override fun displayInfo() {
        println( "----------------------------------------------------------")
        println("1. Americano       | W 3.1 | 자연을 담은 버거킹 RA인증커피")
        println("2. Coca-Cola       | W 2.6 | 코카-콜라로 더 짜릿하게!")
        println("3. Sprite          | W 2.5 | 나를 깨우는 상쾌함!")
        println("4. Orange Juice    | W 2.9 | 오렌지를 통으로 갈아넣은 주스!")
        println("0. 뒤로가기         | 뒤로가기")
        val drinkSelect = readln().toInt()
        if (drinkSelect == 0) return
        when (drinkSelect) {
            1 -> Drink("Americano", 3100,"자연을 담은 버거킹 RA인증커피").displayInfo()
            2 -> Drink("Coca-Cola", 2600,"코카-콜라로 더 짜릿하게!").displayInfo()
            3 -> Drink("Sprite", 2500,"나를 깨우는 상쾌함!").displayInfo()
            4 -> Drink("Orange Juice", 2900,"오렌지를 통으로 갈아넣은 주스!").displayInfo()
            else ->  {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}