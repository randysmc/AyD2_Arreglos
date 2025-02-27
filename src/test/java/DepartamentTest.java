
import org.example.Departament;
import org.example.Student;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class DepartamentTest {

    //Atributos name y lastname
    //2 Metodos
    //--imprimir cada estudiante

    @Test
    public void testAddStudents(){
        Departament departament = new Departament();
        Student student1 = new Student("Jose", "Garcia");
        Student student2 = new Student("Carlos", "Lopez");
        Student student3 = new Student("Jaime", "Garcia");
        Student student4 = new Student("Mario", "Lopez");

        departament.addStudent(student1, 10);
        departament.addStudent(student2, 70);
        departament.addStudent(student3, 60);
        //departament.addStudent(student4,80);

        assertEquals(2, departament.studentMarks.size());
        assertEquals(70, (int) departament.studentMarks.get(student2));
        assertEquals(60, (int) departament.studentMarks.get(student3));
       
    }

    public void printStudent(){
        Departament departament = new Departament();
        Student student1 = new Student("Jose", "Garcia");
        Student student2 = new Student("Carlos", "Lopez");

        departament.addStudent(student1, 10);
        departament.addStudent(student2, 70);



    }


}
