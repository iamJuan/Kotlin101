package ch3.BasicInheritance

class RealDuck : Duck, Jump, Swim {
    constructor() : super(false, true, 1)

    override fun canJump() : Boolean = false
    override fun canSwim() : Boolean = true
}