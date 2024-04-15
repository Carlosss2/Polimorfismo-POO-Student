package carlos.c.descartes.models;

import java.util.ArrayList;

public interface IBaseDeDatos {
      boolean updateStudent( ArrayList<Student> estudiantes);

      boolean saveStudent(ArrayList<Student> estudiantes);
}
