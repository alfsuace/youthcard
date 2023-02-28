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
         NewBussinesForm newBussinesForm = new NewBussinesForm();
         newBussinesForm.createNewBussines();
     }
    private void listBussinesForm(){
         ListBussinesForm listBussinesForm = new ListBussinesForm();
         listBussinesForm.list();
    }
    public void createUserForm(){
        NewUserForm newUserForm = new NewUserForm();
        newUserForm.createNewUser();
    }
    public void listUserForm(){
         ListUserForm listUserForm = new ListUserForm();
         listUserForm.list();
    }

    public void createPromotionForm(){
         NewPromotionForm newPromotionForm
    }
    listPromotionForm();
    createPurchaseForm();
    listPurchaseForm();

}
