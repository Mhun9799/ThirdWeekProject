package bergers

import menu.Menu

open class BurgersMenu(override val name: String, override val price: Int, override val description: String) : Menu() {
    override fun displayInfo() {
        println( "----------------------------------------------------------")
        println("1. Real Whopper    | W 7.1| 불에 직접 구운 순 쇠고기 패티")
        println("2. Chicken King    | W 6.4| 더 풍부해진 프리미엄 치킨버거. 치킨킹!")
        println("3. Shrimp Burger   | W 5.9| 탱글한 새우패티에 새콤달콤 특제소스 듬뿍!")
        println("4. QuattroCheese   | W 8.3| 진짜 불맛을 즐겨라, 4가지 고품격 치즈")
        println("0. 뒤로가기         | 뒤로가기")
        val burgerSelect = readln().toInt()
        if (burgerSelect == 0) return
        when (burgerSelect) {
            1 -> Burger("Real Whopper", 7100,"불에 직접 구운 순 쇠고기 패티").displayInfo()
            2 -> Burger("Chicken King", 6400,"더 풍부해진 프리미엄 치킨버거. 치킨킹!").displayInfo()
            3 -> Burger("Shrimp Burger", 4500,"탱글한 새우패티에 새콤달콤 특제소스 듬뿍!").displayInfo()
            4 -> Burger("QuattroCheese", 7700,"진짜 불맛을 즐겨라, 4가지 고품격 치즈").displayInfo()
            else ->  {
                println("잘못된 번호를 입력했어요 다시 입력해주세요.")
                return
            }
        }
    }
}

