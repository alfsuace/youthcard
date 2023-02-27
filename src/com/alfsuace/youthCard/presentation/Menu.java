package com.alfsuace.youthCard.presentation;

public class Menu {
    //Crear una empresa.
    //Listar empresas.
    //Crear usuario.
    //Listar usuarios.
    //Crear una promoción.
    //Listar las promociones.
    //Crear una compra.
    //Listar las compras.

     private void createNewBussinesForm(){
         NewBussinesForm newBussinesForm = new NewBussinesForm;
         newBussinesForm.createNewBussines();
     }
    listBussinesForm();
    createUserForm();
    listUserForm();

    createPromotionForm();
    listPromotionForm();
    createPurchaseForm();
    listPurchaseForm();

}
