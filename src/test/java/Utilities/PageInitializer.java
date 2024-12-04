package Utilities;

import Pages.*;

public class PageInitializer extends BaseClass {

// declaration
    public static ShopPage sp;
    public static HomePage hp;
    public static ProductPage pp;
    public static MyAccountLoginPage maLp;
    public static MyAccountRegisterPage maRp;

// initializing them inside this method
    public static void initialize(){
        sp = new ShopPage();
        hp = new HomePage();
        pp = new ProductPage();
        maLp = new MyAccountLoginPage();
        maRp = new MyAccountRegisterPage();
    }







}
