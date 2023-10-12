package models

case class Student(name: String, username: String)

object MemoryModelStudent{
    def readData(): List[Student] ={
        val source = scala.io.Source.fromFile("studentdata.csv")
        val students = (for (line <- source.getLines()) yield{
            val parts = line.split(", ")
            val username = parts(2).split("@").head
        val name = parts(1)
        Student(name, username)
    }).toList
    source.close()
    return students
    }
}