package gui.crearclase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;

/**
 *
 * @author sound
 */
public class ClaseProvider {
    public static Firestore db;
    
    public static boolean crearClase(String coleccion, String documento, Map<String, Object> data) {
        db = FirestoreClient.getFirestore();
        boolean seGuardo = false;
        
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Clase creada correctamente");
            seGuardo = true;
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return seGuardo;
    }
}