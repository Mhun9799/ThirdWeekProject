package menu


abstract class Menu {
    abstract fun displayInfo()
    abstract val name: String
    abstract val price: Int
    abstract val description: String
}

