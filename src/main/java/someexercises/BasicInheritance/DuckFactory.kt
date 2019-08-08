package someexercises.BasicInheritance

class DuckFactory{
    fun getDuck(type : String) : Duck? {
        return when(type){
            "EASY" -> ToyDuck()
            "REAL" -> RealDuck()
            else -> null
        }
    }
}