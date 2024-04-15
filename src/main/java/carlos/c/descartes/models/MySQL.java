package carlos.c.descartes.models;

import java.util.ArrayList;

public class MySQL implements IBaseDeDatos{
    @Override
    public boolean updateStudent(ArrayList<Student> estudiantes) {
        return true;
    }
    @Override
    public boolean saveStudent(ArrayList<Student> estudiantes) {
        return true;
    }
}
