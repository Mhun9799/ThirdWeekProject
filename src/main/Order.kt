package main

import menu.Menu

class Order(private val cart: ArrayList<Menu>) {
    companion object {
        const val BALANCE = 20000
    }
    private var balance: Int = BALANCE
    fun order() {
        if (cart.isEmpty()) { // 장바구니가 비어있는 경우
            println("장바구니에 상품이 없습니다.")
            return // 첫 화면으로 돌아가기
        }
        println("[ Orders ]") // 장바구니에 있는 목록 출력
        var total = 0 // 총 가격 초기화
        for (item in cart) { // 장바구니에 있는 각 아이템에 대해
            println("${item.name} | W ${item.price / 1000.0} | ${item.description}") // 아이템의 이름, 가격, 설명 출력
            total += item.price // 총 가격에 아이템의 가격 더하기
        }
        println("[ Total ]") // 총 가격 출력
        println("W ${total / 1000.0}")
        println("주문을 확인하시겠습니까?")
        println("1. 확인 2. 취소")
        val orderSelect = readln().toInt()
        if (balance >= total) { // 잔액이 총 가격보다 크거나 같은 경우
           when(orderSelect){
               1 -> { println("주문이 완료되었습니다.") // 주문 완료 메시지 출력
                   balance -= total // 잔액에서 총 가격 빼기
                   println("잔액이 ${String.format("%.2f", balance / 1000.0)}W 남았습니다.") // 잔액 출력
                   cart.clear() // 장바구니 비우기
                }
               2 ->  println("주문이 취소되었습니다.") // 주문 취소 메시지 출력

               else -> println("잘못된 번호를 입력했어요 다시 입력해주세요")
           }
        } else { // 잔액이 총 가격보다 작은 경우
            println("현재 잔액은 ${balance / 1000.0}W로 ${total / 1000.0 - balance / 1000.0}W이 부족해서 주문할 수 없습니다.") // 부족한 금액 출력
        }


    }
    fun cancel() {
        cart.clear()
        println("현재 주문이 취소되었습니다.")
    }
}
