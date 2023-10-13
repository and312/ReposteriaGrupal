
package datosbd;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.List;
import java.util.Map;

public class PostreProvider {
    CollectionReference reference;
    
    static Firestore db;
    
    public static boolean guardaPostre(String coleccion, String documento,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
    
    public static boolean existePostre(String coleccion, String nombrePostre) {
        try {
            Query query = db.collection(coleccion).whereEqualTo("Nombre de postres", nombrePostre);
            ApiFuture<QuerySnapshot> querySnapshot = query.get();
            List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();

            return !documents.isEmpty();

        } catch (Exception e) {
            System.out.println("Error al verificar existencia: " + e.getMessage());
            return false;
        }
    }
}
