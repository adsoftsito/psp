
import java.util.*;

/**
 * @author Adolfo Centeno
 */
public class Logic2a {

    /**
     * Default constructor
     */
    public Logic2a() {
    }

    /**
     * 
     */
    private String programName;

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private String [] arrData;

    /**
     * 
     */
    private int lineCounter;

    /**
     * 
     */
    private int methodCounter;

    /**
     * 
     */
    public void logic2a() {
        // TODO implement here
        Input myInput = new Input(); // ++ 
        Data myData = new Data();   // ++
        LineCounter myLineCounter = new LineCounter(); // ++
        MethodCounter myMethodCounter = new MethodCounter(); // ++
        OutPut myOut = new OutPut(); // ++

        System.out.println("exec logic2a..."); // ++
 
        programName = "App.java"; // ++  
        data = myInput.readData(programName); // ++
        System.out.println(data); // ++
        arrData = myData.saveData(data); // ++
        System.out.println(arrData); // ++

        lineCounter = myLineCounter.count(arrData); // ++
        System.out.println(lineCounter); // ++

        methodCounter = myMethodCounter.count(arrData); // ++
        System.out.println(methodCounter); // ++
       
        myOut.writeData("out.txt", " total LOC " + lineCounter); // ++
        myOut.writeData("out.txt", " total methods " + methodCounter); // ++


    }

}
