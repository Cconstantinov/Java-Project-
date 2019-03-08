 import java.util.Scanner;
    import java.io.*;


    public class Citeste {
    public static void main(String[] args) {
    	
        String readLine;
        String inFilePath = "CitesteDin.txt"; 
        String outFilePath = "ScrieIn.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inFilePath));
                Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFilePath)))
           ) {
               while ((readLine = bufferedReader.readLine()) != null) {
                   String cuv = readLine;
                   System.out.println(readLine);

                  writer.write(cuv);
                  writer.write(System.lineSeparator());
               }
           } catch (IOException e) {
               System.out.println("Error.");
               e.printStackTrace();
           }
    }}
    