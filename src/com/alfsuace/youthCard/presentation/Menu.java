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
    private void createUserForm(){
        NewUserForm newUserForm = new NewUserForm();
        newUserForm.createNewUser();
    }
    private void listUserForm(){
         ListUserForm listUserForm = new ListUserForm();
         listUserForm.list();
    }

    private void createPromotionForm(){
         NewPromotionForm newPromotionForm = new NewPromotionForm();
         newPromotionForm.createNewPromotion();
    }
    private void listPromotionForm(){
         ListPromotionForm listPromotionForm = new ListPromotionForm();
         listPromotionForm.list();
    }
    private void createPurchaseForm(){
         NewPurchaseForm newPurchaseForm = new NewPurchaseForm();
         newPurchaseForm.createPurchase();
        }
    private void listPurchaseForm(){

        }

}
