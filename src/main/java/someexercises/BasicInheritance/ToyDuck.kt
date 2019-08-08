package someexercises.BasicInheritance

class ToyDuck : Duck, Jump, Swim {
    constructor() : super(false, false, 0)

    override fun canJump() : Boolean = false
    override fun canSwim() : Boolean = false
}