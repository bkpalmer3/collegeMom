import java.time.LocalDateTime

class Task (
    private val name: String,
//    private val followUpDate: LocalDateTime,
//    private val followUpReport: String,

){
    fun displayInfo(){
        println("Task: $name")
    }
}