package com.demoFirebaseOpenShift.demoFirebaseOpenShift.serviceImp;

import com.demoFirebaseOpenShift.demoFirebaseOpenShift.dto.PersonaDTO;
import com.demoFirebaseOpenShift.demoFirebaseOpenShift.model.Persona;
import com.demoFirebaseOpenShift.demoFirebaseOpenShift.service.GenericServiceImpl;
import com.demoFirebaseOpenShift.demoFirebaseOpenShift.serviceApi.PersonaServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Firestore;

@Service
public class PersonaServiceImp extends GenericServiceImpl<Persona, PersonaDTO> implements PersonaServiceApi {

    @Autowired
    private Firestore firestore;

    @Override
    public CollectionReference getCollection() {
        return firestore.collection("personas");
    }

}