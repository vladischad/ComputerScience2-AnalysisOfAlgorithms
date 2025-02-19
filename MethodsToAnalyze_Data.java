// 
// Decompiled by Procyon v0.5.36
// 

public class MethodsToAnalyze_Data
{
    private static long statements;
    
    public static int find(final int[] array, final int n) {
        MethodsToAnalyze_Data.statements += 2L;
        for (int i = 0; i < array.length; ++i) {
            ++MethodsToAnalyze_Data.statements;
            if (array[i] == n) {
                return i;
            }
            MethodsToAnalyze_Data.statements += 2L;
        }
        return -1;
    }
    
    public static void replaceAll(final int[] array, final int n, final int n2) {
        ++MethodsToAnalyze_Data.statements;
        int i = find(array, n);
        ++MethodsToAnalyze_Data.statements;
        while (i > -1) {
            MethodsToAnalyze_Data.statements += 3L;
            array[i] = n2;
            i = find(array, n);
        }
    }
    
    public static void sortIt(final int[] array) {
        MethodsToAnalyze_Data.statements += 2L;
        for (int i = 1; i < array.length; ++i) {
            MethodsToAnalyze_Data.statements += 4L;
            int n;
            int n2;
            for (n = array[i], n2 = i; n2 > 0 && n < array[n2 - 1]; --n2) {
                MethodsToAnalyze_Data.statements += 4L;
                array[n2] = array[n2 - 1];
            }
            MethodsToAnalyze_Data.statements += 3L;
            array[n2] = n;
        }
    }
    
    public static void resetStatements() {
        MethodsToAnalyze_Data.statements = 0L;
    }
    
    public static long getStatements() {
        return MethodsToAnalyze_Data.statements;
    }
    
    static {
        MethodsToAnalyze_Data.statements = 0L;
    }
}