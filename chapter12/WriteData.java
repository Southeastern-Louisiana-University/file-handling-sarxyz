package chapter12;

public class WriteData {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("scores.txt");
        if (file.exists() ){
            System.out.println("file exists!");
            System.exit(0);
        }
        // create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // write to the file
        output.print("Charley Brown");
        output.println(12);
        output.print("Snoopy");
        output.println(2);

        // close the file
        output.close();

    }
}
