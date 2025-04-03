package util;
/**
 * Write a description of class Util here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Util
{
    public void printArray(int[] array)
    {
        for (int i = 0; i < array.length; ++i)
        {
            System.out.print(array[i]);
            
            // Prüfen, ob wir nicht beim letzten Element sind.
            // Auf das letzte Element sollte kein Komma folgen.
            if (i < array.length - 1)
            {
                System.out.print(",");
            }
        }
        
        // Nach Ausgabe brechen wir die Zeile um, damit folgende Ausgaben
        // in einer neuen Zeile beginnen.
        System.out.println();
    }
    
    public int randomInt(int upperLimit)
    {
        double random = Math.random(); // Zufallszahl zwischen 0.0 und 1.0 holen.

        // Zufallszahl per Multiplikation auf 0.0-upperLimit skalieren
        random = random * upperLimit;
        
        // Nachkommastellen abschneiden und in Ganzzahlwert (int) umwandeln.
        int result = (int) random;
        
        return result;
    }
    
    public void fillArrayRandom(int[] array, int upperLimit)
    {
        for (int i = 0; i < array.length; ++i)
        {
            array[i] = randomInt(upperLimit);
        }
    }
    
    public int[] concatArray(int[] array0, int[] array1)
    {
        int[] result = new int[array0.length + array1.length];
        
        // Manuelles Kopieren mit Schleifen.
        for (int i = 0; i < array0.length; ++i)
        {
            result[i] = array0[i];
        }
        for (int i = 0; i < array1.length; ++i)
        {
            // Um array0.length verschoben einfügen.
            result[array0.length + i] = array1[i];
        }
        
        // Alternative Lösung unter Verwendung von System.arraycopy().
        // System.arraycopy(array0, 0, result, 0, array0.length);
        // System.arraycopy(array1, 0, result, array0.length, array1.length);
        
        return result;
    }
    
    public int findMax(int[] array)
    {
        int max = 0;
        int count = 0;
        boolean found = false;
        for (int i = 0; !found && i < array.length; ++i)
        {

            if (array[i] > max)
            {

                max = array[i];

            }
            count++;
        }


        return count;
    }
    
    public int firstMatch(int[] array0, int[] array1)
    {
        int count = 0;
        for (int i = 0; i < array0.length; i++)
        {

            for (int j = 0; j < array1.length; j++)
            {
                count++;
                if (array0[i] == array1[j])
                {
                    return array0[i];
                }
            }
        }
        return count;
    }
    
    public void fillArrayRandomRecursively(int[] array, int start, int upperLimit)
    {
        if (array.length - start <= 0)
        {
            return;
        }
        
        array[start] = randomInt(upperLimit);
        fillArrayRandomRecursively(array, start + 1, upperLimit);
    }
    
    public void testRandomFillRecursively()
    {
        Util util = new Util();
        int[] valueArray = new int[100];
        util.fillArrayRandomRecursively(valueArray, 0, 100);
        util.printArray(valueArray);
    }
}
