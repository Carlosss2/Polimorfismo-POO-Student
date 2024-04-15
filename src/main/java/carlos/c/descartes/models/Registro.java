package carlos.c.descartes.models;

import java.util.ArrayList;

public class Registro {

    private IBaseDeDatos baseDeDatos;
    private ArrayList <Student> estudiantes=new ArrayList<>();

    public Boolean addAlumno(Student student){
        return estudiantes.add(student);
    }

    public void addBaseDatos(){
        baseDeDatos.saveStudent(estudiantes);
    }

    public void update(){
        baseDeDatos.updateStudent(estudiantes);
    }

    public ArrayList<Student> getEstudiantes() {
        return estudiantes;
    }

}
