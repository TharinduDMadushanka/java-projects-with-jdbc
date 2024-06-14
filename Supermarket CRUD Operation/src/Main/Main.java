package Main;

import View.CustomerView;
import View.ItemView;

public class Main {
    public static void main(String[] args) throws Exception {
        new ItemView().setVisible(true);
        new CustomerView().setVisible(true);
    }
}