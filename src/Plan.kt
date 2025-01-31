class Plan (
    private val title: String,
    private val description: String,
    private val goal: Goal,
) {
    fun displayInfo(){
        println("Title: $title \nAbout: $description\n ")
        println(goal.displayInfo())
    }
}