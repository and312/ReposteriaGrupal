
package gui.tarea;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Precondition;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import datosbd.Conexion;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Yawar-Nicohl
 */
public class TareaProvider {
    CollectionReference reference;
    
    static Firestore db;
    
    public static boolean guardaTarea(String coleccion, String documento,
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
    
    public static void cargarTablaTarea(JTable table){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Titulo");
        model.addColumn("Instrucciones");
        model.addColumn("Nota");
        model.addColumn("Fecha");
        
        
        try {
            CollectionReference tareas = Conexion.db.collection("Tarea");
            ApiFuture<QuerySnapshot> querySnap = tareas.get();
            
            for(DocumentSnapshot document: querySnap.get().getDocuments()){
                model.addRow(new Object[]{
                    document.getId(),
                    document.getString("Titulo"),
                    document.getString("Instrucciones"),
                    document.getString("Nota"),
                    document.getString("Fecha")
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        table.setModel(model);
    }
    
    public static boolean eliminarTarea(String coleccion, String documento){
        
        db = FirestoreClient.getFirestore();
        
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.delete(Precondition.NONE);
            System.out.println("Eliminado correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
}
