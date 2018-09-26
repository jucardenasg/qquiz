
import java.util.*;

public class Universidad {
    private String nombre;
    private HashMap<Integer, Estudiante> estudiantes;
    private ArrayList<Proyecto> proyectos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new HashMap<>();
        this.proyectos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Retorna null si no existia una clave con dicho valor
    public boolean adicionarEstudiante(Estudiante estudiante){
        return estudiantes.put(estudiante.getCodigo(), estudiante) == null;
    }
    
    public boolean adicionarProyecto(String nombre){
        return proyectos.add(new Proyecto(nombre));
    }
    
    public boolean adicionarEstudianteProyecto(Estudiante estudiante, int pos){
        return proyectos.get(pos).adicionarEstudiante(estudiante);
    }
    
    public HashMap<Integer, Estudiante> listarEstudiantes(){
        return estudiantes;
    }
    
    public ArrayList<Proyecto> listarProyectos(){
        return proyectos;
    }
    public Estudiante buscarEstudiante(int codigo){
        return this.estudiantes.get(codigo);
    }
    
    
}
