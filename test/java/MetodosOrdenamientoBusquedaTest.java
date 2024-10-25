import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import models.Person;
import models.PersonasGenerator;

public class MetodosOrdenamientoBusquedaTest {

    private Person[] personas;
    private MetodosOrdenamientoBusqueda metodos;

    @BeforeEach
    public void setUp() {
        PersonasGenerator generator = new PersonasGenerator();
        personas = generator.generarPersonas();
        metodos = new MetodosOrdenamientoBusqueda();
    }

    @Test
    public void testSortByAgeWithSelection() {
        metodos.sortByAgeWithSelection(personas);
        for (int i = 1; i < personas.length; i++) {
            assertTrue(personas[i - 1].getAge() <= personas[i].getAge(),
                    "El arreglo no está ordenado correctamente por edad con Selection Sort.");
        }
    }

    @Test
    public void testSortByHeightWithSelection() {
        metodos.sortByHeightWithSelection(personas);
        for (int i = 1; i < personas.length; i++) {
            assertTrue(personas[i - 1].getHeight() <= personas[i].getHeight(),
                    "El arreglo no está ordenado correctamente por altura con Selection Sort.");
        }
    }

    @Test
    public void testSortByAgeWithInsertion() {
        metodos.sortByAgeWithInsertion(personas);
        for (int i = 1; i < personas.length; i++) {
            assertTrue(personas[i - 1].getAge() <= personas[i].getAge(),
                    "El arreglo no está ordenado correctamente por edad con Insertion Sort.");
        }
    }

    @Test
    public void testSortByHeightWithInsertion() {
        metodos.sortByHeightWithInsertion(personas);
        for (int i = 1; i < personas.length; i++) {
            assertTrue(personas[i - 1].getHeight() <= personas[i].getHeight(),
                    "El arreglo no está ordenado correctamente por altura con Insertion Sort.");
        }
    }

    @Test
    public void testSearchBinaryByAge() {
        metodos.sortByAgeWithSelection(personas); // Ordenar antes de buscar
        int ageToFind = 49;
        int result = metodos.searchBinaryByAge(personas, ageToFind);
        assertNotEquals(-1, result,
                "La persona con edad " + ageToFind + " no fue encontrada aunque debería estar en el arreglo.");
        assertEquals(ageToFind, personas[result].getAge(), "La persona encontrada no tiene la edad buscada.");
    }

    @Test
    public void testSearchBinaryByHeight() {
        metodos.sortByHeightWithSelection(personas); // Ordenar antes de buscar
        int heightToFind = 175;
        int result = metodos.searchBinaryByHeight(personas, heightToFind);
        assertNotEquals(-1, result,
                "La persona con altura " + heightToFind + " no fue encontrada aunque debería estar en el arreglo.");
        assertEquals(heightToFind, personas[result].getHeight(), "La persona encontrada no tiene la altura buscada.");
    }

    @Test
    public void testSearchBinaryByAgeNotFound() {
        metodos.sortByAgeWithSelection(personas); // Ordenar antes de buscar
        int ageToFind = 100; // Valor que no está en el arreglo
        int result = metodos.searchBinaryByAge(personas, ageToFind);
        assertEquals(-1, result,
                "La búsqueda binaria debería retornar -1 cuando el valor no se encuentra enel arreglo.");
    }

    // @Test
    // public void testSearchBinaryByHeightNotFound() {
    // metodos.sortByHeightWithSelection(personas); // Ordenar antes de buscar
    // int heightToFind = 205; // Valor que no está en el arreglo
    // int result = metodos.searchBinaryByHeight(personas, heightToFind);
    // assertEquals(-1, result,
    // "La búsqueda binaria debería retornar -1 cuando el valor no se encuentra en
    // el arreglo.");
    // }
}
