package com.alfsuace.youthCard.data.local;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.alfsuace.youthCard.domain.models.Bussines;
import com.alfsuace.youthCard.domain.models.Promotion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class BussinesFileLocalDataSource {

    private static BussinesFileLocalDataSource instance = null;

    private String nameFile = "bussines.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Bussines>>() {
    }.getType();

    private BussinesFileLocalDataSource() {
    }

    public void save(Bussines bussines) {
        List<Bussines> bussinesList = findAll();
        bussinesList.add(bussines);
        saveToFile(bussinesList);
    }

    public void saveList(List<Bussines> bussinesList) {
        saveToFile(bussinesList);
    }

    private void saveToFile(List<Bussines> bussinesList) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(bussinesList));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }

    public Bussines findById(String bussinesId) {
        List<Bussines> bussinesList = findAll();
        for (Bussines bussines : bussinesList) {
            if (Objects.equals(bussines.getId(), bussinesId)) {
                return bussines;
            }
        }
        return null;
    }

    public List<Bussines> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<Bussines>();
    }

    public void delete(String bussinesId) {
        List<Bussines> newBussinesList = new ArrayList<>();
        List<Bussines> bussinesList = findAll();
        for (Bussines bussines : bussinesList) {
            if (bussines.getId() != bussinesId) {
                newBussinesList.add(bussines);
            }
        }
        saveList(newBussinesList);
    }

    public static BussinesFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new BussinesFileLocalDataSource();
        }
        return instance;
    }
}
