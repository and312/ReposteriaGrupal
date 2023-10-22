package datosbd;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;


public class Conexion {

    public static Firestore db;

    public static void conectarFirebase() {
        try {
            // Verificar si ya existe una instancia de FirebaseApp.
            List<FirebaseApp> firebaseApps = FirebaseApp.getApps();
            if(firebaseApps!=null && !firebaseApps.isEmpty()){ // Si no está vacío, ya hay una instancia de Firebase App.
                for(FirebaseApp app : firebaseApps){
                    if(app.getName().equals(FirebaseApp.DEFAULT_APP_NAME))
                        db = FirestoreClient.getFirestore(app);
                }
            } else { // Si está vacío, inicializamos una nueva instancia.
                FileInputStream sa = new FileInputStream("postres.json");

                FirebaseOptions options = FirebaseOptions.builder()
                        .setCredentials(GoogleCredentials.fromStream(sa))
                        .build();

                FirebaseApp.initializeApp(options); // Aquí ocurre la inicialización.
                db = FirestoreClient.getFirestore();
            }
            
            System.out.println("Éxito al conectar");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    } 
}
