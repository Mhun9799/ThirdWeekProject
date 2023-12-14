package bergers

import main.cart

class Burger(override val name: String, override val price: Int, override val description: String) : BurgersMenu(name, price, description) {

    override fun displayInfo(){
        println("""
            ----------------------------------------------------------
            "$name         | W ${price / 1000.0} | $description"
            위 메뉴를 장바구니에 추가하시겠습니까?
            ----------------------------------------------------------
            1. 확인 2.취소
        """.trimIndent())
        burgerFunction()
    }

    private fun burgerFunction() {
        val burgerSelect = readln().toInt()
        when (burgerSelect) {
            1 -> {
                cart.add(Burger(name, price,description)) // 장바구니에 추가
                println("$name 가 장바구니에 추가되었습니다.")
            }
            2 -> {
                cart.remove(Burger(name, price,description)) // 장바구니에서 제거
                println("$name 가 장바구니에서 제거되었습니다.")
            }
            else -> {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}


