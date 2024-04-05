class User Extends Account {
    public User (String name, String document, String email, String password){
        super (name, document, email,password);

    }
    void printDataUser(){
        system.out.println("document driver: " + document + "Name driver: "+ name+ "email: "
        + email + "password" + password);
    }
}