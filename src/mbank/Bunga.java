package mbank;

public class Bunga {
    public int rasioBunga(){
        return 0;
    }
    //nested class inner class
    public class BankPribadi extends Bunga {
        public int rasioBunga(){
            return 10;
        }
    }
    public class BankUmum extends Bunga {
        public int rasioBunga(){
            return 20;
        }
    }
    public class BankSyariah extends BankUmum {
        public int rasioBunga(){
            return 5;
        }
    }
    public class BankPasar extends BankUmum {
        public int rasioBunga(){
            return 15;
        }
    }
}

