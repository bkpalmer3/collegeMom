class Goal (
    private val name: String,
    private val taskList: MutableList<Task> = mutableListOf(),
//    private val followUpReport: String,
    private val isComplete: Boolean = false,
    private val isReported: Boolean = true,
    //child class for eternal goals

    ){
    fun displayInfo(){
        println("Name: $name")
        for (task in taskList){
            task.displayInfo()
        }
    }
    fun addTask(task: Task){
        taskList.add(task)
    }
}