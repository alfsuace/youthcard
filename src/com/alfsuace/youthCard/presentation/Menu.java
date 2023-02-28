package com.alfsuace.youthCard.presentation;

public class Menu {

    public void init(){
        //createNewBussinesForm();
        //listBussinesForm();
        //createUserForm();
        //listUserForm();
        //createPromotionForm();
        //listPromotionForm();
        //createPurchaseForm();
        //listPurchaseForm();
    }

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
        ListPurchaseForm listPurchaseForm = new ListPurchaseForm();
        listPurchaseForm.list();
        }

}
