package carlos.c.descartes.models;

import java.util.ArrayList;

public class SQL implements IBaseDeDatos{
    @Override
    public boolean updateStudent(ArrayList<Student> estudiantes) {
        return true;
    }
    @Override
    public boolean saveStudent(ArrayList<Student> estudiantes) {
        return true;
    }

}
