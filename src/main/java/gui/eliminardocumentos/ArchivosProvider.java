/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.eliminardocumentos;

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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jessica Trujillo
 */
public class ArchivosProvider {
   
    CollectionReference reference;
    
    static Firestore db;
    
    public static boolean guardaArchivos(String coleccion, String documento,
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
     public static boolean actualizarArchivos(String coleccion, String documento,
            Map<String, Object> data){
        
        db = FirestoreClient.getFirestore();
        
        try {
            DocumentReference docRef = db.collection(coleccion).document(documento);
            ApiFuture<WriteResult> result = docRef.update(data);
            System.out.println("Se actualizo correctamente");
            return true;
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }
     public static void cargarTablaArchivos(JTable table){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Descripcion");
        model.addColumn("Nombre");
        
        
        
        try {
            CollectionReference archivos = Conexion.db.collection("Archivos");
            ApiFuture<QuerySnapshot> querySnap = archivos.get();
            
            for(DocumentSnapshot document: querySnap.get().getDocuments()){
                model.addRow(new Object[]{
                    document.getId(),

                    document.getString("Descripcion"),
                    document.getString("Nombre"),
                   
                });
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: "+e.getMessage());
        }
        
        table.setModel(model);
    }
    public static boolean eliminarArchivos(String coleccion, String documento){
        
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
