package carlos.c.descartes.models;

import java.util.ArrayList;

public class SQLite implements IBaseDeDatos{
    @Override
    public boolean addStudent(ArrayList<Student> estudiantes) {
        return true;
    }
}
