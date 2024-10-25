import models.Person;

public class MetodosOrdenamientoBusqueda {

    public void sortByAgeWithSelection(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

    public void sortByHeightWithSelection(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[i];
            people[i] = people[minIndex];
            people[minIndex] = temp;
        }
    }

    public void sortByAgeWithInsertion(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public void sortByHeightWithInsertion(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > key.getHeight()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    public int searchBinaryByAge(Person[] people, int age) {
        int low = 0;
        int high = people.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (people[mid].getAge() == age) {
                return mid;
            } else if (people[mid].getAge() < age) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int searchBinaryByHeight(Person[] people, int height) {
        int low = 0;
        int high = people.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            } else if (people[mid].getHeight() < height) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
