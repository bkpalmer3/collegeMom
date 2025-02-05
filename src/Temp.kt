//Child class of Goal. Used for temporary goals that are marked off and completed
class Temp (
                name: String,
                private val isComplete: Boolean = false,
                private val isReported: Boolean = true,
) : Goal(name) {
}