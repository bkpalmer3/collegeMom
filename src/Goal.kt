data class Goal (
    private val name: String,
    private val taskList: List<Task> = mutableListOf(),


    ){
}