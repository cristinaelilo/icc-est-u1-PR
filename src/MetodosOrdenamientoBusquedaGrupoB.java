import models.Carro;

public class MetodosOrdenamientoBusquedaGrupoB {

    // Bubble Sort Ascendente por año
    public void sortBYearWithBubbleAscendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() > carros[j + 1].getYear()) {
                    // Intercambiar carros[j] y carros[j+1]
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort Descendente por año
    public void sortBYearWithBubbleDescendente(Carro[] carros) {
        int n = carros.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (carros[j].getYear() < carros[j + 1].getYear()) {
                    // Intercambiar carros[j] y carros[j+1]
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
            }
        }
    }

    // Búsqueda Binaria por año (arreglo ordenado en forma descendente)
    public int searchBinaryByYear(Carro[] carros, int year) {
        int low = 0;
        int high = carros.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Debido a que los carros están ordenados de manera descendente
            if (carros[mid].getYear() == year) {
                return mid;
            }

            if (carros[mid].getYear() > year) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // El año no se encontró
    }

    // Método que imprime el listado de carros
    public void showCars(Carro[] cars) {
        for (Carro car : cars) {
            System.out.println("Carro: " + car.getName() + ", Año: " + car.getYear() + ", Modelo: " + car.getModel());
        }
    }
}
