
fun main() {
    val newUser = User("Mom", "131513")
    val task1 = Task("Spend 2 hours on saturday planning meals")
    val task2 = Task("Try one new recipe once a week")
    val newGoal = Goal("Meal prep once a week")
    val newPlan = Plan("Meal Prep", "I want to start meal prepping so that I can feed my kids healthy food", newGoal)

    newGoal.addTask(task1)
    newGoal.addTask(task2)
    newUser.addPlan(newPlan)
    newUser.displayInfo()
    }
