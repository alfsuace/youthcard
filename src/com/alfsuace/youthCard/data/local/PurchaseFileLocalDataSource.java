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

import com.alfsuace.youthCard.domain.models.Purchase;
import com.alfsuace.youthCard.domain.models.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PurchaseFileLocalDataSource {

    private static PurchaseFileLocalDataSource instance = null;

    private String fileName = "purchases.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Purchase>>() {}.getType();

    private PurchaseFileLocalDataSource() {}

    public static PurchaseFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PurchaseFileLocalDataSource();
        }
        return instance;
    }

    public void save(Purchase purchase) {
        List<Purchase> purchases = findAll();
        purchases.add(purchase);
        saveToFile(purchases);
    }

    public void saveList(List<Purchase> purchases) {
        saveToFile(purchases);
    }

    private void saveToFile(List<Purchase> purchases) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(gson.toJson(purchases));
            fileWriter.close();
            System.out.println("Data saved successfully");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the data.");
            e.printStackTrace();
        }
    }

    public Purchase findById(Integer purchaseId) {
        List<Purchase> purchases = findAll();
        for (Purchase purchase : purchases) {
            if (Objects.equals(purchase.getId(), purchaseId)) {
                return purchase;
            }
        }
        return null;
    }

    public List<Purchase> findAll() {
        try {
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                scanner.close();
                return gson.fromJson(data, typeList);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while obtaining the list.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            throw new RuntimeException(e);
        }
        return new ArrayList<Purchase>();
    }

    public void delete(String purchaseId) {
        List<Purchase> newPurchaseList = new ArrayList<>();
        List<Purchase> purchases = findAll();
        for (Purchase purchase : purchases) {
            if (purchase.getId() != purchaseId) {
                newPurchaseList.add(purchase);
            }
        }
        saveList(newPurchaseList);
    }

}
