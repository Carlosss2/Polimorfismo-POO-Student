package carlos.c.descartes.models;

import java.util.ArrayList;

public class MySQL implements IBaseDeDatos{
    @Override
    public boolean addStudent(ArrayList<Student> estudiantes) {
        return true;
    }
}