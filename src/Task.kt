import java.time.LocalDateTime

class Task (
    private val name: String,
//    private val followUpDate: LocalDateTime,
//    private val followUpReport: String,

    //add iscomplete variable
    //add should report variable

){
    fun displayInfo(){
        println("Task: $name")
    }
}