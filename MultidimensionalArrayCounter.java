import java.util.ArrayList;
import java.util.List;

public class MultidimensionalArrayCounter {
    public static void main(String[] args) {
        int maxDimensions = 10; // adjust this to test higher dimensions
        int maxAxisSize = 10; // adjust this to test larger array sizes

        for (int dim = 3; dim <= maxDimensions; dim++) {
            System.out.println("Testing array with " + dim + " dimensions:");
            long startTime = System.currentTimeMillis();

            int[] arrayDimensions = new int[dim];
            for (int i = 0; i < dim; i++) {
                arrayDimensions[i] = maxAxisSize;
            }

            try {
                Object array = createMultidimensionalArray(arrayDimensions);
                long allocatedMemory = getAllocatedMemory(array);
                long endTime = System.currentTimeMillis();
                System.out.println("  Allocating " + array.getClass().getSimpleName() + " with " + allocatedMemory + " bytes took " + (endTime - startTime) + " ms");
            } catch (OutOfMemoryError e) {
                System.out.println("  Out of memory error! Cannot allocate array with " + dim + " dimensions and " + maxAxisSize + " size.");
                break;
            }
        }
    }

    private static Object createMultidimensionalArray(int[] dimensions) {
        Object array = null;
        int[] shape = new int[dimensions.length];
        for (int i = 0; i < dimensions.length; i++) {
            shape[i] = dimensions[i];
        }

        array = Array.newInstance(int.class, shape);
        return array;
    }

    private static long getAllocatedMemory(Object array) {
        // Approximate memory usage calculation (not entirely accurate, but good enough for our purposes)
        int size = 0;
        if (array instanceof int[]) {
            size = ((int[]) array).length * 4; // assuming 4 bytes per int
        } else if (array instanceof int[][]) {
            size = ((int[][]) array).length * ((int[][]) array)[0].length * 4;
        } else if (array instanceof int[][][]) {
            size = ((int[][][]) array).length * ((int[][][]) array)[0].length * ((int[][][]) array)[0][0].length * 4;
        }
        // ... add more cases for higher dimensions ...

        return size;
    }
}