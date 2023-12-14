package sidemenu

import drinks.Drink
import menu.Menu

open class SideMenuList(override val name: String, override val price: Int, override val description: String) : Menu() {
    override fun displayInfo() {
        println("----------------------------------------------------------")
        println("1. Nugget King     | W 4.8 | 바삭~ 촉촉~ 한입에 쏙 부드러운 너겟킹!" )
        println("2. French Fries    | W 3.2 | 두툼한 프렌치프라이 라지사이즈를 1+1으로 즐기세요!")
        println("3. Hash Browns     | W 2.9 | 촉촉한 감자에 바삭함은 더했다!")
        println("4. Cheese Stick    | W 2.9 | 21cm의 역대급 사이즈!")
        println("0. 뒤로가기         | 뒤로가기")
        val drinkSelect = readln().toInt()
        if (drinkSelect == 0) return
        when (drinkSelect) {
            1 -> SideMenu("Nugget King", 3100,"자연을 담은 버거킹 RA인증커피").displayInfo()
            2 -> SideMenu("French Fries", 2600,"코카-콜라로 더 짜릿하게!").displayInfo()
            3 -> SideMenu("Hash Browns", 2500,"나를 깨우는 상쾌함!").displayInfo()
            4 -> SideMenu("Cheese Stick", 2900,"오렌지를 통으로 갈아넣은 주스!").displayInfo()
            else ->  {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}