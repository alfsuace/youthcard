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

import com.alfsuace.youthCard.domain.models.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class UserFileLocalDataSource {

    private static UserFileLocalDataSource instance = null;

    private String nameFile = "users.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<User>>() {
    }.getType();

    private UserFileLocalDataSource() {
    }

    public void save(User user) {
        List<User> users = findAll();
        users.add(user);
        saveToFile(users);
    }

    public void saveList(List<User> users) {
        saveToFile(users);
    }

    private void saveToFile(List<User> users) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(users));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }


    public User findById(String userId) {
        List<User> users = findAll();
        for (User user : users) {
            if (Objects.equals(user.getNif(), userId)) {
                return user;
            }
        }
        return null;
    }

    public List<User> findAll() {
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
        return new ArrayList<User>();
    }

    public void delete(String userId) {
        List<User> newUsersList = new ArrayList<>();
        List<User> users = findAll();
        for (User user : users) {
            if (user.getNif() != userId) {
                newUsersList.add(user);
            }
        }
        saveList(newUsersList);
    }

    public static UserFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new UserFileLocalDataSource();
        }
        return instance;
    }
}
