package org.example;

import java.util.HashMap;
import java.util.Map;

public class Departament {
    public Map<Student, Integer> studentMarks;

    public Departament(){
        studentMarks = new HashMap<>();
    }



    public void addStudent(Student student, int mark){
        //Aqui verificamos si ya hay un estudiante con el mismo lastname
        Student existingStudent = null;

        for(Student s: studentMarks.keySet()){
            if(s.getLastname().equals(student.getLastname())){
                existingStudent = s;
                break;
            }
        }
        //El ciclo for itera sobre todos los estudiantes existentes por lo que puede ser complejidad O(n)

        //Aqui reemplazamos o agregamos el nuevo estudiante
        if(existingStudent != null){
            studentMarks.remove(existingStudent);
        }

        studentMarks.put(student, mark);
        // este tiene complejidad de O(1)

        /**
         * Aqui la complejidad puede ser de O(n)
         */
    }

    public void printStudents(){
        for(Map.Entry<Student, Integer> entry: studentMarks.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        /**
         * Aqui la complejidad
         * es de O(n) puesto que itera sobre todos los estudiantes
         */
    }
}
