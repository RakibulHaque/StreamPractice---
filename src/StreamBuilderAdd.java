import java.util.stream.Stream;

public class StreamBuilderAdd {
	// Driver code 
    public static void main(String[] args) 
    { 
  
        // Declaring an empty Stream 
        Stream.Builder<String> str_b = Stream.builder(); 
  
        // Inserting elements into the stream 
        // using Stream.Builder add(T t) 
        str_b.add("Geeks"); 
        str_b.add("for"); 
        str_b.add("GeeksforGeeks"); 
        str_b.add("Data Structures"); 
        str_b.add("Geeks Classes"); 
  
        // Creating the String Stream 
        // The stream has now entered the built phase 
        Stream<String> s = str_b.build(); 
  
        // printing the elements 
        System.out.println("Stream successfully built"); 
        s.forEach(System.out::println); 
    } 
	

}
