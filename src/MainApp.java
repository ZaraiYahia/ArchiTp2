import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HI THERE

		EtudiantService serv=new EtudiantService();
		try {
			serv.inscription(2, "Guendouziiiii", "wassila", "guen@gmail.com","xxxx", 1);
		} catch ( e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
