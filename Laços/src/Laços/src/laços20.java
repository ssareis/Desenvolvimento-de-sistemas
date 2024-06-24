/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class laços20 {
    
    private laços20() {
    }
    
    public static laços20 getInstance() {
        return laços20Holder.INSTANCE;
    }
    
    private static class laços20Holder {

        private static final laços20 INSTANCE = new laços20();
    }
}
