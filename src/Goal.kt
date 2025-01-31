data class Goal (
    private val name: String,
    private val taskList: MutableList<Task> = mutableListOf(),


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