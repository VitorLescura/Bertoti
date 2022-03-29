class mySingleton{
    static mySingleton singletonInstance;
    
    private mySingleton(){
    }
    public static mySingleton getInstance(){
        if(singletonInstance == null){
            singletonInstance = new singleton();
        }
        return singletonInstance;
    }
}
