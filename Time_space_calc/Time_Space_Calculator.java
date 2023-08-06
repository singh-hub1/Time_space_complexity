package javaProgram;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class TestTime {

    public static void main(String[] args) {

        long start_time = System.currentTimeMillis();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage before = memoryBean.getHeapMemoryUsage();

        try (Scanner sc = new Scanner(new File("C:\\Users\\91937\\Desktop\\Programming\\C++\\Array_Pointers.cpp"))) {

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\n\nTotal time taken : (O) "+(((System.currentTimeMillis()-start_time)))+" ms");
        MemoryUsage after = memoryBean.getHeapMemoryUsage();
        
       
        long spaceComplexity = after.getUsed() - before.getUsed();
        System.out.println("Space complexity: " + spaceComplexity + " bytes");
    }

}

