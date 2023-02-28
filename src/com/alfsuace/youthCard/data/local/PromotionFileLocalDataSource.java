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

import com.alfsuace.youthCard.domain.models.Promotion;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class PromotionFileLocalDataSource {

    private static PromotionFileLocalDataSource instance = null;

    private String nameFile = "promotions.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Promotion>>() {
    }.getType();

    private PromotionFileLocalDataSource() {
    }

    public void save(Promotion promotion) {
        List<Promotion> promotions = findAll();
        promotions.add(promotion);
        saveToFile(promotions);
    }

    public void saveList(List<Promotion> promotions) {
        saveToFile(promotions);
    }

    private void saveToFile(List<Promotion> promotions) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(promotions));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public Promotion findById(Integer promotionId) {
        List<Promotion> promotions = findAll();
        for (Promotion promotion : promotions) {
            if (Objects.equals(promotion.getId(), promotionId)) {
                return promotion;
            }
        }
        return null;
    }

    public List<Promotion> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()){
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
        return new ArrayList<Promotion>();
    }

    public void delete(String promotionId) {
        List<Promotion> newPromotionsList = new ArrayList<>();
        List<Promotion> promotions = findAll();
        for (Promotion promotion : promotions) {
            if (promotion.getId() != promotionId) {
                newPromotionsList.add(promotion);
            }
        }
        saveList(newPromotionsList);
    }

    public static PromotionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromotionFileLocalDataSource();
        }
        return instance;
    }
}

