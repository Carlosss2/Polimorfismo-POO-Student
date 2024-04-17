package carlos.c.descartes.models;


import java.util.ArrayList;

public class Registro {
    private ArrayList<IBaseDeDatos> listaEstudiantes=new ArrayList<>();
    private IBaseDeDatos baseDeDatos;
    private MySQL mySQL;
    private  SQL sql;
    private SQLite sqLite;
    public Registro(IBaseDeDatos baseDeDatos1){
        this.baseDeDatos=baseDeDatos;
        mySQL=new MySQL();
        sql=new SQL();
        sqLite=new SQLite();

        listaEstudiantes.add(mySQL);
        listaEstudiantes.add(sql);
        listaEstudiantes.add(sqLite);

    }

    public void save(Student student){
        for (IBaseDeDatos baseDeDatos1:listaEstudiantes){
            baseDeDatos1.saveStudent(student);
        }
    }
    public void update(Student student){
        for (IBaseDeDatos iBaseDeDatos:listaEstudiantes){
            iBaseDeDatos.updateStude(student);
        }
    }


    public MySQL getMySQL() {
        return mySQL;
    }

    public SQL getSql() {
        return sql;
    }

    public SQLite getSqLite() {
        return sqLite;
    }
}
