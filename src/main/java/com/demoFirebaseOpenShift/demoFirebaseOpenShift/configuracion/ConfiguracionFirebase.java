package com.demoFirebaseOpenShift.demoFirebaseOpenShift.configuracion;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.InputStream;

@Configuration
public class ConfiguracionFirebase {

    @Bean
    public Firestore firestore(){
        String file = "serviceAccountKey.json";

        ClassLoader classLoader = getClass().getClassLoader();
        try(InputStream inputStream = classLoader.getResourceAsStream(file)){


            FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .build();

            FirebaseApp firebaseApp= FirebaseApp.initializeApp(options);

            return FirestoreClient.getFirestore(firebaseApp);

        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
