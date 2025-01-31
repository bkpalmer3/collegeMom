class User (
    private val userName: String,
    private val userId: String,
    private val planList: MutableList<Plan> = mutableListOf(),
//    private val email: String,
//    private val password: String,
//    private val profilePicture: String,
) {
    fun displayInfo(){
        println("Username: $userName")
        for (plan in planList){
            plan.displayInfo()
        }
    }
    fun addPlan(plan: Plan){
        planList.add(plan)
    }
}