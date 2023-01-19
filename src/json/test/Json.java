package json.test;
import com.google.gson.Gson;
public class Json {

	public static void main(String[] args) {
		  String jsonInString = "{\"name\":\"MahaLakshmi\",\"age\":\"24\",\"address\":\"Thanjavur\"}";
		  Person person1= new Gson().fromJson(jsonInString, Person.class);
		  System.out.println(person1.getName());
		  System.out.println(person1.getAge());
		  System.out.println(person1.getAddress());
		  


	}

}
