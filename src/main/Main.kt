package main


import bergers.BurgersMenu
import dessert.DessertsMenu
import drinks.DrinksMenu
import menu.Menu
import sidemenu.SideMenuList


var cart = ArrayList<Menu>()

fun main() {
    val order = Order(cart)
    while (true) {
        println(
            """
            ----------------------------------------------    
                  "BurgerKing에 오신 걸 환영합니다!!"
            아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
                        
            [BURGERKING MENU]
            1. Burgers   | 믿고 먹을 수 있는 버거
            2. Dessert   | 신제품 윈터 선데 추가! 
            3. Drinks    | 겨울 한정메뉴 딥초코 핫 오픈!
            4. Side Menu | 프렌치프라이(L) 1+1 행사중!
            0. 종료
            ----------------------------------------------
            
            [ORDER MENU]
            5.Order      | 장바구니를 확인 후 주문합니다.
            6.Cancel     | 진행중인 주문을 취소합니다.
            0.종료
            ----------------------------------------------
    """.trimIndent()
        )
        val select = readln().toInt()
        if (select == 0 ) break // 루프 탈출
        when (select) {
            1 -> BurgersMenu("버거메뉴호출",0,"어떤 버거가 있지?").displayInfo()
            2 -> DessertsMenu("디저트 메뉴호출",0,"어떤 디저트가 있지?").displayInfo()
            3 -> DrinksMenu("드링크 메뉴호출",0,"어떤 드링크가 있지?").displayInfo()
            4 -> SideMenuList("사이드 메뉴 리스트 호출",0,"어떤 사이드메뉴가 있지?").displayInfo()
            5 -> order.order()
            6 -> order.cancel()
            else -> {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                continue
            }
        }
    }
    println("프로그램을 종료합니다.")
}
