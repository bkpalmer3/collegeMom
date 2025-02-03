class Plan (
    private val title: String,
    private val description: String,
    private val goal: Goal, // list of goals rather than list
) {
    fun displayInfo(){
        println("Title: $title \nAbout: $description\n ")
        println(goal.displayInfo())
    }
}