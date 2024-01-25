package b2;
import java.util.List;
public class Universidad {
    public static void main(String[] args) {

        Estudiante estudiante=new Estudiante("Mauricio","Muñoz",30,1144162);
        estudiante.setSemestre(1);

        List<Materias> listMaterias = List.of(new Materias("Matematicas"),new Materias("fisica"));

        estudiante.setMateriasList(listMaterias);
        System.out.println(estudiante.getNombre());
        estudiante.getMateriasList().stream().forEach(a-> System.out.println(a.nombre));



    }
}
