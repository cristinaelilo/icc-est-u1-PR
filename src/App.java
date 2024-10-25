import models.Person;
import models.PersonasGenerator;
import models.Carro;
import models.CarrosGenerator;


public class App {
    public static void main(String[] args) throws Exception {
        // Generador de personas y métodos de ordenamiento
        PersonasGenerator personasGenerator = new PersonasGenerator();
    

        // Obtener el arreglo de personas generadas aleatoriamente
        Person[] personas = personasGenerator.generarPersonas();

        // Mostrar personas generadas
        System.out.println("Listado de personas generadas:");
        for (Person person : personas) {
            System.out.println(person);
        }

        MetodosOrdenamientoBusqueda methodsPersonas = new MetodosOrdenamientoBusqueda();
        methodsPersonas.sortByAgeWithSelection(personas);
        methodsPersonas.showPeople(personas);
        int resultado = methodsPersonas.searchBinaryByHeight(personas, 78);

        // Verificar resultado de la búsqueda
        if (resultado == -1) {
            System.out.println("No se encontró a ninguna persona con esa altura.");
        } else {
            System.out.println("Encontrado en la posición: " + resultado + " -> " + personas[resultado]);
        }

        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generados:");
        MetodosOrdenamientoBusquedaGrupoB metodos = new MetodosOrdenamientoBusquedaGrupoB();
        metodos.showCars(carros);

        // Ordenar y mostrar los carros en orden descendente por año
        System.out.println("\nListado de carros ordenados por año (descendente):");
        metodos.sortBYearWithBubbleDescendente(carros);
        metodos.showCars(carros);

        // Búsqueda binaria (debemos asegurarnos de que los datos estén ordenados correctamente)
        int yearToSearch = 2021; 
        int result = metodos.searchBinaryByYear(carros, yearToSearch);

        if (result == -1) {
            System.out.println("No se encontró un carro del año " + yearToSearch);
        } else {
            System.out.println("Carro encontrado en la posición " + result + ": " + carros[result]);
        }
    }
}