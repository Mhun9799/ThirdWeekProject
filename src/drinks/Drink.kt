package drinks


import dessert.DessertsMenu
import main.cart

class Drink(override val name: String, override val price: Int, override val description: String) : DessertsMenu(name, price, description) {

    override fun displayInfo(){
        println("""
            ----------------------------------------------------------
            "$name         | W ${price / 1000.0} | $description"
            위 메뉴를 장바구니에 추가하시겠습니까?
            ----------------------------------------------------------
            1. 확인 2.취소
        """.trimIndent())
        drinkFunction()
    }

    private fun drinkFunction() {
        val burgerSelect = readln().toInt()
        when (burgerSelect) {
            1 -> {
                cart.add(Drink(name, price,description)) // 장바구니에 추가
                println("$name 가 장바구니에 추가되었습니다.")
            }
            2 -> {
                cart.remove(Drink(name, price,description)) // 장바구니에서 제거
                println("$name 가 장바구니에서 제거되었습니다.")
            }
            else ->  {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}