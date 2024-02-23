package refactor.ref4;
public class Report {

    private void printTitle() {
        System.out.println("Título del Reporte");
    }

    private void printConclusion() {
        System.out.println("Conclusión del Reporte");
    }

    void printReport() {
        printTitle();


        System.out.println("Contenido 1");
        System.out.println("Contenido 2");


        printConclusion();
    }
}
