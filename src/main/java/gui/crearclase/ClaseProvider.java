package gui.crearclase;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import datosbd.Conexion;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sound
 */
public class ClaseProvider {
    CollectionReference reference;
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
    
    public static void cargarCursos(JPanel pnlCurso) {   
        try {
            CollectionReference clases = Conexion.db.collection("Clase");
            ApiFuture<QuerySnapshot> querySnap = clases.get();
            for(DocumentSnapshot document : querySnap.get().getDocuments()) {
                ModalClase modalClase = new ModalClase();
                modalClase.cambiarNombreClase(document.getString("Nombre"));
                pnlCurso.add(modalClase);
                pnlCurso.updateUI();
            }
        }catch(InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
}
